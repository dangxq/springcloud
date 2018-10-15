package com.jason.service.movie.service;

import com.jason.service.movie.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Jason
 * @date 2018/10/13
 */
@FeignClient(name = "user-action")
public interface UserFeignService {
    @RequestMapping(value = "/user/{id}")
    UserDTO getUserNameByUserId(@PathVariable("id") String id);
}
