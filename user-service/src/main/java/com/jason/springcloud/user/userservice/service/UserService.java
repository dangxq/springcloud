package com.jason.springcloud.user.userservice.service;

import com.jason.springcloud.user.userservice.dto.ResponseDTO;

/**
 * @author Jason
 * @date 2018/10/17
 */
public interface UserService {
    /**
     * 用户登陆
     * @param userName
     * @param password
     * @return
     */
    ResponseDTO login(String userName, String password);
}
