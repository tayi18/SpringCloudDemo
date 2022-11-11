package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private OrderClient orderClient;

    @Override
    public String getMyOrder(int customerId, Integer orderId) {
        System.out.println("customer service : cust id" + customerId +",orderId: " + orderId);
        String result = orderClient.getById(orderId);
        return result;
    }
}
