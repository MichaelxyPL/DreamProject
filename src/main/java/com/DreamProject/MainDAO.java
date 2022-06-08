package com.DreamProject;

import org.mindr.BCrypt;

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
            ResultSet result = statement.executeQuery("SELECT id,name, price, type, img FROM tbproducts");

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

    public void addUser(Login login) {
        BCrypt crypt=new BCrypt();

        String salt=crypt.gensalt();
        String hashedPassword=crypt.hashpw(login.getPassword(), salt);

        try {
            this.setConnect();
//            ResultSet result = statement.executeQuery("INSERT INTO tbusers (name, email, password, salt) VALUES ("+name+", "+email+", "+hashedPassword+", "+salt+")");
            stmt = this.connection.prepareStatement("INSERT INTO tbusers (name, surname, email, password, salt) values (?,?,?,?,?)");
            stmt.setString(1, login.getName());
            stmt.setString(2, login.getSurname());
            stmt.setString(3, login.getEmail());
            stmt.setString(4, hashedPassword);
            stmt.setString(5, salt);
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("-----BLAD BAZY-----\n"+e.getMessage());
        }finally{
            this.closeConnect();
        }
    }

    public Login loginUser(Login login) {
        String hashedPassword=this.getHashDB(login.getEmail());

        BCrypt crypt=new BCrypt();
        if(crypt.checkpw(login.getPassword(), hashedPassword)){
            login=this.getUserData(login);
        }
        login=this.getUserData(login);

        System.out.println("name in login obj: "+login.getName());

        return login;
    }

    private Login getUserData(Login login) {
        try {
            this.setConnect();
            String email=login.getEmail();
            String query="SELECT name, surname  FROM tbusers WHERE email='"+email+"'";
            System.out.println("query: "+query);
            ResultSet result=statement.executeQuery(query);

            if(result.next()){
                System.out.println("email in obj: "+login.getEmail());
                System.out.println("name in db: "+result.getString("name"));
                login.setName(result.getString("name"));
                login.setSurname(result.getString("surname"));
            }
        } catch (Exception e) {
            System.out.println("-----BLAD BAZY-----\n"+e.getMessage());
        }finally{
            this.closeConnect();
        }

        return login;
    }

    private String getHashDB(String email) {
        String password="";

        try {
            this.setConnect();

            stmt = this.connection.prepareStatement("SELECT password AS password FROM tbusers WHERE email=?");
            stmt.setString(1, email);
            ResultSet result=stmt.executeQuery();

            if(result.next()){
                password=result.getString("password");
            }
        } catch (Exception e) {
            System.out.println("-----BLAD BAZY-----\n"+e.getMessage());
        }finally{
            this.closeConnect();
        }

        System.out.println("password: "+password);

        return password;
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
