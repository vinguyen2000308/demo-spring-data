package com.example.demospringdata.service;

import com.example.demospringdata.domain.Order;
import com.example.demospringdata.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;


    public Order saveOrder(Order order) {
        return orderRepo.save(order);
    }

    public List<Order> getAll() {
        return orderRepo.findAll();
    }


}
