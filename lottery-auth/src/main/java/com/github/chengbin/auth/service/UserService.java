package com.github.chengbin.auth.service;


import com.github.chengbin.auth.bean.UserInfo;
import com.github.chengbin.auth.entity.User;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Set;

/**
 * @author zhangcb
 * @created on 2017/12/5.
 */
public interface UserService {

    User selectByPrimaryKey(Long id);

    int insert(User record);

    int updateByPrimaryKey(User record);

    int deleteByPrimaryKey(Long id);
    /**
     * 创建用户
     * @param user
     */
    public int createUser(User user);

    /**
     * 修改密码
     * @param userId
     * @param newPassword
     */
    public void changePassword(Long userId, String newPassword);


    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    public User findByUsername(String username);


    List<User> queryAll();

    UserInfo validate(String username, String password);
}
