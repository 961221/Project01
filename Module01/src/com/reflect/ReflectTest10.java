package com.reflect;

/**
 * @author shkstart
 * @create 2019-09-08 11:23
 */
/*
    关于获取父类和父接口
 */
public class ReflectTest10 {
    //通过反射机制获取String类的父类和父接口
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("java.lang.String");

        //获取父类
        Class superClass = c.getSuperclass();
        System.out.println(superClass.getName());

        //获取父接口
        Class[] ins = c.getInterfaces();
        for(Class i:ins)
        {
            System.out.println(i.getName());
        }
    }
}
