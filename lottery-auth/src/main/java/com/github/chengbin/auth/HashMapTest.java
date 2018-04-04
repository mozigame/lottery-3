package com.github.chengbin.auth;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangcb
 * @created 2018-02-05 9:54.
 */
public class HashMapTest {

    public static void main(String[] args) {
        Map<String,String> map = new ConcurrentHashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");
        map.put("d","4");
        map.get("c");
    }
}
