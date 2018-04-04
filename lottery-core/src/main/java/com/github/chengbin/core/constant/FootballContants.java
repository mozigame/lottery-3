package com.github.chengbin.core.constant;

/**
 * @Author: zhangcb
 * @Description:
 * @Date: Created on 2018/1/16.
 */
public class FootballContants {

    //比赛状态
    public static final Integer MATCH_STATUS_CANCEL = -1;      //比赛取消
    public static final Integer MATCH_STATUS_NOT_SALE = 0;     //比赛未开售
    public static final Integer MATCH_STATUS_SALE = 1;         //比赛开售

    //玩法状态
    public static final Integer BET_STATUS_NOT_SALE = 0;       //未开售
    public static final Integer BET_STATUS_SALE = 1;           //开售


    /**
     * 足球胜平负玩法代号
     */
    public final static int TYPE_SPF = 0;
    /**
     * 足球总进球玩法代号
     */
    public final static int TYPE_ZJQ = 1;
    /**
     * 足球比分玩法代号
     */
    public final static int TYPE_BF = 2;
    /**
     * 足球半全场玩法代号
     */
    public final static int TYPE_BQC = 3;
    /**
     * 足球混合投注玩法代号
     */
    public final static int TYPE_HHTZ = 4;
    /**
     * 足球胜平负玩法代号
     */
    public final static int TYPE_RQSPF = 5;
    /**
     * 2选1
     */
    public final static int TYPE_2X1 = 6;
}
