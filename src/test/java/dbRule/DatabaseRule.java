package dbRule;

import org.junit.rules.ExternalResource;
import models.*;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class DatabaseRule extends ExternalResource {
    @Override
    protected void before(){
        DB.sql2o = new Sql2o("jdbc:postgresql://ec2-54-91-178-234.compute-1.amazonaws.com:5432/d3g37lplhvmaj?sslmode=require", "hzumcwjwveoagx", "0d779355801228ca64b8f58d1ef6fcea52f193056d21745fdbe493aa8ebca250");
    }

    @Override
    protected  void after () {
        try (Connection con = DB.sql2o.open()){
            String deleteAnimalsQuery = "DELETE FROM animals *;";
            String deleteSightingsQuery = "DELETE FROM sightings *;";
            con.createQuery(deleteAnimalsQuery).executeUpdate();
            con.createQuery(deleteSightingsQuery).executeUpdate();
        }
    }
}
