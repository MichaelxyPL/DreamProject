package com.DreamProject;

public class User {

    private int id;
    private String name;
    private String secondName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id)
    {
        this.id=id;
    }

    public int getId()
    {
        return id;
    }

    public void setSecondName(String secondname) {
        this.secondName=secondname;
    }

    public boolean isLogged() {
        return (!(this.name == null || this.name.length() == 0));
    }

    public void validate(Login login) {
        MainDAO db = new MainDAO();
        if(login.getName()!=""){
            db.addUser(login.getName(),login.getEmail(),login.getPassword());
        }

    }
}

