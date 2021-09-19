package com.example.demospringdata.service;

import com.example.demospringdata.domain.Order;
import com.example.demospringdata.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;


    public Order saveOrder(Order order) {
        return orderRepo.save(order);
    }

    public List<Order> getAll() {
        List<Order> all = orderRepo.findAll();
        Assert.isTrue(all.size() == 10);
        return all;
    }


}
