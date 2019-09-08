package com.reflect;

import java.lang.reflect.Method;

/**
 * @author shkstart
 * @create 2019-09-08 10:13
 */
public class ReflectTest07 {
    public static void main(String[] args) throws Exception{
        //1.获取类
        Class c = Class.forName("com.reflect.CustomerService");

        //2.获取某个特定的方法
        //通过方法名+形参列表
        Method m = c.getDeclaredMethod("login",String.class,String.class);

        //通过反射机制执行login方法
        //创建方法
        Object o = c.newInstance();

        //调用o对象m的方法，传递“admin”“123”参数，方法执行结果手机retValue
        Object retValue = m.invoke(o,"admin","1456");
        System.out.println(retValue);//true

    }
}
