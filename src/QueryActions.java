import org.apache.jena.arq.querybuilder.ConstructBuilder;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.sparql.exec.http.QueryExecutionHTTP;
import org.apache.jena.sparql.lang.sparql_11.ParseException;
import java.util.Set;

import javax.print.PrintException;

import java.util.HashSet;
import org.w3c.dom.Node;

import arq.query;

import org.apache.jena.query.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class QueryActions extends QueryForm {

    public QueryActions(String name) throws ParseException {
        super(name);
    }

    private String getQueryString() {
        try {
            QueryFactory.create(this.sb.buildString());
        } catch (QueryParseException e) {
            e.printStackTrace();
            return null;
        }
        return this.sb.buildString().replaceAll("\\?s ", this.name + ' ');
    }

    public void queryData() {
        String queryString = getQueryString();
        Query query = QueryFactory.create(queryString);

        QueryExecutionHTTP qExecution = QueryExecutionHTTP.service("https://dbpedia.org/sparql", query);
        try {
            File myObj = new File(this.name.split(":")[1] + ".ttl");
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
            System.out.println("Finished!");
            qExecution.close();
        }
    }

    public void changeName(String newName) {
        this.name = newName;
    }
}
