package query;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.sparql.exec.http.QueryExecutionHTTP;
import org.apache.jena.sparql.lang.sparql_11.ParseException;
import org.apache.jena.query.*;

import java.util.List;
import java.util.regex.Matcher;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class QueryActions extends QueryForm {

    public QueryActions(String name) throws ParseException {
        super(name);
        this.name = setEscape(this.name);
    }

    private String getQueryString() {
        try {
            QueryFactory.create(this.sb.buildString());
        } catch (QueryParseException e) {
            e.printStackTrace();
            return null;
        }
        return this.sb.buildString().replaceAll("\\?s ", Matcher.quoteReplacement(this.name + ' '));
    }

    public void queryDataByCatergory(String subject) throws IOException {
        Query query;
        try {
            query = QueryFactory.create(this.sb.buildString());
        } catch (QueryParseException e) {
            e.printStackTrace();
            return;
        }
        QueryExecutionHTTP qExecution = QueryExecutionHTTP.service("https://dbpedia.org/sparql", query);
        Model results = qExecution.execConstruct();
        List<Resource> iter = results.listSubjects().toList();
        for (int i = 0; i < iter.size(); i++) {
            this.changeName("dbr:" + iter.get(i).getLocalName());
            queryDataByName(subject);
        }
        System.out.println("Number of files created: " + iter.size() + "\n");
    }

    public void queryDataByName(String subject) throws IOException {
        subject = getValidFileName(subject);
        String queryString = getQueryString();

        String currentPath = new java.io.File(".").getCanonicalPath();
        String filePath = currentPath + "\\QueriedFiles\\" + subject;
        File theDir = new File(filePath);
        if (!theDir.exists()) {
            System.out.println("Created folder: " + subject + "\n");
            theDir.mkdirs();
        }

        if (queryString == null) {
            return;
        }
        Query query = QueryFactory.create(queryString);

        QueryExecutionHTTP qExecution = QueryExecutionHTTP.service("https://dbpedia.org/sparql", query);
        try {
            String fileName = getValidFileName(this.name);
            File myObj = new File(
                    filePath + "\\" + fileName
                            + ".ttl");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File named: " + myObj.getName() + " exists.\nOveriding!");
            }

            OutputStream myWriter = new FileOutputStream(myObj);
            System.out.println("Start writing to file ... ");
            Model results = qExecution.execConstruct();
            RDFDataMgr.write(myWriter, results, Lang.TURTLE);
        } catch (IOException err) {
            err.printStackTrace();
        } finally {
            System.out.println("Finished!\n");
            qExecution.close();
        }
    }

    public void changeName(String newName) {
        newName = setEscape(newName);
        this.name = newName;
    }

    private String setEscape(String name) {
        if (name.contains("("))
            name = name.replaceAll("\\(", Matcher.quoteReplacement("\\("));

        if (name.contains(")"))
            name = name.replaceAll("\\)", Matcher.quoteReplacement("\\)"));

        if (name.contains("-"))
            name = name.replaceAll("\\-", Matcher.quoteReplacement("\\-"));

        return name;
    }

    private String getValidFileName(String fileName) {
        fileName = fileName.replaceAll("[^\\p{IsAlphabetic}\\p{IsDigit}]", "");
        if (fileName.contains("db")) {
            fileName = fileName.substring(3);
        }
        return fileName;
    }
}
