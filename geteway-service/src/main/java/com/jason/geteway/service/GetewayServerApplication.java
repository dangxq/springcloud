package com.jason.geteway.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GetewayServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GetewayServerApplication.class, args);
    }
}
