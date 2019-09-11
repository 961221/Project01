package com.collection.foreach;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author shkstart
 * @create 2019-09-03 6:26
 */
/*
    关于增强for循环
    语法：
        for（类型 变量：数组名/集合名）{}
     集合要想使用增强for循环这种语法，集合需要使用泛型
     如果不使用泛型，需要用Object类型来定义集合中的元素

 */
public class ForeachTest01 {
    public static void main(String[] args)
    {
        int[] a = {1,2,5,8,7,19};

         //遍历
        for(int i = 0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("=========");
        //foreach
        for(int m:a)
        {
            System.out.println(m);
        }

        //集合
        Set<String> strs = new HashSet<String>();
        strs.add("张三");
        strs.add("李四");
        strs.add("王五");

        //遍历
        for(String s:strs)
        {
            System.out.println(s);
        }
        //集合不使用泛型
        List l = new ArrayList();
        l.add(1);
        l.add(5);
        l.add(4);
        l.add(2);
        //不能返回Integer，加的是Integer，但it.next返回的是Object；
        //结论：集合要想使用增强for循环这种语法，集合需要使用泛型（不需要强转）
        //如果不使用泛型，需要用Object类型来定义集合中的元素
        for(Object ii:l)
        {
            System.out.println(ii);
        }

    }
}
