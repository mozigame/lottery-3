package com.github.chengbin.auth;

/**
 * @author zhangcb
 * @created 2018-01-31 17:18.
 */
public class PeopleFactory {

    public static People getPeople(int type){
        if(type == 1){
            return new Teacher();
        }else {
            return new Student();
        }
    }

    public static People getPeople2(String path) throws Exception {
        Class<?> c = Class.forName(path);
        return (People)c.newInstance();
    }
}
