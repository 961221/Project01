package com.reflect;

import java.lang.reflect.Constructor;

/**
 * @author shkstart
 * @create 2019-09-08 11:09
 */
/*
    获取某个特定的构造方法，然后创建对象
 */
public class ReflectTest09 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("com.reflect.Customer");

        //获取特定的构造方法
        Constructor con = c.getDeclaredConstructor(String.class,int.class);

        //创建对象
        Object o = con.newInstance("胡歌",38);
        System.out.println(o);
    }
}

class Customer{
    String name;
    int age;

    Customer(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public  String toString()
    {
        return "name="+name+" age="+age;
    }
}