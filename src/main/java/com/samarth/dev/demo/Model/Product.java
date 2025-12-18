package com.samarth.dev.demo.Model;

import jakarta.validation.constraints.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

    //set product id as primary key of table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generate unique ID
    private int id;
    @NotNull(message = "Title of Project should be provided")
    private String title;
    
    //@Max(value = 3000, message = "custom error message")
    private int price;

    public Product(int id, String title, int price) {
       this.id = id;
       this.title = title;
       this.price = price;
    }

    public Product(){
        
    }

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
