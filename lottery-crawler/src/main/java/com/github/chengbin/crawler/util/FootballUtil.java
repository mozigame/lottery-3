package com.github.chengbin.crawler.util;

import com.github.chengbin.core.constant.PlayTypeConstants;
import com.github.chengbin.crawler.constant.FootballContants;
import com.github.chengbin.crawler.entity.FootballMatch;

import java.util.Calendar;
import java.util.Date;

/**
 * @author zhangcb
 * @created 2018-01-16 18:18.
 */
public class FootballUtil {


    /**
     * 周一到周五(issue)             开赛时间0:00-9:15，截止时间23:45
     * 周一到周五                    开赛时间9:16-23:59，截止时间在比赛开赛时间基础上往前推15分钟截止
     * 周六到周日                    开赛时间1:00-9:15，截止时间00:45
     * 周六到周日                    开赛时间9:16-00:59，截止时间在比赛开赛时间基础上往前推15分钟截止
     * @return
     */
    public static Date getMatchEndTime(Integer week, Date matchTime) throws Exception{
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(matchTime);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        if(week >=1 && week <= 5){                  //周一到周五
            if(hour < 9 || (hour == 9 && minute <= 15)) {                                        //0点到9：15结束投注的比赛，提前到前一天
                calendar.add(Calendar.DAY_OF_MONTH,-1);
                calendar.set(Calendar.HOUR_OF_DAY,23);
                calendar.set(Calendar.MINUTE,45);
                calendar.set(Calendar.SECOND,0);
            } else {                                                                            //开赛时间9:16-23:59，截止时间在比赛开赛时间基础上往前推15分钟截止
                calendar.add(Calendar.MINUTE,-15);
            }
        }
        else                                        //周六到周末
        {
            if(hour >= 1&& hour < 9 || hour == 9 && minute <= 15){                              //开赛时间1:00-9:15，截止时间00:45
                calendar.set(Calendar.HOUR_OF_DAY,0);
                calendar.set(Calendar.MINUTE,45);
                calendar.set(Calendar.SECOND,0);
            }else {                                                                             //开赛时间9:16-00:59，截止时间在比赛开赛时间基础上往前推15分钟截止
                calendar.add(Calendar.MINUTE,-15);
            }
        }
        return calendar.getTime();
    }


    /**
     * 验证比赛是否截止或停售
     * @param match
     * @return true:停售 false:未停售
     */
    public static boolean isFootballMatchEnd(FootballMatch match) {
        if (match.getStatus() != FootballContants.MATCH_STATUS_SALE) {
            //不在销售中的
            return true;
        }
        if (System.currentTimeMillis() >=  match.getEndTime().getTime()) {
            return true;
        }
        return false;
    }
    /**
     * 检测玩法是否停售
     * @param bt
     * @param pt
     * @param match
     * @return true:停售 false:未停售
     */
    public static boolean isFootballBetSale(Integer bt, Integer pt, FootballMatch match) {
        if (pt == PlayTypeConstants.MATCH_SINGLE) {//足球单关
            if (bt == FootballContants.TYPE_SPF) {
                if (isStop(match.getSpfSingleStatus()))
                    return true;
                else
                    return false;
            } else if (bt == FootballContants.TYPE_ZJQ) {
                if (isStop(match.getZjqSingleStatus()))
                    return true;
                else
                    return false;
            } else if (bt == FootballContants.TYPE_BF) {
                if (isStop(match.getBfSingleStatus()))
                    return true;
                else
                    return false;
            } else if (bt == FootballContants.TYPE_BQC) {
                if (isStop(match.getBqcSingleStatus()))
                    return true;
                else
                    return false;
            } else if (bt == FootballContants.TYPE_RQSPF) {
                return isStop(match.getRqspfSingleStatus());
            }
        } else if (pt == PlayTypeConstants.MATCH_PASS) {//过关
            if (bt == FootballContants.TYPE_SPF) {
                if (isStop(match.getSpfPassStatus()))
                    return true;
                else
                    return false;
            } else if (bt == FootballContants.TYPE_ZJQ) {
                if (isStop(match.getZjqPassStatus()))
                    return true;
                else
                    return false;
            } else if (bt == FootballContants.TYPE_BF) {
                if (isStop(match.getBfPassStatus()))
                    return true;
                else
                    return false;
            } else if (bt == FootballContants.TYPE_BQC) {
                if (isStop(match.getBqcPassStatus()))
                    return true;
                else
                    return false;
            } else if (bt == FootballContants.TYPE_RQSPF) {
                return isStop(match.getRqspfPassStatus());
            } else if (bt == FootballContants.TYPE_HHTZ) {//混合过关
                boolean isSpf = false;
                boolean isRqSpf = false;
                boolean isZjq = false;
                boolean isBf = false;
                boolean isBqc = false;
                if (isStop(match.getSpfPassStatus())) {
                    isSpf = true;
                }
                if (isStop(match.getRqspfPassStatus())) {
                    isRqSpf = true;
                }
                if (isStop(match.getZjqPassStatus())) {
                    isZjq = true;
                }
                if (isStop(match.getBfPassStatus())) {
                    isBf = true;
                }
                if (isStop(match.getBqcPassStatus())) {
                    isBqc = true;
                }
                if (isSpf && isRqSpf && isZjq && isBf && isBqc) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
    public static boolean isStop(Integer status) {
        if (status != FootballContants.BET_STATUS_SALE) {
            return true;
        } else {
            return false;
        }
    }
}
