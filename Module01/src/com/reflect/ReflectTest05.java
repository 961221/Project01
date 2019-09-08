package com.reflect;

import java.lang.reflect.Field;

/**
 * @author shkstart
 * @create 2019-09-08 0:09
 */
/*
    java.lang.ReflectTest.Field:获取某个指定的属性
 */
public class ReflectTest05 {
    public static void main(String[] args)throws Exception {
        /*//以前的方式
        User u = new User();
        u.age = 12;//set
        System.out.println(u.age);
         */

        //获取类
        Class c = Class.forName("com.reflect.User");
        //获取id属性
        Field idf = c.getDeclaredField("id");

        //获取到某个特定的属性可以用来干啥？set和get
        Object o = c.newInstance();

        //打破封装
        idf.setAccessible(true);//使用反射机制可以打破封装性，导致了java对象的属性不安全

        //给o对象的id属性赋值“110”
        idf.set(o,"110");//set
        //get
        System.out.println(idf.get(o));

    }
}
