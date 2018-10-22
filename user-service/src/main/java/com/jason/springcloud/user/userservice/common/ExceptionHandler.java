package com.jason.springcloud.user.userservice.common;

import com.jason.springcloud.user.userservice.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Jason
 * @date 2018/10/17
 */
@ControllerAdvice
@ResponseBody
public class ExceptionHandler {
    public ResponseEntity<ResponseDTO> handleException(Exception e){
        CommonException commonException = (CommonException) e;
        ResponseDTO response = new ResponseDTO(commonException.getCode(), e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
