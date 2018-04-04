package com.github.chengbin.auth.jwt;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.chengbin.auth.bean.UserInfo;

import java.util.Date;

/**
 * 安全定制一个，不要使用UserDetails
 * @author zhangcb
 * @created 2017-12-14 17:04.
 */
public class JwtUser extends UserInfo {
    private Long id;
    private String username;
    private String password;
    private Date lastPasswordResetDate;


    @JsonIgnore
    public Long getId() {
        return id;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @JsonIgnore
    public Date getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }
}
