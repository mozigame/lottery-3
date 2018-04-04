package com.github.chengbin.auth.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/14.
 */
public class UserInfo implements Serializable {

    private Long id;
    private String username;
    private String password;
    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
