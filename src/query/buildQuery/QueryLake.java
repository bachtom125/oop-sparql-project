package query.buildQuery;

import java.io.IOError;
import java.io.IOException;

import org.apache.jena.sparql.lang.sparql_11.ParseException;

import query.QueryActions;

public class QueryLake extends QueryCategory {

    public QueryLake() throws ParseException, IOException {

        QueryActions Lake = new QueryActions("?s");

        Lake.addTripleToWhere("dct:subject dbc:Lakes_of_Vietnam");
        Lake.addTripleToConstruct(abs);
        Lake.addTripleToConstruct(name);
        Lake.addTripleToConstruct("dbo:areaTotal ?areaTotal");
        Lake.addTripleToConstruct("dbo:country ?country");
        Lake.addTripleToConstruct("dbo:elevation ?elevation");
        Lake.addTripleToConstruct("dbo:length ?length");
        Lake.addTripleToConstruct("dbo:location ?location");
        Lake.addTripleToConstruct("dbo:maximumDepth ?maximumDepth");
        Lake.addTripleToConstruct("dbp:alt ?alt");
        Lake.addTripleToConstruct("dbp:basinCountries ?basinCountries");
        Lake.addTripleToConstruct("dbp:location ?location");
        Lake.addTripleToConstruct("dbp:pushpinMap ?pushpinMap");
        Lake.addTripleToConstruct("rdfs:label ?label");
        Lake.addTripleToConstruct("rdfs:comment ?comment");
        Lake.addTripleToConstruct("rdf:type yago:Lake109328904");
        Lake.addTripleToConstruct("dbo:shoreLength ?shoreLength");
        Lake.addTripleToConstruct("dbp:caption ?caption");
        Lake.addTripleToConstruct("dbp:lakeType ?lakeType");
        Lake.addTripleToConstruct("geo:lat ?lat");
        Lake.addTripleToConstruct("geo:long ?long");
        Lake.addTripleToConstruct("geo:geometry ?geometry");
        Lake.addTripleToConstruct("dbp:damCrosses ?damCrosses");
        Lake.addTripleToConstruct("dbp:locationMap ?locationMap");
        Lake.addTripleToConstruct("dbo:lake ?lake");
        Lake.addTripleToConstruct("dbo:purpose ?purpose");
        Lake.addTripleToConstruct("dbp:purpose ?purpose");
        Lake.addTripleToConstruct("dbp:opening ?opening");
        Lake.addTripleToConstruct("dbp:owner ?owner");
        Lake.addTripleToConstruct("dbp:constructionBegan ?constructionBegan");
        Lake.addTripleToConstruct("dbp:plantOperator ?plantOperator");
        Lake.addTripleToConstruct("dbp:resName ?resName");
        Lake.addTripleToConstruct("dbp:plantAnnualGen ?plantAnnualGen");
        Lake.addTripleToConstruct("dbp:plantCapacity ?plantCapacity");
        Lake.addTripleToConstruct("dbp:river ?river");
        Lake.addTripleToConstruct("dbp:plantCommission ?plantCommission");
        Lake.addTripleToConstruct("dbo:owner ?owner");
        Lake.addTripleToConstruct("dbp:nativeName ?nativeName");
        Lake.addTripleToConstruct("dbp:rivers ?rivers");
        Lake.addTripleToConstruct("dbo:inflow ?inflow");
        Lake.addTripleToConstruct("dbp:cities ?cities");
        Lake.addTripleToConstruct("dbo:type ?type");
        Lake.addTripleToConstruct("dbo:width ?width");

        Lake.addOptionalToWhere(abs);
        Lake.addOptionalToWhere(name);
        Lake.addOptionalToWhere("dbo:areaTotal ?areaTotal");
        Lake.addOptionalToWhere("dbo:country ?country");
        Lake.addOptionalToWhere("dbo:elevation ?elevation");
        Lake.addOptionalToWhere("dbo:length ?length");
        Lake.addOptionalToWhere("dbo:location ?location");
        Lake.addOptionalToWhere("dbo:maximumDepth ?maximumDepth");
        Lake.addOptionalToWhere("dbp:alt ?alt");
        Lake.addOptionalToWhere("dbp:basinCountries ?basinCountries");
        Lake.addOptionalToWhere("dbp:location ?location");
        Lake.addOptionalToWhere("dbp:pushpinMap ?pushpinMap");
        Lake.addOptionalToWhere("rdfs:label ?label");
        Lake.addOptionalToWhere("rdfs:comment ?comment");
        Lake.addOptionalToWhere("rdf:type yago:Lake109328904");
        Lake.addOptionalToWhere("dbo:shoreLength ?shoreLength");
        Lake.addOptionalToWhere("dbp:caption ?caption");
        Lake.addOptionalToWhere("dbp:lakeType ?lakeType");
        Lake.addOptionalToWhere("geo:lat ?lat");
        Lake.addOptionalToWhere("geo:long ?long");
        Lake.addOptionalToWhere("geo:geometry ?geometry");
        Lake.addOptionalToWhere("dbp:damCrosses ?damCrosses");
        Lake.addOptionalToWhere("dbp:locationMap ?locationMap");
        Lake.addOptionalToWhere("dbo:lake ?lake");
        Lake.addOptionalToWhere("dbo:purpose ?purpose");
        Lake.addOptionalToWhere("dbp:purpose ?purpose");
        Lake.addOptionalToWhere("dbp:opening ?opening");
        Lake.addOptionalToWhere("dbp:owner ?owner");
        Lake.addOptionalToWhere("dbp:constructionBegan ?constructionBegan");
        Lake.addOptionalToWhere("dbp:plantOperator ?plantOperator");
        Lake.addOptionalToWhere("dbp:resName ?resName");
        Lake.addOptionalToWhere("dbp:plantAnnualGen ?plantAnnualGen");
        Lake.addOptionalToWhere("dbp:plantCapacity ?plantCapacityt");
        Lake.addOptionalToWhere("dbp:river ?river");
        Lake.addOptionalToWhere("dbp:plantCommission ?plantCommission");
        Lake.addOptionalToWhere("dbo:owner ?owner");
        Lake.addOptionalToWhere("dbp:nativeName ?nativeName");
        Lake.addOptionalToWhere("dbp:rivers ?rivers");
        Lake.addOptionalToWhere("dbo:inflow ?inflow");
        Lake.addOptionalToWhere("dbo:type ?type");
        Lake.addOptionalToWhere("dbo:width ?width");

        Lake.addLanguageFilter("?abstract", langs);
        Lake.addLanguageFilter("?label", langs);
        Lake.queryDataByCatergory("dbc:Lakes_of_Vietnam");
    }
}
