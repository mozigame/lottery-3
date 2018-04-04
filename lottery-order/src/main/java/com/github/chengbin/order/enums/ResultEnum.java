package com.github.chengbin.order.enums;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/18.
 */
public enum ResultEnum {

    PARAM_ERROR(1, "参数不正确"),

    LOTTERY_NOT_EXIST(2, "彩种不存在!"),
    LOTTERY_NOT_SALE(3, "彩种未开售!"),
    LOTTERY_ORVER_MULTILPLE_LIMIT(4, "超过购买倍数限制!"),

    ISSUE_NOT_EXIST(5, "奖期不存在!"),
    ISSUE_NOT_SALE(6, "奖期未开售!"),
    ISSUE_OVER_SALE(7, "奖期已截止销售!"),

    MATCH_NOT_EXIST(8, "比赛不存在!"),
    MATCH_IS_OVER(9, "比赛已经截止销售!"),


    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
