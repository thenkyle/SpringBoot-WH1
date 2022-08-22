package com.example.demo0819.service;

import com.example.demo0819.model.Meal;
import com.example.demo0819.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    private List<Meal> mealList = new ArrayList<>();
    private List<Order> orderList = new ArrayList<>();
    public OrderService(){
        this.mealList.add(new Meal("hamburger", 100, "This is delicious"));
        this.mealList.add(new Meal("Apple juice", 30, "This is delicious22"));
        this.orderList.add(new Order(1, 100, "Bill", mealList));
    }

    public Order getOrderBySeq(int seq){
        for(int i = 0; i < this.orderList.size(); i++){
            if(this.orderList.get(i).getSeq() == seq){
                return this.orderList.get(i);
            }
        }
        return null;
    }

    public Meal getMealList(String name){
        for (int i = 0; i < this.mealList.size(); i++) {
            if (this.mealList.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                return this.mealList.get(i);
            }
        }
        return null;
    }

}
