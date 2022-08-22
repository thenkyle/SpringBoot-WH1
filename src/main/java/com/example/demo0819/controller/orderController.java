package com.example.demo0819.controller;

import com.example.demo0819.model.Order;
import com.example.demo0819.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/order")
public class orderController {
    @Autowired
    public OrderService orderService;

    @GetMapping("/{seq}")
    public String getOrderBySeq(@PathVariable int seq, Model model){
        Order orderData = this.orderService.getOrderBySeq(seq);
        model.addAttribute("order", orderData);
        return "order";
    }

}
