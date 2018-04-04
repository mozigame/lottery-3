package com.github.chengbin.order.exception;

import com.github.chengbin.order.enums.ResultEnum;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/18.
 */
public class OrderException extends RuntimeException {

    private Integer code;

    private String message;

    public OrderException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public OrderException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
