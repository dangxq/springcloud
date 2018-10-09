package com.jason.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Administrator
 * 通过@ FeignClient（“服务名”），来指定调用哪个服务
 */
@FeignClient("service-hi")
public interface SchedualServiceHi {
    /**
     * interface
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
