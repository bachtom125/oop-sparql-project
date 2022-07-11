package query.buildQuery;

import java.io.IOException;

import org.apache.commons.compress.harmony.pack200.Segment.PassException;
import org.apache.jena.sparql.lang.sparql_11.ParseException;

import query.QueryActions;

public class QueryTemple extends QueryCategory {

    public QueryTemple() throws ParseException, IOException {

        QueryActions Temple = new QueryActions("?s");

        Temple.addTripleToConstruct(abs);
        Temple.addTripleToConstruct(name);
        Temple.addTripleToConstruct("dbo:areaTotal ?areaTotal");
        Temple.addTripleToConstruct("dbo:country ?country");
        Temple.addTripleToConstruct("dbo:originalName ?originalName");
        Temple.addTripleToConstruct("dbo:populationTotal ?populationTotal");
        Temple.addTripleToConstruct("dbo:subdivision ?subdivision");
        Temple.addTripleToConstruct("dbp:nativeName ?nativeName");
        Temple.addTripleToConstruct("dbp:officialName ?officialName");
        Temple.addTripleToConstruct("dbp:pushpinMap ?pushpinMap");
        Temple.addTripleToConstruct("rdfs:comment ?comment");
        Temple.addTripleToConstruct("rdfs:label ?label");
        Temple.addTripleToConstruct("geo:lat ?lat");
        Temple.addTripleToConstruct("geo:long ?long");
        Temple.addTripleToConstruct("rdf:type dbo:ReligiousBuilding");
        Temple.addTripleToConstruct("dbp:creator ?creator");
        Temple.addTripleToConstruct("dbp:location ?location");
        Temple.addTripleToConstruct("geo:geometry ?POINT");
        Temple.addTripleToConstruct("dbp:caption ?caption");
        Temple.addTripleToConstruct("dbp:locmapin ?locmapin");
        Temple.addTripleToConstruct("dbp:yearCompleted ?yearCompleted");
        Temple.addTripleToConstruct("dbp:country ?country");
        Temple.addTripleToConstruct("dbp:province ?province");
        Temple.addTripleToConstruct("dbp:district ?district");
        Temple.addTripleToConstruct("dbp:nativeNameLang ?nativeNameLang");

        Temple.addTripleToWhere("dct:subject dbc:Temples_in_Vietnam");
        Temple.addOptionalToWhere(abs);
        Temple.addOptionalToWhere(name);
        Temple.addOptionalToWhere("dbo:areaTotal ?areaTotal");
        Temple.addOptionalToWhere("dbo:country ?country");
        Temple.addOptionalToWhere("dbo:originalName ?originalName");
        Temple.addOptionalToWhere("dbo:populationTotal ?populationTotal");
        Temple.addOptionalToWhere("dbo:subdivision ?subdivision");
        Temple.addOptionalToWhere("dbp:nativeName ?nativeName");
        Temple.addOptionalToWhere("dbp:officialName ?officialName");
        Temple.addOptionalToWhere("dbp:pushpinMap ?pushpinMap");
        Temple.addOptionalToWhere("rdfs:comment ?comment");
        Temple.addOptionalToWhere("rdfs:label ?label");
        Temple.addOptionalToWhere("geo:lat ?lat");
        Temple.addOptionalToWhere("geo:long ?long");
        Temple.addOptionalToWhere("rdf:type dbo:ReligiousBuilding");
        Temple.addOptionalToWhere("dbp:creator ?creator");
        Temple.addOptionalToWhere("dbp:location ?location");
        Temple.addOptionalToWhere("geo:geometry ?POINT");
        Temple.addOptionalToWhere("dbp:caption ?caption");
        Temple.addOptionalToWhere("dbp:locmapin ?locmapin");
        Temple.addOptionalToWhere("dbp:yearCompleted ?yearCompleted");
        Temple.addOptionalToWhere("dbp:country ?country");
        Temple.addOptionalToWhere("dbp:province ?province");
        Temple.addOptionalToWhere("dbp:district ?district");
        Temple.addOptionalToWhere("dbp:nativeNameLang ?nativeNameLang");

        Temple.addLanguageFilter("?abstract", langs);
        Temple.addLanguageFilter("?label", langs);
        Temple.queryDataByCatergory("dbc:Temples_in_Vietnam");
    }
}
