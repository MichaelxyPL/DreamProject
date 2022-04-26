package com.example.DreamProjct;

public class Book {
    private String name, price;

    public Book(String name, String price) {
        this.name=name;
        this.price=price;
    }

    public String getImg() {
        return "//images01.nicepage.com/f5/a7/f5a7875fad2aae5b1c72b7ab3340d2d4.png";
    }

    public String getName() {
        return this.name;
    }

    public String getPrice() {
        return this.price;
    }
}
