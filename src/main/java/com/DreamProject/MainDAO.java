package com.DreamProject;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

//TODO tabela zamówień, zapis zamóenia, pobranie listy zamóień, zmiana statusu na zapłącone, dostarczone.

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
    private PreparedStatement stmt = null;

    public MainDAO() {
        parser=new SQLParser();
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
    public void closeConnect(){
        try {
            statement.close();
            connection.close();
        }catch (Exception e){
            return;
        }
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

    public String geUsers() {
        String users="";
        try {
            this.setConnect();

            ResultSet result = statement.executeQuery(parser.getUsers());
            if(result.next())
            {
                users+=result.getString("firstname")+" "+result.getString("lastname");
            }
        } catch (ClassNotFoundException e) {
            return "Błąd silnika";
        } catch (SQLException throwables) {
            return "Błąd bazy danych";
        }finally{
            this.closeConnect();
        }

        return users;

    }

    public List<Book> getBooks() {
        List<Book> books = new LinkedList<>();

        try {
            this.setConnect();
            ResultSet result = statement.executeQuery("SELECT id,name, price FROM tbproducts");

            if(result.next()){
                books.add(new Book(result.getString("name"),""+result.getFloat("price")));
            }
        } catch (Exception e) {
//            System.out.println(e.getMessage());
        }finally{
            this.closeConnect();
        }

        return books;
    }

    public void addUser(String name, String email, String password) {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        }catch (Exception e){}
        md.update(salt);

        byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));
        System.out.println(salt);
        System.out.println(hashedPassword);




        try {
            this.setConnect();
//            ResultSet result = statement.executeQuery("INSERT INTO tbusers (name, email, password, salt) VALUES ("+name+", "+email+", "+hashedPassword+", "+salt+")");
            stmt = this.connection.prepareStatement("INSERT INTO tbusers (name, email, password, salt) values (?, ?,?,?)");
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, String.valueOf(hashedPassword));
            stmt.setString(4, String.valueOf(salt));
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            this.closeConnect();
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
