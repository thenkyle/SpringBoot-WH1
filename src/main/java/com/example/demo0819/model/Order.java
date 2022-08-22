package com.example.demo0819.model;

import java.util.List;

public class Order {
    private int seq;
    private int totalPrice;
    private String waiter;
    private List<Meal> meals;

    public Order(int seq, int totalPrice, String waiter, List<Meal> meals){
        super();
        this.seq = seq;
        this.totalPrice = totalPrice;
        this.waiter = waiter;
        this.meals = meals;
    }

    public int getSeq(){
        return seq;
    }
    public void setSeq(int seq){
        this.seq = seq;
    }
    public int getTotalPrice(){
        return totalPrice;
    }
    public String getWaiter(){
        return waiter;
    }
    public List<Meal> getMeals(){
        return meals;
    }
}