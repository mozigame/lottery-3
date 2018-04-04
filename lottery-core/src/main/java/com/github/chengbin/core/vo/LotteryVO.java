package com.github.chengbin.core.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhangcb
 * @created 2018-01-19 10:28.
 */
public class LotteryVO implements Serializable {

    private Integer id;

    private String name;

    private Integer maxSellIssue;

    private Integer limitMul;

    private Integer webSellStatus;

    private Integer wapSellStatus;

    private Integer clientSellStatus;

    private Integer orderValue;

    private Boolean highLight;

    private String message;

    private Date createTime;

    private Date updateTime;

    private String prize;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaxSellIssue() {
        return maxSellIssue;
    }

    public void setMaxSellIssue(Integer maxSellIssue) {
        this.maxSellIssue = maxSellIssue;
    }

    public Integer getLimitMul() {
        return limitMul;
    }

    public void setLimitMul(Integer limitMul) {
        this.limitMul = limitMul;
    }

    public Integer getWebSellStatus() {
        return webSellStatus;
    }

    public void setWebSellStatus(Integer webSellStatus) {
        this.webSellStatus = webSellStatus;
    }

    public Integer getWapSellStatus() {
        return wapSellStatus;
    }

    public void setWapSellStatus(Integer wapSellStatus) {
        this.wapSellStatus = wapSellStatus;
    }

    public Integer getClientSellStatus() {
        return clientSellStatus;
    }

    public void setClientSellStatus(Integer clientSellStatus) {
        this.clientSellStatus = clientSellStatus;
    }

    public Integer getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(Integer orderValue) {
        this.orderValue = orderValue;
    }

    public Boolean getHighLight() {
        return highLight;
    }

    public void setHighLight(Boolean highLight) {
        this.highLight = highLight;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }
}
