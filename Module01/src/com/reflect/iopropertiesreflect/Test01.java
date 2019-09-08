package com.reflect.iopropertiesreflect;

import java.io.FileReader;
import java.util.Properties;

/**
 * @author shkstart
 * @create 2019-09-07 22:44
 */

/*
    直接采用User e = new User()只能创建一个对象，
    通过反射可以创建很多对象（很灵活），降低代码的耦合度
 */
public class Test01 {
    public static void main(String[] args) throws Exception {
        //1.创建属性对象
        Properties p = new Properties();

        //2.创建流
        FileReader fr = new FileReader("Module01/src/com/reflect/iopropertiesreflect/classinfo.properties");

        //3.加载
        p.load(fr);

        //4.关闭
        fr.close();

        //通过key获取value
        String s = p.getProperty("classname");

        //System.out.println(s);

        //通过反射机制创建对象
        Class c = Class.forName(s);

        //创建对象
        Object o = c.newInstance();

        System.out.println(o);
    }
}
