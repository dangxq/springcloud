package com.jason.springcloud.user.userservice;

import com.jason.springcloud.user.userservice.dao.UserModelDao;
import com.jason.springcloud.user.userservice.model.UserModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceApplicationTests {

    @Autowired
    private UserModelDao userModelDao;

    @Test
    public void getUserByUserName() {
        String userName = "Jason";
        UserModel userModel = userModelDao.selectByUserName(userName);
        System.out.println(userModel.getPassword());
    }

}
