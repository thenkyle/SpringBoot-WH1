package com.example.demo0819.controller;

import com.example.demo0819.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/turnover")
public class turnoverController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/{seq}")
    public String getTurnoverBySeq(@PathVariable int seq, Model model){
        int turnoverData = this.orderService.getTotal(seq);
        model.addAttribute("turnover", turnoverData);
        return "turnover";
    }

}
