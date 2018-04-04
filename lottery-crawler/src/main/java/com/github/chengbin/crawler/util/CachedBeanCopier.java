package com.github.chengbin.crawler.util;

import org.springframework.cglib.beans.BeanCopier;
import org.springframework.cglib.core.Converter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangcb
 * @time 2018-01-16 21:34
 */
public class CachedBeanCopier {

    private static final Map<String, BeanCopier> BEAN_COPIERS = new HashMap();

    public static void copy(Object sourceObj, Object targetObj) {
        String key = genKey(sourceObj.getClass(), targetObj.getClass());
        BeanCopier copier = null;
        if (!BEAN_COPIERS.containsKey(key)) {
            copier = BeanCopier.create(sourceObj.getClass(), targetObj.getClass(), false);
            BEAN_COPIERS.put(key, copier);
        } else {
            copier = BEAN_COPIERS.get(key);
        }
        copier.copy(sourceObj, targetObj, null);
    }

    public static void copy(Object sourceObj, Object targetObj, Converter converter) {
        String key = genKey(sourceObj.getClass(), targetObj.getClass());
        BeanCopier copier = null;
        if (!BEAN_COPIERS.containsKey(key)) {
            copier = BeanCopier.create(sourceObj.getClass(), targetObj.getClass(), false);
            BEAN_COPIERS.put(key, copier);
        } else {
            copier = BEAN_COPIERS.get(key);
        }
        copier.copy(sourceObj, targetObj, converter);
    }

    private static String genKey(Class<?> sourceClazz, Class<?> targetClazz) {
        return sourceClazz.getName() + targetClazz.getName();
    }
}
