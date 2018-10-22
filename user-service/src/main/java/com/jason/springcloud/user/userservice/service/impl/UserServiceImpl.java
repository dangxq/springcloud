package com.jason.springcloud.user.userservice.service.impl;

import com.jason.springcloud.user.userservice.common.ResponseEnum;
import com.jason.springcloud.user.userservice.dao.UserModelDao;
import com.jason.springcloud.user.userservice.dto.ResponseDTO;
import com.jason.springcloud.user.userservice.model.UserModel;
import com.jason.springcloud.user.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jason
 * @date 2018/10/17
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserModelDao userModelDao;
    @Override
    public ResponseDTO login(String userName, String password) {
        UserModel userModel = userModelDao.selectByUserName(userName);
        if (userModel == null){
            return new ResponseDTO(ResponseEnum.ERROR.getCode(), "用户名不存在");
        }
        if (!userModel.getPassword().equals(password)){
            return new ResponseDTO(ResponseEnum.ERROR.getCode(), "密码错误");
        }
        return new ResponseDTO(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getText());
    }
}
