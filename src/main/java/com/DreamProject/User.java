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
        return !name.isEmpty();
    }
}

