package com.github.chengbin.order.service;

import com.github.chengbin.order.entity.Order;
import com.github.chengbin.order.exception.OrderException;
import com.github.chengbin.order.form.OrderForm;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/18.
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderForm
     * @return
     */
    Order createOrder(OrderForm orderForm) throws OrderException;


}
