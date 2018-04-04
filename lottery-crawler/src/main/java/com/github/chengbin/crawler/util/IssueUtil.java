package com.github.chengbin.crawler.util;

import com.github.chengbin.core.util.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhangcb
 * @created 2018-01-16 18:07.
 */
public class IssueUtil {

    /**
     * 根据周几和日期获取竞彩期次
     * @param week
     * @param date
     * @return
     */
    public static String getIssueDay(String week, Date date){
        String weekTmp = DateUtil.getWeekOfDate(date);
        while (!week.equals(weekTmp)){
            date = DateUtil.addDay(date,-1);
            weekTmp = DateUtil.getWeekOfDate(date);
        }
        String issue = new SimpleDateFormat("yyyyMMdd").format(date);
        return issue;
    }
}
