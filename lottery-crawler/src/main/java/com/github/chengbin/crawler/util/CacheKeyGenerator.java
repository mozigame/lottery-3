package com.github.chengbin.crawler.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ClassUtils;

import java.lang.reflect.Array;

/**
 * 缓存关键词生成器
 *
 * @author zhangcb
 * @time 2018-01-16 21:34
 */
public class CacheKeyGenerator {

    private static final Logger LOGGER = LoggerFactory.getLogger(CacheKeyGenerator.class);
    // custom cache key
    private static final int NO_PARAM_KEY = 0;
    private static final int NULL_PARAM_KEY = -1;

    public static <T> String generate(Class<T> targetClass, String methodName, Object... params) {
        String finalKey;
        StringBuilder key = new StringBuilder();
        key.append(targetClass.getSimpleName()).append(".").append(methodName).append(":");
        // 无参数时
        if (params.length == 0) {
            finalKey = key.append(NO_PARAM_KEY).toString();
            LOGGER.debug("Using Cache Key={}, HashCode={}", finalKey, finalKey.hashCode());
            return finalKey;
        }
        // 有参数时
        for (Object param : params) {
            if (param == null) {
                LOGGER.warn("Input Null Param For Spring Cache, Use Default Key={}", NULL_PARAM_KEY);
                key.append(NULL_PARAM_KEY);
            } else if (ClassUtils.isPrimitiveArray(param.getClass())) {
                int length = Array.getLength(param);
                for (int i = 0; i < length; i++) {
                    key.append(Array.get(param, i));
                    key.append(',');
                }
            } else if (ClassUtils.isPrimitiveOrWrapper(param.getClass()) || param instanceof String) {
                key.append(param);
            } else {
                key.append(param.hashCode());
            }
            key.append('*');
        }
        finalKey = key.toString();
        if (finalKey.endsWith("*")) finalKey = finalKey.substring(0, finalKey.length() - 1);
        LOGGER.debug("Using Cache Key={}, HashCode={}", finalKey, finalKey.hashCode());
        return finalKey;
    }

}