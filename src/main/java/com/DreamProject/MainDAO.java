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
//    private final static String DBURL = "jdbc:mysql:mysqldbserver11333.mysql.database.azure.com";
    private final static String DBURL ="jdbc:mysql://mysqldbserver11333.mysql.database.azure.com:3306/dreamprojct?useSSL=true&requireSSL=false";
    private final static String DBUSER = "adminwsb@mysqldbserver11333";
    private final static String DBPASS = "A@dmin12345#";
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
            ResultSet result = statement.executeQuery("SELECT id, name, price, type, author FROM tbproducts");

            while(result.next()){
                System.out.println(result.getString("type"));
                books.add(new Book(
                        result.getInt("id"),
                        result.getString("name"),
                        Float.toString(result.getFloat("price")),
                        result.getString("type"),
                        result.getString("author"))
                );
            }
        } catch (Exception e) {
            System.out.println("-----BLAD BAZY-----\n"+e.getMessage());
            System.out.println("-----BLAD BAZY-----\n"+e);

            books.add(new Book(
                    9,
                    e.getMessage(),
                    "błąd - baza danych",
                    "book",
                    "błąd - baza danych")
            );
        }finally{
            this.closeConnect();
        }

        return books;
    }

    public void addUser(Login login) {
        BCrypt crypt=new BCrypt();

        String salt=crypt.gensalt();
        String hashedPassword=crypt.hashpw(login.getPassword(), salt);

        if(this.checkIsUserExist(login)){
            login.setIsFailed(true);
            return;
        }

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

    private boolean checkIsUserExist(Login login) {
        try {
            this.setConnect();
            String email=login.getEmail();
            String name=login.getName();
            String query="SELECT true as checkExst FROM tbusers WHERE email='"+email+"' OR name='"+name+"'";
            ResultSet result=statement.executeQuery(query);

            System.out.println(query);

            if(result.next()){
                System.out.println(result.getBoolean("checkExst"));
                return result.getBoolean("checkExst");
            }
        } catch (Exception e) {
            System.out.println("-----BLAD BAZY-----\n"+e.getMessage());
        }finally{
            this.closeConnect();
        }

        return false;
    }

    public Login loginUser(Login login) {
        String hashedPassword=this.getHashDB(login.getEmail());

        if(hashedPassword==""){
            login.setIsFailed(true);
            login.setIsLogged(false);
            return login;
        }

        BCrypt crypt=new BCrypt();
        if(crypt.checkpw(login.getPassword(), hashedPassword)){
            System.out.println("Hasla zgodne");
            login=this.getUserData(login);
            login.setIsLogged(true);
        }else{
            System.out.println("Hasla NIEzgodne");
            login.setIsFailed(true);
            login.setIsLogged(false);
        }

        System.out.println("name in login obj: "+login.getName());
        System.out.println("password in login obj: "+login.getPassword());

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

    public void addOrder(Login login, String id, String amount, String address) {
        System.out.println(Integer.parseInt(id));
        System.out.println(Integer.parseInt(amount));
        System.out.println(login.getEmail());
        System.out.println(address);
        try {
            this.setConnect();
//            ResultSet result = statement.executeQuery("INSERT INTO tbusers (name, email, password, salt) VALUES ("+name+", "+email+", "+hashedPassword+", "+salt+")");
            stmt = this.connection.prepareStatement("INSERT INTO tborders (productid, amount, usermail, adress) VALUES (?,?,?,?)");
            stmt.setInt(1, Integer.parseInt(id));
            stmt.setInt(2, Integer.parseInt(amount));
            stmt.setString(3, login.getEmail());
            stmt.setString(4, address);
            stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("-----BLAD BAZY-----\n"+e.getMessage());
        }finally{
            this.closeConnect();
        }
    }

    public List<Order> getOrdersHistory(Login login) {
        List<Order> orders = new LinkedList<>();

        try {
            this.setConnect();
            String query="SELECT tborders.orderdt as orderdt, tbproducts.name as name, tbproducts.price as price, tborders.amount as amount FROM tborders inner join tbproducts on tbproducts.id=tborders.productid WHERE tborders.usermail='"+ login.getEmail()+"'";
            ResultSet result = statement.executeQuery(query);

            while(result.next()){
                orders.add(new Order(
                        result.getString("orderdt"),
                        result.getString("name"),
                        result.getInt("amount"))
                );
            }
        } catch (Exception e) {
            System.out.println("-----BLAD BAZY-----\n"+e.getMessage());
        }finally{
            this.closeConnect();
        }

        return orders;
    }
}
