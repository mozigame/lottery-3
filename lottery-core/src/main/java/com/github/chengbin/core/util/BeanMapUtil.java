package com.github.chengbin.core.util;

import com.google.common.collect.Lists;
import org.springframework.cglib.beans.BeanMap;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Bean和Map之间互转工具类
 *
 * @author zhangcb
 * @time 2018-01-16 21:34
 */
public class BeanMapUtil {

    /**
     * 将对象装换为map
     *
     * @param obj
     * @return
     */
    public static <T> Map beanToMap(T obj) {
        Map map = new HashMap();
        if (obj != null) {
            BeanMap beanMap = BeanMap.create(obj);
            Iterator it = beanMap.entrySet().iterator();
            for (Object key : beanMap.keySet()) {
                map.put(key + "", beanMap.get(key));
            }
        }
        return map;
    }

    /**
     * 将map装换为javabean对象
     *
     * @param map
     * @param bean
     * @return
     */
    public static <T> T mapToBean(Map map, T bean) {
        // 转换BigInteger
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> e = it.next();
            String key = e.getKey();
            Object value = e.getValue();
            if (value instanceof BigInteger) {
                map.put(key, ((BigInteger) value).longValue());
            }
        }

        BeanMap beanMap = BeanMap.create(bean);
        beanMap.putAll(map);
        return bean;
    }

    /**
     * 将List<T>转换为List<Map<String, Object>>
     *
     * @param objList
     * @return
     */
    public static <T> List<Map> objectsToMaps(List<T> objList) {
        List<Map> list = Lists.newArrayList();
        if (objList != null && objList.size() > 0) {
            Map map = null;
            T bean = null;
            for (int i = 0, size = objList.size(); i < size; i++) {
                bean = objList.get(i);
                map = beanToMap(bean);
                list.add(map);
            }
        }
        return list;
    }

    /**
     * 将List<Map<String,Object>>转换为List<T>
     *
     * @param mapList
     * @param clazz
     * @return
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public static <T> List<T> mapsToObjects(List<Map> mapList, Class<T> clazz) throws InstantiationException, IllegalAccessException {
        List<T> list = Lists.newArrayList();
        if (mapList != null && mapList.size() > 0) {
            Map<String, Object> map = null;
            T bean = null;
            for (int i = 0, size = mapList.size(); i < size; i++) {
                map = mapList.get(i);
                bean = clazz.newInstance();
                mapToBean(map, bean);
                list.add(bean);
            }
        }
        return list;
    }
}
