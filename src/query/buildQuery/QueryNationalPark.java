package query.buildQuery;

import java.io.IOException;

import org.apache.jena.sparql.lang.sparql_11.ParseException;

import query.QueryActions;

public class QueryNationalPark extends QueryCategory {

    public QueryNationalPark() throws ParseException, IOException {
        QueryActions NationalPark = new QueryActions("?s");
        NationalPark.addTripleToWhere("dct:subject dbc:National_parks_of_Vietnam");
        NationalPark.addOptionalToWhere("dbo:abstract ?abstract");
        NationalPark.addOptionalToWhere("rdfs:label ?label");
        NationalPark.addOptionalToWhere("dbp:name ?name");
        NationalPark.addOptionalToWhere("dbo:location ?location");
        NationalPark.addOptionalToWhere("dbp:areaHa ?areaHa");
        NationalPark.addOptionalToWhere("dbp:location ?location");
        NationalPark.addOptionalToWhere("dbp:photo ?photo");
        NationalPark.addOptionalToWhere("rdf:type yago:NationalPark108600992");
        NationalPark.addOptionalToWhere("geo:lat ?lat");
        NationalPark.addOptionalToWhere("geo:long ?long");
        NationalPark.addOptionalToWhere("geo:geometry ?POINT");
        NationalPark.addOptionalToWhere("dbo:areaTotal ?areaTotal");
        NationalPark.addOptionalToWhere("dbo:nearestCity ?nearestCity");
        NationalPark.addOptionalToWhere("dbp:area ?area");
        NationalPark.addOptionalToWhere("dbp:established ?established");
        NationalPark.addOptionalToWhere("rdfs:comment ?comment");
        NationalPark.addOptionalToWhere("dbp:date ?date");
        NationalPark.addOptionalToWhere("dbp:title ?title");

        NationalPark.addTripleToConstruct("dbo:abstract ?abstract");
        NationalPark.addTripleToConstruct("dbp:name ?name");
        NationalPark.addTripleToConstruct("dbo:location ?location");
        NationalPark.addTripleToConstruct("dbp:areaHa ?areaHa");
        NationalPark.addTripleToConstruct("dbp:location ?location");
        NationalPark.addTripleToConstruct("dbp:photo ?photo");
        NationalPark.addTripleToConstruct("rdf:type yago:NationalPark108600992");
        NationalPark.addTripleToConstruct("geo:lat ?lat");
        NationalPark.addTripleToConstruct("geo:long ?long");
        NationalPark.addTripleToConstruct("geo:geometry ?POINT");
        NationalPark.addTripleToConstruct("dbo:areaTotal ?areaTotal");
        NationalPark.addTripleToConstruct("dbo:nearestCity ?nearestCity");
        NationalPark.addTripleToConstruct("dbp:area ?area");
        NationalPark.addTripleToConstruct("dbp:established ?established");
        NationalPark.addTripleToConstruct("rdfs:comment ?comment");
        NationalPark.addTripleToConstruct("dbp:date ?date");
        NationalPark.addTripleToConstruct("dbp:title ?title");

        NationalPark.addLanguageFilter("?abstract", langs);
        NationalPark.addLanguageFilter("?label", langs);

        NationalPark.queryDataByCatergory("dbc:National_parks_of_Vietnam");
    }
}
