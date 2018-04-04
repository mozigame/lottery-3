package com.github.chengbin.order.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * @author zhangcb
 * @created 2018-01-18 18:21.
 */
@Data
public class OrderForm implements Serializable {

    @NotEmpty(message = "奖期不能为空")
    private Integer lotteryId; //彩票ID

    @NotEmpty(message = "奖期不能为空")
    private String issue;//奖期

    @NotEmpty(message = "玩法类型不能为空")
    private Integer betType;//玩法类型

    @NotEmpty(message = "方案购买类型不能为空")
    private Integer buyType;//方案购买类型 0：合买；1：代购

    @NotEmpty(message = "过关方式不能为空")
    private String pass;//过关方式

    @NotEmpty(message = "投注类型不能为空")
    private String playType;//投注类型

    @NotEmpty(message = "投注倍数不能为空")
    private Integer multiple=1;//倍数

    @NotEmpty(message = "方案金额不能为空")
    private int schemeAmount;//方案金额

    @NotEmpty(message = "方案内容不能为空")
    private String schemeNumber;//方案号码

    private String schemeDesc;//方案描述

    private String clientIp; //客户端IP

    private String device;//设备号

    @NotEmpty(message = "请求来源不能为空")
    private Integer source;//请求来源

}
