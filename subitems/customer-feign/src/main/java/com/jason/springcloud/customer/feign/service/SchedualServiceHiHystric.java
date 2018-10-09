package com.jason.springcloud.customer.feign.service;

import org.springframework.stereotype.Component;

/**
 * @author dangx
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
