package com.DreamProject;


//TODO zapis zmaówienia, wyświetlanie zamówień
public class Order {
    private String date;
    private String productName;
    private int amount;

    public Order(String date, String productName, int amount) {
        this.date = date;
        this.productName = productName;
        this.amount = amount;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProductID() {
        return productName;
    }

    public void setProductID(String productID) {
        this.productName = productID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
