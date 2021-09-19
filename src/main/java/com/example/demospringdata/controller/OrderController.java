package com.example.demospringdata.controller;

import com.example.demospringdata.domain.Order;
import com.example.demospringdata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    private String test;

    @PostMapping("/save-order")
    public Order saveOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    @GetMapping
    public List<Order> getAll() {
        System.out.println(test);
        return orderService.getAll();
    }

}

