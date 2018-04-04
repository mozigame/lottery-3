package com.github.chengbin.order.enums;

import lombok.Getter;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/18.
 */
@Getter
public enum OrderStatusEnum implements CodeEnum {
    DEAL_WAIT(0, "代办中"),
    DEAL_SUCCESS(1, "代办成功"),
    DEAL_FAIL(2, "代办失败"),
    PRIZE_LOST(3, "未中奖"),
    PRIZE_WIN(4, "已中奖"),
    PRIZE_SEND(5, "已派奖"),
    ;

    private Integer code;

    private String message;


    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
