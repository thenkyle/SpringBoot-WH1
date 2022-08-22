package com.example.demo0819.model;

import java.util.List;

public class Order {
    private int seq;
    private int totalPrice;
    private String waiter;
    private List<Meal> meals;

    public Order(int seq, String waiter, List<Meal> meals){
        super();
        this.seq = seq;
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
        int totalPrice = 0;
        for(Meal meal: this.meals) {
            totalPrice += meal.getPrice();
        }
        return totalPrice;
    }
    public void setTotalPrice(int totalPrice){
        this.totalPrice = totalPrice;
    }
    public String getWaiter(){
        return waiter;
    }
    public List<Meal> getMeals(){
        return meals;
    }
}