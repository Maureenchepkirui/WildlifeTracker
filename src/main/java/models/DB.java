package models;

import org.sql2o.*;

public class DB {
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://ec2-54-91-178-234.compute-1.amazonaws.com:5432/d5ptjlpl42fbkr?sslmode=require", "ywcufjtzxpjcxz", "ea3190a988e7076697799699c4bd0f85b83bb87ea43f41f3b2cf8ae321c8c51e");
}