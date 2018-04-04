package com.github.chengbin.crawler.entity;

import java.io.Serializable;
import java.util.Date;

public class Issue implements Serializable {
    private Integer id;

    private Integer lotteryId;

    private String issue;

    private String drawNumber;

    private Date drawTime;

    private Integer sell;

    private Date sellStartTime;

    private Date sellEndTime;

    private Integer state;

    private static final long serialVersionUID = 1L;

    public Issue(Integer lotteryId, String issue, Integer sell, Date sellEndTime) {
        this.lotteryId = lotteryId;
        this.issue = issue;
        this.sell = sell;
        this.sellEndTime = sellEndTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLotteryId() {
        return lotteryId;
    }

    public void setLotteryId(Integer lotteryId) {
        this.lotteryId = lotteryId;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue == null ? null : issue.trim();
    }

    public String getDrawNumber() {
        return drawNumber;
    }

    public void setDrawNumber(String drawNumber) {
        this.drawNumber = drawNumber == null ? null : drawNumber.trim();
    }

    public Date getDrawTime() {
        return drawTime;
    }

    public void setDrawTime(Date drawTime) {
        this.drawTime = drawTime;
    }

    public Integer getSell() {
        return sell;
    }

    public void setSell(Integer sell) {
        this.sell = sell;
    }

    public Date getSellStartTime() {
        return sellStartTime;
    }

    public void setSellStartTime(Date sellStartTime) {
        this.sellStartTime = sellStartTime;
    }

    public Date getSellEndTime() {
        return sellEndTime;
    }

    public void setSellEndTime(Date sellEndTime) {
        this.sellEndTime = sellEndTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}