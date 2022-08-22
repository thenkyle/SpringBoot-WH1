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
        this.mealList.add(new Meal("Apple pie", 250, "This is delicious250"));
        this.orderList.add(new Order(1, "Bill", mealList));
    }
    // 依照單號seq取得該筆orderList
    public Order getOrderBySeq(int seq){
        for(int i = 0; i < this.orderList.size(); i++){
            if(this.orderList.get(i).getSeq() == seq){
                return this.orderList.get(i);
            }
        }
        return null;
    }

    // 依照單號seq取得該單號的總額
    public int getTotal(int seq){
        int num = 0;
        for(int i = 0; i < this.orderList.size(); i++){
            if(this.orderList.get(i).getSeq() == seq) {
                num += this.orderList.get(i).getTotalPrice();
            }
        }
        return num;
    }

}
