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

    public void queryDataByCatergory() {
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
            queryDataByName();
        }
        System.out.println("Number of files created: " + iter.size());
    }

    public void queryDataByName() {
        String queryString = getQueryString();
        if (queryString == null) {
            return;
        }
        System.out.println(queryString);
        Query query = QueryFactory.create(queryString);

        QueryExecutionHTTP qExecution = QueryExecutionHTTP.service("https://dbpedia.org/sparql", query);
        try {
            // String fileName = this.name;
            // if (this.name.contains("dbr:")) {
            // fileName = this.name.replaceAll("dbr:", "");
            // }
            // fileName = fileName.split(Matcher.quoteReplacement("\\"))[0];
            String fileName = this.name.replaceAll("[^\\p{IsAlphabetic}\\p{IsDigit}]", "");
            if (fileName.contains("dbr"))
                fileName = fileName.replaceAll("dbr", "");
            File myObj = new File("D:\\TOM\\Java programming\\OOP Project Query\\QueryResults\\" + fileName + ".ttl");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File named: " + myObj.getName() + " exists.\nOveriding!");
            }

            OutputStream myWriter = new FileOutputStream(myObj);
            System.out.println("Start the process");
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

    public String setEscape(String name) {
        if (name.contains("("))
            name = name.replaceAll("\\(", Matcher.quoteReplacement("\\("));

        if (name.contains(")"))
            name = name.replaceAll("\\)", Matcher.quoteReplacement("\\)"));

        if (name.contains("-"))
            name = name.replaceAll("\\-", Matcher.quoteReplacement("\\-"));

        return name;
    }
}