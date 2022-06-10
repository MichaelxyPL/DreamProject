package com.DreamProject;

public class Login {
    private static Login instance;
    protected String name;
    protected String surname;
    protected String email;
    protected String password;
    protected Boolean isLogged=false;
    protected Boolean isFailed=false;

    public Boolean checkIsLogged() {
        return isLogged;
    }

    public void setIsLogged(Boolean logged) {
        isLogged = logged;
    }

    public Boolean checkIsFailed() {
        return isFailed;
    }

    public void setIsFailed(Boolean failed) {
        isFailed = failed;
    }



    private Login(String firstname, String surname, String email, String password) {
        this.name=firstname;
        this.surname=surname;
        this.email=email;
        this.password=password;
    }

    /*WZORZEC SINGLETON*/
    public static Login getInstance(String firstname, String surname, String email, String password) {
        if (instance == null) {
            instance = new Login(firstname, surname, email, password);
        }
        return instance;
    }

    public Login(){}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        if(this.surname!=null) {
            return this.surname;
        }else{
            return "obejsicie";
        }
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
