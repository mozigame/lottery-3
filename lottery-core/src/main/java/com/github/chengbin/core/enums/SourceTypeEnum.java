package com.github.chengbin.core.enums;

import lombok.Getter;

/**
 * @Author: zhangcb
 * @Description: 请求来源
 * @Date: Created on 2018/1/18.
 */
@Getter
public enum SourceTypeEnum {
    WEB(0, "网站"),
    H5(1, "H5"),
    ANDROID(2, "安卓客户端"),
    IOS(3, "IOS客户端"),
    ;

    private Integer code;

    private String message;


    SourceTypeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
