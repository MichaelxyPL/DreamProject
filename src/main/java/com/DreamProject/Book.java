package com.DreamProject;

public class Book {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private String price;
    private String type;
    private String author;
    private int id;

    public Book(int id, String name, String price, String type, String author) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.author = author;
        this.id = id;
    }

}
