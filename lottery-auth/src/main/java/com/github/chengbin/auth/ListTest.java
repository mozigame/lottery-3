package com.github.chengbin.auth;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhangcb
 * @created 2018-02-01 13:31.
 */
public class ListTest<T> implements People{

    public static void testList(){

        Lock lock = new ReentrantLock();
        lock.lock();

        ExecutorService executors = Executors.newCachedThreadPool();

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int size = 10000;
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
        System.out.println("ArrayList普通遍历时间：" + (System.currentTimeMillis() - t1));

        t1 = System.currentTimeMillis();
        for (Integer integer : arrayList) {

        }
        System.out.println("ArrayList foreach遍历时间：" + (System.currentTimeMillis() - t1));

        t1 = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.get(i);
        }
        System.out.println("LinkedList普通遍历时间：" + (System.currentTimeMillis() - t1));

        t1 = System.currentTimeMillis();
        for (Integer integer : linkedList) {

        }
        System.out.println("LinkedList foreach遍历时间：" + (System.currentTimeMillis() - t1));
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        try {
            Class clas = Class.forName("com.github.chengbin.auth.ListTest");
            System.out.println("name:" +clas.getName() + "\nsimpleName:" + clas.getSimpleName()
                    + "\nsuperClass:" +clas.getSuperclass() +"\nmodifiers:" + clas.getModifiers() +
                    "\nclassLoader:" + clas.getClassLoader());

            Constructor<?>[] constructors = clas.getDeclaredConstructors();

            for (Method method : clas.getMethods()) {
                System.out.println("name:" +method.getName() + "\nmodifiers:" + method.getModifiers()
                        + "\nreturnType:" +method.getReturnType() +"\nexceptionTypes:" + method.getExceptionTypes() +
                        "\nparameterTypes:" + method.getParameterTypes() + "\nannotations:" + method.getAnnotations());
                RateLimiter rateLimiter = method.getAnnotation(RateLimiter.class);
                if(rateLimiter != null){
                    System.out.println("注解RateLimiter");
                }
            }
            System.out.println("-----华丽分割线-----");
            Annotation[] annotations = clas.getAnnotations();
            Field[] fields = clas.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("申明的变量："+field.getName());
                System.out.println("name:" +field.getName() + "\ntype:" + field.getType()
                        + "\ncount:" +field.getInt("count") +"\nmodifiers:" + field.getModifiers() + field.getAnnotations());
            }
            System.out.println("----------");
            fields = clas.getFields();
            for (Field field : fields) {
                System.out.println("继承的方法："+field.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        Map<String,String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");
        map.put("d","4");
        map.put("e","5");
        map.put("f","6");
        map.put("h","7");
        map.put("i","8");
        map.put("j","9");
        map.put("k","10");
        map.put("l","11");
        map.put("m","12");
        map.put("n","13");
        map.put("k","661");
        map.put("o","662");
        map.put("p","663");
        map.put("q","664");
        map.put("r","665");
        map.put("s","666");

        Map<String,String> conMap = new ConcurrentHashMap<>();
        conMap.put("r","665");
        conMap.put("s","666");

        List<?> list =new ArrayList();
        print(list);
        List<String> list1 =new ArrayList();
        print(list1);
        List list2 =new ArrayList();
        print(list);
        ListTest listTest = new ListTest();
        Class<?> clazz = listTest.getClass();
        System.out.println(clazz.getName());
        ListTest listTest1 = (ListTest)clazz.newInstance();

        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            RateLimiter rateLimiter = method.getAnnotation(RateLimiter.class);
            if(rateLimiter != null){
                System.out.println(rateLimiter.count() + "-" + rateLimiter.timeout());
            }
        }
    }

    private int count =100;

    @RateLimiter(count = 10,timeout = 2000)
    public static <T> T getInstance(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }

    public <K,V> void print(K k,V v){

    }

    public <T extends Map> void print(T t){
        System.out.println(t);
    }

    public static <T> void print(List<T> t){
        System.out.println(t);
    }

    public void print1(List<?> t){
        System.out.println(t);
    }

    private List<T> list;

    private static List<?> people;

    private List<? super People> peoples;

    @Override
    public void sleep() {

    }

    @Override
    public void work() {

    }
}
