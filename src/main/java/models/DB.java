package models;

import org.sql2o.*;
// postgresql-elliptical-95847
import org.sql2o.Sql2o;

public class DB {

    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "maureenbett", "kenyan082bett");
}