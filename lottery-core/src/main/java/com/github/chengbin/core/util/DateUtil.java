package com.github.chengbin.core.util;

import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * @author zhangcb
 * @created 2017-12-11 14:19.
 */
public class DateUtil {

    /**
     * 日期格式化成指定格式字符串
     * @param date
     * @param fm
     * @return
     */
    public static String dateToString(Date date, String fm) {
        SimpleDateFormat sdf = new SimpleDateFormat(fm);
        return sdf.format(date);
    }

    /**
     * 字符串转化为指定格式日期
     * @param date
     * @param fm
     * @return
     */
    public static Date stringToDate(String date, String fm) {
        SimpleDateFormat sdf = new SimpleDateFormat(fm);
        try{
            return sdf.parse(date);
        }catch (Exception e){
        }
        return null;
    }

    /**
     * 获取指定时间差的日期
     *
     * @param date date 基准日期
     * @param day  相差天数
     * @return Date, 返回的日期
     */
    public static Date addDay(Date date, int day) {
        Date result = null;
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, day);
        result = new Date(cal.getTime().getTime());
        return result;
    }

    /**
     * 获取当前日期是周几
     * @param date
     * @return 当前日期是周几
     */
    public static String getWeekOfDate(Date date) {
        String[] weekDays = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDays[w];
    }

    /**
     * 获取周几
     * @param week
     * @return
     */
    public static int getWeekDay(String week){
        if(StringUtils.isEmpty(week)){
            return -1;
        }
        switch (week){
            case "周一":
                return 1;
            case "周二":
                return 2;
            case "周三":
                return 3;
            case "周四":
                return 4;
            case "周五":
                return 5;
            case "周六":
                return 6;
            case "周日":
                return 7;
            default:
                return -1;
        }
    }
}
