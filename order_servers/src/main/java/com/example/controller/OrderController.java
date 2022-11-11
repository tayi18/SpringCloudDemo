package com.example.controller;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/order/{orderId}")
    public String getById(@PathVariable("orderId") Integer id) {
        System.out.println("用户正在端口:"+serverPort+",访问订单："+id);
        return "nacos registry, serverPort: "+ serverPort+"\t id"+id;
    }

    @GetMapping("saveOrder")
    //热点参数
    @SentinelResource(value = "saveOrderHotKey",blockHandler = "handlerHotKey",fallback = "handlerFallback")
    public String saveOrder(@RequestParam("custId") Integer custId,
                            @RequestParam("productId") Integer productId) {
        System.out.println("用户正在访问订单："+custId+",productId"+productId);
        int s = 10/0;
        return "saveOrder";
    }

    //兜底方法
    public String handlerHotKey(Integer custId, Integer productId , BlockException exception){
        return "blockHandler当前系统正忙，请稍后再试";
    }

    //兜底方法
    public String handlerFallback(Integer custId, Integer productId ){
        return "fallback系统异常，请稍后再试";
    }


}
