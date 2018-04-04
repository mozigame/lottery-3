package com.github.chengbin.auth;

/**
 * @author zhangcb
 * @created 2018-02-02 13:51.
 */
interface Parse<K,V> {
    void parse(K k, V v);
}
