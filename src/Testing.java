import java.io.FileNotFoundException;
import org.apache.commons.text.*;
import org.apache.jena.sparql.lang.sparql_11.ParseException;

public class Testing {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        // QueryActions test = new QueryActions("dbr:Ba_Bể_National_Park");

        // // Set the query triples and operators ONCE for each category
        // // Note: Always use optional, no triples in WHERE (to avoid inconsistent
        // data)
        // test.addOptionalToWhere("dbo:abstract ?abstract");
        // test.addOptionalToWhere("dbp:name ?name");
        // test.addTripleToConstruct("dbo:abstract ?abstract");
        // test.addTripleToConstruct("dbp:name ?name");
        // test.addLanguageFilter("?abstract", "en");
        // test.addLanguageFilter("?name", "en");

        // test.queryDataByName();

        // test.changeName("dbr:Cúc_Phương_National_Park");
        // test.queryData();
        // // Change the name to each other place in that category
        // test.changeName("dbr:Kon_Ka_Kinh_National_Park");
        // test.queryData();

        // Do it all over again for the next category

        QueryActions test = new QueryActions("dbr:West_Lake_(Hanoi)");

        // Set the query triples and operators ONCE for each category
        // Note: Always use optional, no triples in WHERE (to avoid inconsistent data)

        test.addTripleToWhere("dct:subject dbc:Lakes_of_Hanoi");
        test.addTripleToWhere("rdf:type dbo:Lake");
        test.addOptionalToWhere("dbo:abstract ?abstract");
        test.addOptionalToWhere("dbp:name ?name");
        test.addTripleToConstruct("dbo:abstract ?abstract");
        test.addTripleToConstruct("dbp:name ?name");
        // test.addLanguageFilter("?abstract", "en");
        // test.addLanguageFilter("?name", "en");

        test.queryDataByName();
    }
}
