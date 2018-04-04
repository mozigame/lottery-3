package com.github.chengbin.auth.service;

import com.github.chengbin.auth.entity.User;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/14.
 */
public interface AuthService {

    User register(User user);
    String login(String username, String password) throws Exception;
    String refresh(String oldToken);
    boolean validate(String token) throws Exception;
    void invalid(String token) throws Exception;
}
