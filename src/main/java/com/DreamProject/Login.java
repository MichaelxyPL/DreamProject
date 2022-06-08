package com.DreamProject;

public class Login {
    protected String name;
    protected String surname;
    protected String email;
    protected String password;

    public Login(String firstname, String surname, String email, String password) {
        this.name=firstname;
        this.surname=surname;
        this.email=email;
        this.password=password;
    }

    public Login(String firstname, String surname, String email) {
        this.name=firstname;
        this.surname=surname;
        this.email=email;
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
        this.surname = this.surname;
    }
}
