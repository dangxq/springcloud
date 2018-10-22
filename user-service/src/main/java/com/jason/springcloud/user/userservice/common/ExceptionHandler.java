package com.jason.springcloud.user.userservice.common;

import com.jason.springcloud.user.userservice.dto.ResponseDTO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Jason
 * @date 2018/10/17
 */
@ControllerAdvice
@ResponseBody
public class ExceptionHandler {
    public ResponssEntity<ResponseDTO> handleException(Exception e){
        ResponseDTO responseDTO = new ResponseDTO();
    }

}
