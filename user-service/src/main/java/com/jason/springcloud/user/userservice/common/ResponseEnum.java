package com.jason.springcloud.user.userservice.common;

/**
 * @author Jason
 * @date 2018/10/18
 */
public enum ResponseEnum{

    SUCCESS(1, "SUCCESS"), ERROR(0, "ERROR"), FAILD(-1, "FAILD");

    private int code;
    private String text;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    // 普通方法
    public static String getTxt(int index) {
        for (ResponseEnum c : ResponseEnum.values()) {
            if (c.getCode() == index) {
                return c.text;
            }
        }
        return null;
    }

    ResponseEnum(int code, String text) {
        this.code = code;
        this.text = text;
    }
}
