package query;

import java.io.IOException;

import org.apache.jena.sparql.lang.sparql_11.ParseException;

import query.buildQuery.QueryBeaches;
import query.buildQuery.QueryHeritageSites;
import query.buildQuery.QueryLake;
import query.buildQuery.QueryMuseum;
import query.buildQuery.QueryNationalPark;
import query.buildQuery.QueryTemple;

public class ExecuteQuery {
    public static void main(String[] args) throws ParseException, IOException {
        new QueryHeritageSites();
        new QueryNationalPark();
        new QueryLake();
        new QueryMuseum();
        new QueryTemple();
        new QueryBeaches();
    }
}
