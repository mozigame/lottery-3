package com.github.chengbin.order.enums;

import lombok.Getter;

/**
 * @Author: zhangcb
 * @Description: 彩种开停售状态
 * @Date: Created on 2018/1/18.
 */
@Getter
public enum LotteryStatusEnum implements CodeEnum {
    WEB(0, "未开售"),
    H5(1, "开售"),
    ;

    private Integer code;

    private String message;


    LotteryStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
