package com.wy.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author shkstart
 * @create 2019-09-02 23:14
 */
/*
    泛型（编译期概念）
    1.为什么引入泛型
        1.可以统一集合中的数据类型
        2.可以减少强制类型转换

    2.泛型语法如何实现？

    3.泛型的优点和缺点？
        优点：统一类型，减少强制类型转换
        缺点：只能存储一种类型

    以下程序没有使用泛型，缺点？
        如果没有使用泛型，则集合中的元素的类型不统一
        在遍历集合的时候，只能拿出来Object类型，需要做大量的
        强制类型转换，麻烦。
 */
public class GenericTest01 {
    public static void main(String[] args)
    {

        //创建一个集合，存储A，B，C
        Set s = new HashSet();


        //创建对象
        A a = new A();
        B b = new B();
        C c = new C();


        //添加
        s.add(a);
        s.add(b);
        s.add(c);


        //需求：遍历集合，如果是A类型调用m1方法；B类型调m2方法；c类型调m3方法
        for(Iterator it = s.iterator();it.hasNext();)
        {
            Object o = it.next();
            if(o instanceof A)
            {
             A a1 = (A)o;
             a1.m1();
            }else if(o instanceof B)
            {
                B b1 = (B)o;
                b1.m2();
            }else if(o instanceof C)
            {
                C c1 = (C)o;
                c1.m3();
            }
        }

    }
}

class A{
    void m1()
    {
        System.out.println("m1。。。。");
    }
}

class B{
    void m2()
    {
        System.out.println("m2。。。。");
    }
}

class C{
    void m3()
    {
        System.out.println("m3。。。。");
    }
}