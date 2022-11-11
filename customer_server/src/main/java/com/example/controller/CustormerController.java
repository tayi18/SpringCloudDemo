package com.example.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.example.service.CustomerService;
import com.sun.deploy.security.BlockedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustormerController {
    @Autowired
    private CustomerService customerService;




    @GetMapping(value = "/customer/order/{id}")
    public String getPayment(@PathVariable("id") Integer id) {
        System.out.println("用户正在访问订单："+id);
        return customerService.getMyOrder(9001,id);
    }






}
