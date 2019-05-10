package com.exodiashop.shop.Model;

public class Product {


    private int id;
    private String name;
    private float price;
    private String img_path;

    public Product(int id, String name){
        this.id = id;
        this.name = name;

    }

    public Product(int id, String name, float price, String img_path){
        this.id = id;
        this.name = name;
        this.price = price;
        this.img_path = img_path;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }
}
