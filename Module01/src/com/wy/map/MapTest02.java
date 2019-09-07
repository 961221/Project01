package com.wy.map;

import java.util.Properties;

/**
 * @author shkstart
 * @create 2019-09-02 20:56
 */
/*
    HashMap默认初始化容量是16，默认加载因子为0.75
    Hashtable默认的初始化容量是11，默认加载因子为0.75

    java.util,Properties;也是由key和value组成，但是key和value都是字符串类型
 */
public class MapTest02 {
    public static void main(String[] args)
    {
        //1.创建属性类对象
        Properties p = new Properties();

        //2.存
        p.setProperty("diver","skadjflk");
        p.setProperty("username","daolai");

        //注意key不可重复，如果重复则value覆盖
        p.setProperty("username","wenying");
        p.setProperty("password","fdjsa");

        //3.取
        String v1 = p.getProperty("diver");
        String v2 = p.getProperty("username");
        String v3 = p.getProperty("password");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
