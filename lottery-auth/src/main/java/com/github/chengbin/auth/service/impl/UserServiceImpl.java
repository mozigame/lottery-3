package com.github.chengbin.auth.service.impl;

import com.github.chengbin.auth.bean.UserInfo;
import com.github.chengbin.auth.entity.User;
import com.github.chengbin.auth.mapper.UserMapper;
import com.github.chengbin.auth.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangcb
 * @created 2017-12-05 14:44.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    public User selectByPrimaryKey(Long id){
        return userMapper.selectByPrimaryKey(id);
    }

    public int insert(User record){
        return userMapper.insert(record);
    }

    public int updateByPrimaryKey(User record){
        return userMapper.updateByPrimaryKeySelective(record);
    }

    public int deleteByPrimaryKey(Long id){
        return userMapper.deleteByPrimaryKey(id);
    }

    /**
     * 创建用户
     * @param user
     */
    public int createUser(User user) {
        //加密密码
//        passwordHelper.encryptPassword(user);
        return userMapper.insert(user);
    }

    /**
     * 修改密码
     * @param userId
     * @param newPassword
     */
    public void changePassword(Long userId, String newPassword) {
        User user =userMapper.selectByPrimaryKey(userId);
        user.setPassword(newPassword);
        //passwordHelper.encryptPassword(user);
        userMapper.updateByPrimaryKey(user);
    }


    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }


    public List<User> queryAll(){
        return userMapper.queryAll();
    }

    /**
     * 验证登录
     * @param username
     * @param password
     * @return
     */
    public UserInfo validate(String username, String password){
        User user = userMapper.findByUsername(username);
        if(null == user){
            return null;
        }

/*      TODO
        //方便测试，暂时去掉
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if (encoder.matches(password, user.getPassword())) {
            UserInfo info = new UserInfo();
            BeanUtils.copyProperties(user, info);
            return info;
        }*/
        UserInfo info = new UserInfo();
        BeanUtils.copyProperties(user, info);
        return info;
    }
}
