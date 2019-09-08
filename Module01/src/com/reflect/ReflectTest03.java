package com.reflect;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shkstart
 * @create 2019-09-07 17:06
 */
/*
    获取Class类型的对象之后，可以创建该“类”的对象
 */
public class ReflectTest03 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("com.reflect.Employee");

        //创建此Class对象所表示的类的一个新的实例
        Object o = c.newInstance();//调用的是Employee无参数构造方法
        System.out.println(o);//com.reflect.Employee@1b6d3586

        Class c1 = Class.forName("java.util.Date");
        Object o1 = c1.newInstance();
        if(o1 instanceof Date){
            Date t = (Date)o1;
            System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(t));
        }
    }
}
