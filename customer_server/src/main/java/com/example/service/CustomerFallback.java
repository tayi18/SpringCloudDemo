package com.example.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CustomerFallback implements OrderClient{


    @Override
    public String getById(Integer id) {
        System.out.println("订单模块访问失败了，现在只能加载 兜底数据");
        return "CustomerFallbackService";
    }
}
