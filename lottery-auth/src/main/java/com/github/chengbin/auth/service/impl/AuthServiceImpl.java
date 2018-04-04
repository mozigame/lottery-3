package com.github.chengbin.auth.service.impl;

import com.github.chengbin.auth.bean.UserInfo;
import com.github.chengbin.auth.entity.User;
import com.github.chengbin.auth.jwt.JwtTokenUtil;
import com.github.chengbin.auth.jwt.JwtUser;
import com.github.chengbin.auth.service.AuthService;
import com.github.chengbin.auth.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/14.
 */
@Slf4j
@Service
public class AuthServiceImpl implements AuthService {

    private JwtTokenUtil jwtTokenUtil;
    private UserService  userService;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    public AuthServiceImpl(
            JwtTokenUtil jwtTokenUtil,
            UserService userService) {
        this.jwtTokenUtil = jwtTokenUtil;
        this.userService = userService;
    }

    public User register(User userToAdd) {
        final String username = userToAdd.getUsername();
        if(userService.findByUsername(username)!=null) {
            return null;
        }
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        final String rawPassword = userToAdd.getPassword();
        userToAdd.setPassword(encoder.encode(rawPassword));
        userToAdd.setLastPasswordResetDate(new Date());
        userService.insert(userToAdd);
        return userToAdd;
    }

    @Override
    public String login(String username, String password) {
        UserInfo userInfo = userService.validate(username,password);
        String token = "";
        if (null != userInfo) {
            token = jwtTokenUtil.generateToken(userInfo.getUsername());
        }
        return token;
    }

    @Override
    public String refresh(String oldToken) {
        final String token = oldToken.substring(tokenHead.length());
        String username = jwtTokenUtil.getUsernameFromToken(token);
        User user =userService.findByUsername(username);
        if (jwtTokenUtil.canTokenBeRefreshed(token, user.getLastPasswordResetDate())){
            return jwtTokenUtil.refreshToken(token);
        }
        return null;
    }

    public boolean validate(String token) throws Exception{
        String username = jwtTokenUtil.getUsernameFromToken(token);
        if (username != null) {
            User user = userService.findByUsername(username);
            JwtUser jwtUser = new JwtUser();
            BeanUtils.copyProperties(user,jwtUser);
            //2.验证token是否有效
            if (jwtTokenUtil.validateToken(token, jwtUser)) {
                log.info("authenticated user " + username + ", token is avaliable!");
                return true;
            }
        }
        return false;
    }

    public void invalid(String token) throws Exception{
        //TODO
    }

//    public String login(String username, String password) throws Exception {
//        UserInfo info = userService.validate(username,password);
//        String token = "";
//        if (!StringUtils.isEmpty(info.getId())) {
//            token = jwtTokenUtil.generateToken(new JWTInfo(info.getUsername(), info.getId() + "", info.getName()));
//        }
//        return token;
//    }


}
