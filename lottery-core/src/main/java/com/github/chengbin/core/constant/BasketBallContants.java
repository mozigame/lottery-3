package com.github.chengbin.core.constant;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date: 13-2-21
 * Time: 下午1:39
 * To change this template use File | Settings | File Templates.
 */
public class BasketBallContants {

    /**
     * 9188 篮彩玩法
     */
    public final static String LOTTERY_BASKETBALL_SF = "SF";//竞彩篮球胜负
    public final static String LOTTERY_BASKETBALL_RFSF = "RFSF";//竞彩篮球让分胜负
    public final static String LOTTERY_BASKETBALL_SFC = "SFC";//竞彩篮球胜分差
    public final static String LOTTERY_BASKETBALL_DXF = "DXF";//竞彩篮球大小分
    public final static String LOTTERY_BASKETBALL_HHTZ = "HH";//竞彩篮球混合投注

    public final static int TYPE_SF = 0;//胜负
    public final static int TYPE_RFSF = 1;//让球胜负
    public final static int TYPE_SFC = 2;//胜分差
    public final static int TYPE_DXF = 3;//大小分
    public final static int TYPE_HHTZ = 4;//混合

    public final static int SINGLE_TYPE = 0;
    public final static int PASS_TYPE = 1;

    /**
     * 篮球投注状态-销售中
     */
    public final static int BET_STATUS_SALES = 0;

    /**
     * 篮球投注状态-停止销售
     */
    public final static int BET_STATUS_STOP = 1;
    /**
     * 篮球投注状态-未开玩法
     */
    public final static int BET_STATUS_NOT_SELL = 5;

//    /**
//     * 平台赛事状态-没有赛果
//     */
//    public final static int STATUS_DEFAULT = -1;
//
//    /**
//     * 平台赛事状态-有赛果未计奖
//     */
//    public final static int STATUS_RESULT = 0;
//
//    /**
//     * 平台赛事状态-已有开奖结果
//     */
//    public final static int STATUS_OVER = 1;
//    /**
//     * 平台赛事状态-已派奖
//     */
//    public final static int STATUS_PRIZE = 2;

    //***********************新版计奖对阵状态**************************
    public final static int MATCH_STATUS_DEFAULT = -1;//比赛状态-默认-销售中
    public final static int MATCH_STATUS_STOP = 0;//比赛状态-已停售
    public final static int MATCH_STATUS_CANCEL = 1;//比赛状态-已取消
    public final static int MATCH_STATUS_ENDTM = 2;//比赛状态-已截止
    //***********************新版计奖对阵状态**************************

    /*
    恒朋体彩玩法代号
     */
    public final static String BASKETBALL_CODE_SF = "BSK001";
    public final static String BASKETBALL_CODE_RFSF = "BSK002";
    public final static String BASKETBALL_CODE_SFC = "BSK003";
    public final static String BASKETBALL_CODE_DXF = "BSK004";
    public final static String BASKETBALL_CODE_HHTZ = "BSK005";

    public final static String BASKETBALL_PLAY_RFSF_DESC = "让分胜负";
    public final static String BASKETBALL_PLAY_SFC_DESC = "胜分差";
    public final static String BASKETBALL_PLAY_DXF_DESC = "大小分";
    public final static String BASKETBALL_PLAY_SF_DESC = "胜负";
    public final static String BASKETBALL_PLAY_HHTZ_DESC = "混合投注";
    public final static String BASKETBALL_PLAY_HUNHETZ_DESC = "竞彩篮球混合投注";

}
