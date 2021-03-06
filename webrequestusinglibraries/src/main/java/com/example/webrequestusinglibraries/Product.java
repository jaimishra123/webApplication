package com.example.webrequestusinglibraries;

import java.util.ArrayList;

public class Product
{
    int id;
    String name;
    double price;
    ArrayList<String> images;

    public Product(int id, String name, double price, ArrayList<String> images) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.images = images;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<String> getImages() {
        return images;
    }

    public void setImages(ArrayList<String> images) {
        this.images = images;
    }
}
