package com.github.chengbin.order.utils;


import com.github.chengbin.order.vo.ResultVO;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2017/12/13.
 */
public class ResultUtil {

    public static ResultVO success(Object obj){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(obj);
        return resultVO;
    }

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO error(Integer code, String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
