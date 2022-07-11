package query;

import java.io.FileNotFoundException;
import org.apache.jena.sparql.lang.sparql_11.ParseException;

public class ExecuteQuery extends QueryCategory {
    public static void main(String[] args) throws ParseException {
        // new QueryHeritageSites();
        new QueryNationalPark();
        // new QueryLake();
        // new QueryMuseum();
    }
}
