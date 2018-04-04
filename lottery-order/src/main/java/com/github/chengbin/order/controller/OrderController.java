package com.github.chengbin.order.controller;

import com.github.chengbin.order.entity.Order;
import com.github.chengbin.order.enums.ResultEnum;
import com.github.chengbin.order.exception.OrderException;
import com.github.chengbin.order.form.OrderForm;
import com.github.chengbin.order.service.OrderService;
import com.github.chengbin.order.utils.ResultUtil;
import com.github.chengbin.order.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 下单
 *
 * @author zhangcb
 * @created 2018-01-18 18:16.
 */
@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private Registration    registration;       // 服务注册
    @Autowired
    private DiscoveryClient discoveryClient; // 服务发现客户端
    @Autowired
    private OrderService orderService;


    /**
     * 创建订单
     * @param orderForm
     * @param bindingResult
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ResultVO<Map<String, Long>> createOrder(@Valid OrderForm orderForm, BindingResult bindingResult) throws Exception{
        log.info("=========支付下单接口请求开始=========");
        ServiceInstance instance = serviceInstance();
        log.info("【购彩下单】/order/create,host:{},serviceId:{}",instance.getHost(),instance.getServiceId());

        if (bindingResult.hasErrors()) {
            log.error("【创建订单】参数不正确, orderForm={}", orderForm);
            throw new OrderException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        Order order = orderService.createOrder(orderForm);
        Map<String,Long> map = new HashMap<>();
        map.put("orderId", order.getOrderId());
        return ResultUtil.success(map);
    }

    /**
     * 支付订单
     * @param orderId
     */
    @RequestMapping(value = "/pay",method = RequestMethod.POST)
    public void pay(@RequestParam("orderId") Long orderId){
        //TODO
    }

    /**
     * 获取当前服务的服务实例
     *
     * @return ServiceInstance
     */
    public ServiceInstance serviceInstance() {
        List<ServiceInstance> list = discoveryClient.getInstances(registration.getServiceId());
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
