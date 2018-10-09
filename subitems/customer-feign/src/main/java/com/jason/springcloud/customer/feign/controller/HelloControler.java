package com.jason.springcloud.customer.feign.controller;

import com.jason.springcloud.customer.feign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dangx
 */
@RestController
public class HelloControler {


    @Autowired
    SchedualServiceHi schedualServiceHi;

    @GetMapping(value = "/hello")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClientOne( name );
    }

}
