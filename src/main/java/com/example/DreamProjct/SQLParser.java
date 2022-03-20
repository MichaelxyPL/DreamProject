package com.example.DreamProjct;

public class SQLParser {

    private String query="";

    public String getUser(String name, String password) {
        query = "SELECT " +
                    "tbuser.id as id, tbuser.name as name, tbuser.secondname as secondname" +
                "FROM" +
                    "tbuser" +
                    "inner join tblogin on tbuser.id=tblogin.userid" +
                "WHERE " +
                    "tblogin.name="+name+" and tblogin.pswr="+password;
        return query;
    }
}
