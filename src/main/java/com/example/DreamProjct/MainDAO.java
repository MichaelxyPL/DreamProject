package com.example.DreamProjct;

import java.sql.*;

/**
 * Klasa służąca do łączenia się z bazą
 */
public class MainDAO {
    /*konfiguracja połączenia z serwerem*/
    private final static String DBURL = "jdbc:mysql://localhost/DreamProjct";
    private final static String DBUSER = "root";
    private final static String DBPASS = "";
    private final static String DBDRIVER = "com.mysql.cj.jdbc.Driver";

    //obiekt tworzący połączenie z bazą danych.
    private Connection connection;
    //obiekt pozwalający tworzyć nowe wyrażenia SQL
    private Statement statement;
    //parser zapytań SQL
    private SQLParser parser;

    public MainDAO() {
    }

    /**
     * otwarcie połączenia
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void setConnect() throws ClassNotFoundException, SQLException {
        boolean value=false;
        Class.forName(DBDRIVER);
        connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        statement = connection.createStatement();
    }

    /**
     * zwolnienie zasobów i zamknięcie połączenia
     * @throws SQLException
     */
    public void closeConnect() throws SQLException {
        statement.close();
        connection.close();
    }

    /**
     * Pobranie danych o użytkowniku w procesie logowania
     * @param user obiekt w którym będą trzymane informacje
     * @return int status autoryzacji logowania [1:udało się, 0:nie udało się, -1:brak połączenia z bazą]
     */
    public int setUser(User user, String login, String pswrd) {
        try {
            this.setConnect();
            parser = new SQLParser();

            ResultSet result = statement.executeQuery(parser.getUser(login, pswrd));
            if(result.next()) {
                user.setId(result.getInt("id"));
                user.setName(result.getString("name"));
                user.setSecondName(result.getString("secondname"));
                this.closeConnect();
                return 1;
            }else{
                return 0;
            }
        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
            return -1;
        }
    }

    /**
     * update/insert
     * @param query zapytanie sql
     */
    /*public void save(String query) {

        try {
            Class.forName(DBDRIVER);
            connection = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            statement = connection.createStatement();
            statement.executeUpdate(query);

            //zwolnienie zasobów i zamknięcie połączenia
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }*/


}
