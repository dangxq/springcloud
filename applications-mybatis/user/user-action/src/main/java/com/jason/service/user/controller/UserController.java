package com.jason.service.user.controller;

import com.jason.service.user.model.UserModel;
import com.jason.service.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public UserModel  findById(@PathVariable int id){
        return userService.findById(id);
    }
}
