import org.apache.jena.arq.querybuilder.ConstructBuilder;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ResIterator;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.sparql.exec.http.QueryExecutionHTTP;
import org.apache.jena.sparql.lang.sparql_11.ParseException;
import java.util.Set;
import org.apache.commons.codec.Resources;

import javax.print.PrintException;

import java.util.HashSet;
import java.util.List;

import org.w3c.dom.Node;

import arq.query;

import org.apache.jena.query.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.regex.Matcher;

public class Helper {
    public static void main(String[] args) {
        String name = "(City)";
        if (name.contains("("))
            name = name.replaceAll("\\(", Matcher.quoteReplacement("\\("));

        if (name.contains(")"))
            name.replaceAll("\\)", Matcher.quoteReplacement("\\)"));

        if (name.contains("-"))
            name.replaceAll("\\-", Matcher.quoteReplacement("\\-"));

        System.out.println(name);
        // System.out.println("(CIty)".replaceAll("\\(",
        // Matcher.quoteReplacement("\\(")));
    }
}
