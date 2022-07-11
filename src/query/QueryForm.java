package query;

import org.apache.jena.arq.querybuilder.ConstructBuilder;
import org.apache.jena.query.Query;
import org.apache.jena.sparql.function.library.langeq;
import org.apache.jena.sparql.lang.sparql_11.ParseException;

public class QueryForm {
    protected ConstructBuilder sb = new ConstructBuilder();;
    protected String name;

    protected void setName(String name) {
        this.name = name;
    }

    public QueryForm(String name) {
        this.name = name;

        this.sb.addPrefix("geo", "http://www.w3.org/2003/01/geo/wgs84_pos#");
        this.sb.addPrefix("rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#");
        this.sb.addPrefix("dbo", "http://dbpedia.org/ontology/");
        this.sb.addPrefix("rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#");
        this.sb.addPrefix("rdfs", "http://www.w3.org/2000/01/rdf-schema#");
        this.sb.addPrefix("yago", "http://dbpedia.org/class/yago/");
        this.sb.addPrefix("dbr", "http://dbpedia.org/resource/");
        this.sb.addPrefix("dbp", "http://dbpedia.org/property/");
        this.sb.addPrefix("gold", "http://purl.org/linguistics/gold/");
        this.sb.addPrefix("dct", "http://purl.org/dc/terms/");
        this.sb.addPrefix("dbc:", "http://dbpedia.org/resource/Category:");
    }

    public void addTripleToConstruct(String triple) {
        String tripleNodes[] = triple.split(" ");
        this.sb.addConstruct("?s", tripleNodes[0], tripleNodes[1]);
    }

    public void addTripleToWhere(String triple) {
        String tripleNodes[] = triple.split(" ");
        this.sb.addWhere("?s", tripleNodes[0], tripleNodes[1]);
    }

    public void addTripleToWhere(String p, String o) {
        this.sb.addWhere("?s", p, o);
    }

    public void addOptionalToWhere(String triple) {
        String tripleNodes[] = triple.split(" ");
        this.sb.addOptional("?s", tripleNodes[0], tripleNodes[1]);
    }

    public void addLanguageFilter(String node, String languages[]) throws ParseException {
        String langs = "";
        for (int i = 0; i < languages.length; i++) {
            langs += "lang(" + node + ") = " + "\"" + languages[i] + "\"";
            if (i != languages.length - 1)
                langs += "||";
        }
        this.sb.addFilter(langs);
    }
}
