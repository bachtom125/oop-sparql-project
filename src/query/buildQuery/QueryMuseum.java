package query.buildQuery;

import java.io.IOException;

import org.apache.commons.compress.harmony.pack200.Segment.PassException;
import org.apache.jena.sparql.lang.sparql_11.ParseException;

import query.QueryActions;

public class QueryMuseum extends QueryCategory {

    public QueryMuseum() throws ParseException, IOException {

        QueryActions Museum = new QueryActions("?s");

        Museum.addTripleToWhere("dct:subject dbc:Museums_in_Vietnam");
        Museum.addTripleToConstruct("dbo:abstract ?abstract");
        Museum.addTripleToConstruct("dbp:name ?name");
        Museum.addTripleToConstruct("rdf:type yago:Museum103800563");
        Museum.addTripleToConstruct("rdfs:label ?label");
        Museum.addTripleToConstruct("rdfs:comment ?comment");
        Museum.addTripleToConstruct("geo:lat ?lat");
        Museum.addTripleToConstruct("geo:long ?long");
        Museum.addTripleToConstruct("geo:geometry ?POINT");
        Museum.addTripleToConstruct("dbo:collection ?collection");
        Museum.addTripleToConstruct("dbo:foundingDate ?foundingDate");
        Museum.addTripleToConstruct("dbo:location ?location");
        Museum.addTripleToConstruct("dbp:collection ?collection");
        Museum.addTripleToConstruct("dbp:director ?director");
        Museum.addTripleToConstruct("dbp:established ?established");
        Museum.addTripleToConstruct("dbp:location ?location");
        Museum.addTripleToConstruct("dbp:mapAlt ?mapAlt");
        Museum.addTripleToConstruct("dbp:nativeName ?nativeName");
        Museum.addTripleToConstruct("dbp:nativeNameLang ?nativeNameLang");
        Museum.addTripleToConstruct("dbp:publictransit ?publictransit");
        Museum.addTripleToConstruct("dbp:type ?type");
        Museum.addTripleToConstruct("rdf:type dbo:Museum");
        Museum.addTripleToConstruct("dbp:website ?website");
        Museum.addTripleToConstruct("dbp:built ?built");
        Museum.addTripleToConstruct("dbp:builtFor ?builtFor");

        Museum.addOptionalToWhere("dbo:abstract ?abstract");
        Museum.addOptionalToWhere("dbp:name ?name");
        Museum.addOptionalToWhere("rdf:type yago:Museum103800563");
        Museum.addOptionalToWhere("rdfs:label ?label");
        Museum.addOptionalToWhere("rdfs:comment ?comment");
        Museum.addOptionalToWhere("geo:lat ?lat");
        Museum.addOptionalToWhere("geo:long ?long");
        Museum.addOptionalToWhere("geo:geometry ?POINT");
        Museum.addOptionalToWhere("dbo:collection ?collection");
        Museum.addOptionalToWhere("dbo:foundingDate ?foundingDate");
        Museum.addOptionalToWhere("dbo:location ?location");
        Museum.addOptionalToWhere("dbp:collection ?collection");
        Museum.addOptionalToWhere("dbp:mapAlt ?mapAlt");
        Museum.addOptionalToWhere("dbp:nativeName ?nativeName");
        Museum.addOptionalToWhere("dbp:nativeNameLang ?nativeNameLang");
        Museum.addOptionalToWhere("dbp:publictransit ?publictransit");
        Museum.addOptionalToWhere("dbp:type ?type");
        Museum.addOptionalToWhere("rdf:type dbo:Museum");
        Museum.addOptionalToWhere("dbp:website ?website");
        Museum.addOptionalToWhere("dbp:director ?director");
        Museum.addOptionalToWhere("dbp:established ?established");
        Museum.addOptionalToWhere("dbp:location ?location");
        Museum.addOptionalToWhere("dbp:built ?built");
        Museum.addOptionalToWhere("dbp:builtFor ?builtFor");

        Museum.addLanguageFilter("?abstract", langs);
        Museum.addLanguageFilter("?label", langs);
        Museum.queryDataByCatergory("dbc:Museums_in_Vietnam");
    }
}
