package com.github.chengbin.order.service.impl;

import com.github.chengbin.core.constant.IssueConstants;
import com.github.chengbin.core.constant.LotteryConstants;
import com.github.chengbin.core.enums.SourceTypeEnum;
import com.github.chengbin.core.util.IdWorker;
import com.github.chengbin.core.vo.IssueVO;
import com.github.chengbin.core.vo.LotteryVO;
import com.github.chengbin.order.entity.Order;
import com.github.chengbin.order.enums.ResultEnum;
import com.github.chengbin.order.exception.OrderException;
import com.github.chengbin.order.feign.FootballFeign;
import com.github.chengbin.order.feign.IssueFeign;
import com.github.chengbin.order.feign.LotteryFeign;
import com.github.chengbin.order.form.OrderForm;
import com.github.chengbin.order.mapper.OrderMapper;
import com.github.chengbin.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/18.
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private LotteryFeign lotteryFeign;
    @Autowired
    private IssueFeign issueFeign;
    @Autowired
    private FootballFeign footballFeign;

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order createOrder(OrderForm orderForm) throws OrderException{
        //1.验证彩种是否停售
        checkLotteryIsSale(orderForm);
        //2.验证方案内容格式是否有效、比赛是否截止
        if(orderForm.getLotteryId() == LotteryConstants.FOOTBALL || orderForm.getLotteryId() == LotteryConstants.BASKETBALL){
            checkMatchIsOver(orderForm);
        }else{
            checkIssueIsOver(orderForm.getLotteryId(),orderForm.getIssue());
        }
        //3.保存订单
        Order order = new Order();
        BeanUtils.copyProperties(orderForm,order);
        order.setOrderId(IdWorker.INSTANCE.nextId());
        orderMapper.insert(order);
        //4.保存订单详情
        return order;
    }

    /**
     * 验证彩种是否停售
     * @param orderForm
     * @throws OrderException
     */
    public void checkLotteryIsSale(OrderForm orderForm) throws OrderException {
        LotteryVO lottery = lotteryFeign.selectLotteryInfo(orderForm.getLotteryId());
        if(null == lottery){
            log.error("【创建订单】彩种{}不存在!",orderForm.getLotteryId());
            throw new OrderException(ResultEnum.LOTTERY_NOT_EXIST);
        }
        if(orderForm.getSource().intValue() == SourceTypeEnum.H5.getCode()){
            if(lottery.getWapSellStatus() == LotteryConstants.STATUS_NOT_SALE){
                log.error("【创建订单】彩种{}未开售!",orderForm.getLotteryId());
                throw new OrderException(ResultEnum.LOTTERY_NOT_SALE);
            }
        }else{
            if(lottery.getClientSellStatus() == LotteryConstants.STATUS_NOT_SALE){
                log.error("【创建订单】彩种{}未开售!",orderForm.getLotteryId());
                throw new OrderException(ResultEnum.LOTTERY_NOT_SALE);
            }
        }
        if(orderForm.getMultiple() > lottery.getLimitMul()){
            log.error("【创建订单】购买倍数超过彩种:{}最大限购倍数:{}!",orderForm.getLotteryId(),lottery.getLimitMul());
            throw new OrderException(ResultEnum.LOTTERY_ORVER_MULTILPLE_LIMIT);
        }
    }
    /**
     * 验证奖期是否截止销售
     * @param lotteryId
     * @param issue
     * @throws Exception
     */
    public void checkIssueIsOver(Integer lotteryId, String issue) throws OrderException {
        IssueVO _issue = issueFeign.selectIssueInfo(lotteryId,issue);
        if(null == _issue){
            log.error("【创建订单】奖期:{}不存在,彩种:{}",issue,lotteryId);
            throw new OrderException(ResultEnum.ISSUE_NOT_EXIST);
        }
        if(_issue.getSell() == IssueConstants.STATUS_NOT_SALE){
            log.error("【创建订单】奖期:{}未开售,彩种:{}",issue,lotteryId);
            throw new OrderException(ResultEnum.ISSUE_NOT_SALE);
        }
        if(_issue.getSellEndTime().getTime() < new Date().getTime()){
            log.error("【创建订单】奖期:{}已截止,彩种:{}",issue,lotteryId);
            throw new OrderException(ResultEnum.ISSUE_OVER_SALE);
        }
    }

    /**
     * 验证比赛是否截止销售
     * @param orderForm
     * @throws OrderException
     */
    public void checkMatchIsOver(OrderForm orderForm) throws OrderException {
        if (orderForm.getLotteryId() == LotteryConstants.FOOTBALL) {
            boolean ret = footballFeign.checkMatchIsOver(orderForm.getBetType(),orderForm.getPass(),orderForm.getSchemeNumber());
            if(ret){
                log.error("【创建订单】比赛已经截止!");
                throw new OrderException(ResultEnum.MATCH_IS_OVER);
            }
        } else if (orderForm.getLotteryId() == LotteryConstants.BASKETBALL) {
            //TODO
        }
    }

}
