package com.jason.springcloud.user.userservice.dto;

import com.jason.springcloud.user.userservice.common.ResponseEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Jason
 * @date 2018/10/17
 */
@ApiModel
public class ResponseDTO {
    @ApiModelProperty(value = "响应代码")
    private int code;
    @ApiModelProperty(value = "响应说明")
    private String msg;
    @ApiModelProperty(value = "响应数据")
    private Object data;

    public ResponseDTO() {
    }

    public ResponseDTO(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
