package com.oo.singleton;

/**
 * @author shkstart
 * @create 2019-09-10 10:34
 */
/*
    恶汉式单例模式
 */
public class Customer {
  //类加载的时候只执行一次。
  private static Customer c = new Customer();

  //构造方法私有化
    private Customer(){}

    //提供公开的方法
    public static Customer getInstance()
    {
        return c;
    }
}
