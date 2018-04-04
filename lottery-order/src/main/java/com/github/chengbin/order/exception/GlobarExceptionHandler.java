package com.github.chengbin.order.exception;

import com.github.chengbin.order.utils.ResultUtil;
import com.github.chengbin.order.vo.ResultVO;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by Ldlood on 2017/8/13.
 */
@ControllerAdvice
public class GlobarExceptionHandler {


    @ExceptionHandler(value = OrderException.class)
    @ResponseBody
    public ResultVO handlerSellerException(OrderException e) {
        return ResultUtil.error(e.getCode(), e.getMessage());

    }

}
