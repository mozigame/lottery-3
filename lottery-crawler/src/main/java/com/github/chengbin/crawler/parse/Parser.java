package com.github.chengbin.crawler.parse;

/**
 * @author zhangcb
 * @created on 2018/1/16.
 */
public interface Parser<T> {
    T parse(String url);
}
