package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderServers9001 {
    public static void main( String[] args ) {
        SpringApplication.run(OrderServers9001.class, args);
    }
}
