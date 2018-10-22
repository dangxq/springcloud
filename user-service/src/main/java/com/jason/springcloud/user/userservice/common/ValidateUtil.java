package com.jason.springcloud.user.userservice.common;

import org.springframework.util.StringUtils;

/**
 * @author Jason
 * @date 2018/10/17
 */
public class ValidateUtil {

    public static String validateLoginParams(String user, String pwd) {
        if (StringUtils.isEmpty(user)){
            return "userName is Empty";
        }
        if (StringUtils.isEmpty(pwd)){
            return "password is Empty";
        }
        return null;
    }
}
