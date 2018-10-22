package com.jason.springcloud.user.userservice.common;

/**
 * @author Jason
 * @date 2018/10/17
 */
public class CommonException extends RuntimeException {
    private int code;
    private String msg;

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
}
