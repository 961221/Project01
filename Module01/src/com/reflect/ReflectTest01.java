package com.reflect;

/**
 * @author shkstart
 * @create 2019-09-07 8:38
 */
/*
    获取Class类型对象的三种方式
 */
public class ReflectTest01 {
    public static void main(String[] args) throws Exception{
        //第一种方式、
        //c1引用保存的内存地址指向堆中的对象，该对象代表的是Employee整个类。
        Class c1 = Class.forName("Employee");

    }
}
