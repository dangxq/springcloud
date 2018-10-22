package com.jason.springcloud.user.userservice.dao;


import com.jason.springcloud.user.userservice.model.UserModel;

public interface UserModelDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserModel record);

    int insertSelective(UserModel record);

    UserModel selectByPrimaryKey(Integer id);

    UserModel selectByUserName(String userName);

    int updateByPrimaryKeySelective(UserModel record);

    int updateByPrimaryKey(UserModel record);
}