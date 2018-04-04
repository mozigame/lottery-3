package com.github.chengbin.order.mapper;

import com.github.chengbin.order.entity.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}