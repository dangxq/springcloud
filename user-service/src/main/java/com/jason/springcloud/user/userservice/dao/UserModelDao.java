package com.jason.springcloud.user.userservice.dao;


import com.jason.springcloud.user.userservice.model.UserModel;
import org.apache.ibatis.annotations.Param;

public interface UserModelDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserModel record);

    int insertSelective(UserModel record);

    UserModel selectByPrimaryKey(Integer id);

    UserModel selectByUserName(@Param("userName") String userName);

    int updateByPrimaryKeySelective(UserModel record);

    int updateByPrimaryKey(UserModel record);
}