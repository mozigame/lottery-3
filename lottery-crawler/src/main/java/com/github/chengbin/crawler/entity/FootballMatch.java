package com.github.chengbin.crawler.entity;

import java.io.Serializable;
import java.util.Date;

public class FootballMatch implements Serializable {
    private String matchId;

    private Integer jcwId;

    private String color;

    private String issue;

    private String number;

    private Integer weekday;

   private Integer homeTeamId;

    private String homeTeamName;

    private Integer guestTeamId;

    private String guestTeamName;

    private String league;

    private Date matchTime;

    private Date endTime;

    private String halfScore;

    private String lastScore;

    private Integer spfSingleStatus;

    private Integer spfPassStatus;

    private Integer rqspfSingleStatus;

    private Integer rqspfPassStatus;

    private Integer bqcSingleStatus;

    private Integer bqcPassStatus;

    private Integer zjqSingleStatus;

    private Integer zjqPassStatus;

    private Integer bfSingleStatus;

    private Integer bfPassStatus;

    private Integer status;

    //0-待处理 1-自动撤单中 2-赛果获取中 3-已有赛果待审核 4-赛果人工审核成功
    //5-系统审核成功 6-计算奖金成功 7-奖金汇总成功 8-奖金核对成功 9-自动派奖成功
    //10-过关统计完成 11-战绩统计完成 12-派送返点成功 99-场次处理结束
    private Integer state;

    private Boolean ihot;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId == null ? null : matchId.trim();
    }

    public Integer getJcwId() {
        return jcwId;
    }

    public void setJcwId(Integer jcwId) {
        this.jcwId = jcwId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue == null ? null : issue.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public Integer getWeekday() {
        return weekday;
    }

    public void setWeekday(Integer weekday) {
        this.weekday = weekday;
    }

    public Integer getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(Integer homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName == null ? null : homeTeamName.trim();
    }

    public Integer getGuestTeamId() {
        return guestTeamId;
    }

    public void setGuestTeamId(Integer guestTeamId) {
        this.guestTeamId = guestTeamId;
    }

    public String getGuestTeamName() {
        return guestTeamName;
    }

    public void setGuestTeamName(String guestTeamName) {
        this.guestTeamName = guestTeamName == null ? null : guestTeamName.trim();
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league == null ? null : league.trim();
    }

    public Date getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(Date matchTime) {
        this.matchTime = matchTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getHalfScore() {
        return halfScore;
    }

    public void setHalfScore(String halfScore) {
        this.halfScore = halfScore == null ? null : halfScore.trim();
    }

    public String getLastScore() {
        return lastScore;
    }

    public void setLastScore(String lastScore) {
        this.lastScore = lastScore == null ? null : lastScore.trim();
    }

    public Integer getSpfSingleStatus() {
        return spfSingleStatus;
    }

    public void setSpfSingleStatus(Integer spfSingleStatus) {
        this.spfSingleStatus = spfSingleStatus;
    }

    public Integer getSpfPassStatus() {
        return spfPassStatus;
    }

    public void setSpfPassStatus(Integer spfPassStatus) {
        this.spfPassStatus = spfPassStatus;
    }

    public Integer getRqspfSingleStatus() {
        return rqspfSingleStatus;
    }

    public void setRqspfSingleStatus(Integer rqspfSingleStatus) {
        this.rqspfSingleStatus = rqspfSingleStatus;
    }

    public Integer getRqspfPassStatus() {
        return rqspfPassStatus;
    }

    public void setRqspfPassStatus(Integer rqspfPassStatus) {
        this.rqspfPassStatus = rqspfPassStatus;
    }

    public Integer getBqcSingleStatus() {
        return bqcSingleStatus;
    }

    public void setBqcSingleStatus(Integer bqcSingleStatus) {
        this.bqcSingleStatus = bqcSingleStatus;
    }

    public Integer getBqcPassStatus() {
        return bqcPassStatus;
    }

    public void setBqcPassStatus(Integer bqcPassStatus) {
        this.bqcPassStatus = bqcPassStatus;
    }

    public Integer getZjqSingleStatus() {
        return zjqSingleStatus;
    }

    public void setZjqSingleStatus(Integer zjqSingleStatus) {
        this.zjqSingleStatus = zjqSingleStatus;
    }

    public Integer getZjqPassStatus() {
        return zjqPassStatus;
    }

    public void setZjqPassStatus(Integer zjqPassStatus) {
        this.zjqPassStatus = zjqPassStatus;
    }

    public Integer getBfSingleStatus() {
        return bfSingleStatus;
    }

    public void setBfSingleStatus(Integer bfSingleStatus) {
        this.bfSingleStatus = bfSingleStatus;
    }

    public Integer getBfPassStatus() {
        return bfPassStatus;
    }

    public void setBfPassStatus(Integer bfPassStatus) {
        this.bfPassStatus = bfPassStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public Boolean getIhot() {
        return ihot;
    }

    public void setIhot(Boolean ihot) {
        this.ihot = ihot;
    }
}