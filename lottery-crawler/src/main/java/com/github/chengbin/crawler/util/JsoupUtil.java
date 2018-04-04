package com.github.chengbin.crawler.util;

import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * @author zhangcb
 * @created 2018-01-16 11:32.
 */
@Slf4j
public class JsoupUtil {

    public static final String AGENT = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36";

    public static  final Integer TIME_OUT = 60000;

    public static Document getDocument(String url) {
        try {
            return Jsoup.connect(url).userAgent(AGENT).timeout(TIME_OUT).ignoreContentType(true).get();
        } catch (IOException e) {
            log.error("请求失败:{}",url,e);
            return null;
        }
    }

    public static Document getDocument(String url, String host) {
        try {
            return Jsoup.connect(url).userAgent(AGENT).header("Host", host).timeout(TIME_OUT).ignoreContentType(true).get();
        } catch (IOException e) {
            log.error("请求失败:{}",url,e);
            return null;
        }
    }
}
