package com.jason.service.movie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@MapperScan("com.jason.service.movie.mapper")
public class MovieActionApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieActionApplication.class, args);
    }
}
