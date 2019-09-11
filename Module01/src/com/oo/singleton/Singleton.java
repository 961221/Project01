package com.oo.singleton;

/**
 * @author shkstart
 * @create 2019-09-10 10:09
 */
/*
    实现单例模式：

    单例模式的要领：
        1.构造方法私有化
        2.对外提供一个公开的静态的获取当前类型对象的方法
        3.提供一个当前类型的静态变量

    单例模式分为两种：
        饿汉式单利：在类加载阶段创建了对象
        懒汉式单利：用到对象的时候才会创建对象
 */
public class Singleton {//懒汉式单利

    //静态变量
    private static Singleton s;

    //将构造方法私有化
    private Singleton(){}

    //对外提供一个公开获取Singleton对象的方法
    public static Singleton getInstance()
    {
        if(s==null){
            s = new Singleton();
        }
        return s;
    }


}
