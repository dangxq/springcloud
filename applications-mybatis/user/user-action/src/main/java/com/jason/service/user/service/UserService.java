package com.jason.service.user.service;

import com.jason.service.user.model.UserModel;

/**
 * @author Jason
 * @date 2018/10/12
 */
public interface UserService {
    UserModel findById(int id);
}
