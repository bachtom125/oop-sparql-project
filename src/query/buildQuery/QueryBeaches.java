package query.buildQuery;

import java.io.IOError;
import java.io.IOException;

import org.apache.jena.sparql.lang.sparql_11.ParseException;

import query.QueryActions;

public class QueryBeaches extends QueryCategory {

    public QueryBeaches() throws ParseException, IOException {

        QueryActions Beach = new QueryActions("?s");

        Beach.addTripleToConstruct(abs);
        Beach.addTripleToConstruct(name);
        Beach.addTripleToConstruct("dbo:country ?country");
        Beach.addTripleToConstruct("dbo:subdivision ?subdivision");
        Beach.addTripleToConstruct("dbo:utcOffset ?utcOffset");
        Beach.addTripleToConstruct("dbp:subdivisionName ?subdivisionName");
        Beach.addTripleToConstruct("rdf:type yago:Beach109217230");
        Beach.addTripleToConstruct("rdf:type dbo:Location");
        Beach.addTripleToConstruct("rdfs:comment ?comment");
        Beach.addTripleToConstruct("rdfs:label ?label");
        Beach.addTripleToConstruct("geo:geometry ?geometry");
        Beach.addTripleToConstruct("geo:lat ?lat");
        Beach.addTripleToConstruct("geo:long ?long");
        Beach.addTripleToConstruct("dbp:officialName ?officialName");
        Beach.addTripleToConstruct("dbp:populationAsOf ?populationAsOf");
        Beach.addTripleToConstruct("dbp:timezone ?timezone");
        Beach.addTripleToConstruct("dbo:areaTotal ?areaTotal");
        Beach.addTripleToConstruct("dbo:originalName ?originalName");
        Beach.addTripleToConstruct("dbo:populationDensity ?populationDensity");
        Beach.addTripleToConstruct("dbo:populationTotal ?populationTotal");
        Beach.addTripleToConstruct("dbp:areaTotalKm ?areaTotalKm");
        Beach.addTripleToConstruct("dbp:nativeName ?nativeName");
        Beach.addTripleToConstruct("dbp:subdivisionType ?subdivisionType");

        Beach.addTripleToWhere("dct:subject dbc:Beaches_of_Vietnam");
        Beach.addOptionalToWhere(abs);
        Beach.addOptionalToWhere(name);
        Beach.addOptionalToWhere("dbo:country ?country");
        Beach.addOptionalToWhere("dbo:subdivision ?subdivision");
        Beach.addOptionalToWhere("dbo:utcOffset ?utcOffset");
        Beach.addOptionalToWhere("dbp:subdivisionName ?subdivisionName");
        Beach.addOptionalToWhere("rdf:type yago:Beach109217230");
        Beach.addOptionalToWhere("rdf:type dbo:Location");
        Beach.addOptionalToWhere("rdfs:comment ?comment");
        Beach.addOptionalToWhere("rdfs:label ?label");
        Beach.addOptionalToWhere("geo:geometry ?geometry");
        Beach.addOptionalToWhere("geo:lat ?lat");
        Beach.addOptionalToWhere("geo:long ?long");
        Beach.addOptionalToWhere("dbp:officialName ?officialName");
        Beach.addOptionalToWhere("dbp:populationAsOf ?populationAsOf");
        Beach.addOptionalToWhere("dbo:areaTotal ?areaTotal");
        Beach.addOptionalToWhere("dbo:originalName ?originalName");
        Beach.addOptionalToWhere("dbo:populationDensity ?populationDensity");
        Beach.addOptionalToWhere("dbo:populationTotal ?populationTotal");
        Beach.addOptionalToWhere("dbp:areaTotalKm ?areaTotalKm");
        Beach.addOptionalToWhere("dbp:nativeName ?nativeName");
        Beach.addOptionalToWhere("dbp:subdivisionType ?subdivisionType");

        Beach.addLanguageFilter("?abstract", langs);
        Beach.addLanguageFilter("?label", langs);
        Beach.queryDataByCatergory("dbc:Beaches_of_Vietnam");
    }
}
