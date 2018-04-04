package com.github.chengbin.order.mapper;

import com.github.chengbin.order.entity.OrderDetail;

public interface OrderDetailMapper {
    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);
}