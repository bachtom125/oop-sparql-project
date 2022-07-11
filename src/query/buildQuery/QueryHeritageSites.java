package query.buildQuery;

import java.io.IOException;

import org.apache.jena.sparql.lang.sparql_11.ParseException;

import query.QueryActions;

public class QueryHeritageSites extends QueryCategory {

    public QueryHeritageSites() throws ParseException, IOException {

        QueryActions Heritage = new QueryActions("?s");

        Heritage.addTripleToWhere("dct:subject dbc:World_Heritage_Sites_in_Vietnam");
        Heritage.addTripleToConstruct("dbo:abstract ?abstract");
        Heritage.addTripleToConstruct("dbp:name ?name");
        Heritage.addTripleToConstruct("dbo:areaTotal ?areaTotal");
        Heritage.addTripleToConstruct("dbo:country ?country");
        Heritage.addTripleToConstruct("dbo:originalName ?originalName");
        Heritage.addTripleToConstruct("dbo:populationTotal ?populationTotal");
        Heritage.addTripleToConstruct("dbo:subdivision ?subdivision");
        Heritage.addTripleToConstruct("dbp:nativeName ?nativeName");
        Heritage.addTripleToConstruct("dbp:officialName ?officialName");
        Heritage.addTripleToConstruct("dbp:pushpinMap ?pushpinMap");
        Heritage.addTripleToConstruct("rdfs:comment ?comment");
        Heritage.addTripleToConstruct("rdfs:label ?label");
        Heritage.addTripleToConstruct("geo:lat ?lat");
        Heritage.addTripleToConstruct("geo:long ?long");
        Heritage.addTripleToConstruct("rdf:type yago:Location100027167");
        Heritage.addTripleToConstruct("rdf:type dbo:WorldHeritageSite");
        Heritage.addTripleToConstruct("dbp:location ?location");
        Heritage.addTripleToConstruct("geo:geometry ?POINT");
        Heritage.addTripleToConstruct("dbp:caption ?caption");
        Heritage.addTripleToConstruct("dbp:locmapin ?locmapin");
        Heritage.addTripleToConstruct("dbp:whs ?whs");
        Heritage.addTripleToConstruct("dbp:country ?country");
        Heritage.addTripleToConstruct("dbp:province ?province");
        Heritage.addTripleToConstruct("dbp:district ?district");
        Heritage.addTripleToConstruct("dbp:nativeNameLang ?nativeNameLang");

        Heritage.addOptionalToWhere("dbo:abstract ?abstract");
        Heritage.addOptionalToWhere("dbp:name ?name");
        Heritage.addOptionalToWhere("dbo:areaTotal ?areaTotal");
        Heritage.addOptionalToWhere("dbo:country ?country");
        Heritage.addOptionalToWhere("dbo:originalName ?originalName");
        Heritage.addOptionalToWhere("dbo:populationTotal ?populationTotal");
        Heritage.addOptionalToWhere("dbo:subdivision ?subdivision");
        Heritage.addOptionalToWhere("dbp:nativeName ?nativeName");
        Heritage.addOptionalToWhere("dbp:officialName ?officialName");
        Heritage.addOptionalToWhere("dbp:pushpinMap ?pushpinMap");
        Heritage.addOptionalToWhere("rdfs:comment ?comment");
        Heritage.addOptionalToWhere("rdfs:label ?label");
        Heritage.addOptionalToWhere("geo:lat ?lat");
        Heritage.addOptionalToWhere("geo:long ?long");
        Heritage.addOptionalToWhere("rdf:type yago:Location100027167");
        Heritage.addOptionalToWhere("rdf:type dbo:WorldHeritageSite");
        Heritage.addOptionalToWhere("dbp:location ?location");
        Heritage.addOptionalToWhere("geo:geometry ?POINT");
        Heritage.addOptionalToWhere("dbp:caption ?caption");
        Heritage.addOptionalToWhere("dbp:locmapin ?locmapin");
        Heritage.addOptionalToWhere("dbp:whs ?whs");
        Heritage.addOptionalToWhere("dbp:country ?country");
        Heritage.addOptionalToWhere("dbp:province ?province");
        Heritage.addOptionalToWhere("dbp:district ?district");
        Heritage.addOptionalToWhere("dbp:nativeNameLang ?nativeNameLang");

        Heritage.addLanguageFilter("?abstract", langs);
        Heritage.addLanguageFilter("?name", langs);
        Heritage.addLanguageFilter("?comment", langs);
        Heritage.addLanguageFilter("?label", langs);
        Heritage.queryDataByCatergory("dbc:World_Heritage_Sites_in_Vietnam");
    }
}
