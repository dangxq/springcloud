package com.jason.service.user.service.impl;

import com.jason.service.user.mapper.UserModelMapper;
import com.jason.service.user.model.UserModel;
import com.jason.service.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jason
 * @date 2018/10/12
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserModelMapper userModelMapper;

    @Override
    public UserModel findById(int id) {
        return userModelMapper.selectByPrimaryKey(id);
    }
}
