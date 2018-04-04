package com.github.chengbin.core.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhangcb
 * @Description: 彩种Id
 * @Date: Created on 2018/1/16.
 */
public class LotteryConstants {


    /**
     * 彩种销售状态
     */
    public static final Integer STATUS_NOT_SALE = 0;    //未开售
    public static final Integer STATUS_SALE = 1;        //开售
    /**
     * 彩票类型Spring初始化前缀
     * worker_ 加 彩种ID
     */
    public static final String LOTTERY_TYPE_SPRING_TEXT = "worker_";

    /**
     * 快开型彩票ID
     */
    public static final int SSL = 10037;  //时时乐
    public static final int SSC = 10038;    //老时时彩
    public static final int SD115 = 10046;// 山东11选5  OPEN
    public static final int JX115 = 10060;// 多乐彩   OPEN
    public static final int JXSSC = 10061;// 新时时彩 OPEN(限定用户)
    public static final int CQKL = 10064;  //重庆快乐十分
    public static final int NMK3 = 10065;  //内蒙快三
    public static final int SH115 = 10066;  //上海11选5
    public static final int XYSC = 10067;  //幸运赛车
    public static final int AHK3 = 10073;//安徽快3
    public static final int GXK3 = 10074;//广西快3
    public static final int KLPK3 = 0;  //快乐扑克3  ，暂定
    public static final int KL123 = 10056;// 快乐123
    public static final int SHK3 = 10085; //上海快3

    /**
     * 福彩数字彩
     */
    public static final int THREED = 10025;   //福彩3D
    public static final int DCBALL = 10032;  //双色球
    public static final int HAPPY7 = 10033;   //七乐彩
    public static final int ZJ155 = 10035; //福彩15选5

    /**
     * 体彩数字彩
     */
    public static final int pl3ID = 10023;  //排列3
    public static final int pl5ID = 10024;  //排列5
    public static final int pl35ID = 10024;  //排列3/5
    public static final int lottoID = 10026;     //超级大乐透
    public static final int ZJ7 = 10027;    //体彩6+1
    public static final int ZJ205 = 10028;   //体彩20选5
    public static final int NAT225 = 10029;   //全国22选5
    public static final int qxcID = 10030; //七星彩

    /**
     * 竞彩
     */
    public static final int BJDC = 10057;// 足球单场
    public static final int BASKETBALL = 10058;// 篮球
    public static final int FOOTBALL = 10059;// 足球
    public static final int SFGG = 10068; //单场胜负过关

    /**
     * 传统足彩
     */
    public static final int TOTO14 = 10039;      //胜负14场
    public static final int TOTO9 = 10040;  //任9场
    public static final int GOAL4 = 10042;    //4场进球彩
    public static final int TOTO6 = 10041;   //6场半全场
    public static final int GD115 = 10062;//11选5 不再销售，但分析走势还在，不能删除

    public static final Map<Object, String> lotteryName = new HashMap<Object, String>() {{
        put(SSL, "时时乐");
        put(SSC, "老时时彩");
        put(SD115, "山东11选5");
        put(JX115, "多乐彩 ");
        put(JXSSC, "新时时彩");
        put(CQKL, "重庆快乐十分");
        put(NMK3, "内蒙快三");
        put(SH115, "上海11选5");
        put(XYSC, "幸运赛车");
        put(AHK3, "安徽快3");
        put(GXK3, "广西快3");
        put(KLPK3, "快乐扑克3");
        put(THREED, "福彩3D");
        put(DCBALL, "双色球");
        put(HAPPY7, "七乐彩");
        put(ZJ155, "福彩15选5");
        put(pl3ID, "排列3");
        put(pl5ID, "排列5");
        put(lottoID, "超级大乐透");
        put(ZJ7, "体彩6+1");
        put(ZJ205, "体彩20选5");
        put(NAT225, "全国22选5");
        put(qxcID, "七星彩");
        put(BJDC, "足球单场");
        put(BASKETBALL, "篮球");
        put(FOOTBALL, "足球");
        put(SFGG, "单场胜负过关");
        put(TOTO14, "胜负14场");
        put(TOTO9, "任选9场");
        put(GOAL4, "4场进球彩");
        put(TOTO6, "6场半全场");
        put(GD115, "11选5");
        put(KL123, "快乐123");

    }};

    public static String getLotteryName(Integer lotteryId) {
        return lotteryName.get(lotteryId);
    }
}
