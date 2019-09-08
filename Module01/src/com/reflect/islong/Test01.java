package com.reflect.islong;

import com.reflect.Employee;

import java.util.Date;

/**
 * @author shkstart
 * @create 2019-09-07 17:50
 */
/*
    关于java中的可变长参数
 */
public class Test01 {
    //m1方法有一个可变长参数
    //m1方法在调用的时候，传递的实参可以是0-N个
    public static void m1(int... a){
        System.out.println("Test");
    }

    //如果有精确匹配的方法，则调用该方法，不会再去执行可变长参数的那个方法
    public static void m1(int i){
        System.out.println(1);
    }

    //可变长参数可以等同看作数组
    public static void m2(String... arg)
    {
        for(int i = 0; i < arg.length; i++)
        {
            System.out.println(arg[i]);
        }
    }

    public static void m3(Class... arg)throws Exception
    {
        for(int i = 0; i < arg.length; i++)
        {
            Class c = arg[i];
            System.out.println(c.newInstance());
        }
    }
    //可变参数只能出现一次，并且只能出现在所有参数的最后一位
    //public static void m4(String... a,int i){}
    public static void m4(int i,String... a){}
    public static void main(String[] args) throws Exception{
        m1();
        m1(2);
        m1(1,2,3);
        m2("ffds","fdjsew","ireu");
        String[] s = {"fwoe","eru","reitop"};
        m2(s);
        m3(Date.class, Employee.class);
    }

}
