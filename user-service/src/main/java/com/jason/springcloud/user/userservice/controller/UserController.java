package com.jason.springcloud.user.userservice.controller;

import com.jason.springcloud.user.userservice.common.ResponseEnum;
import com.jason.springcloud.user.userservice.common.ValidateUtil;
import com.jason.springcloud.user.userservice.dto.ResponseDTO;
import com.jason.springcloud.user.userservice.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;


/**
 * @author Jason
 * @date 2018/10/17
 */
@RestController
@RequestMapping("/user")
@Api(value = "USER_SERVICE API")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hi")
    @ApiOperation(value="HI", notes="HELLO")
    public ResponseDTO hi(){
        return new ResponseDTO(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getText());
    }

    @PostMapping("/login")
    @ApiOperation(value="登录", notes="用户登录接口")
    public ResponseDTO login(@RequestParam String userName, @RequestParam String password){

        String error = ValidateUtil.validateLoginParams(userName, password);
        if (!StringUtils.isEmpty(error)){
            return new ResponseDTO(ResponseEnum.ERROR.getCode(), error);
        }
        return userService.login(userName, password);
    }

}
