package com.example.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//现在是 用户服务 调用  订单模块
//若订单服务不可用，调用另外的类处理
@FeignClient(name = "orderServers",fallback = CustomerFallback.class)
public interface OrderClient {
    @GetMapping("/order/{orderId}")
    String getById(@PathVariable("orderId") Integer id);
}
