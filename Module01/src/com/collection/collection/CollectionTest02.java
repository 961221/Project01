package com.collection.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author shkstart
 * @create 2019-08-31 9:36
 */
/*
    Iterator iterator();获取集合所依赖的迭代器对象
    通过迭代器中的方法完成集合的迭代（遍历）

    注意：这种方式是所有集合通用的遍历的方式、
 */
public class CollectionTest02 {
    public static void main(String[] args)
    {
        //創建集合对象
        Collection a = new ArrayList();
        Collection l = new LinkedList();


        //添加元素
        a.add(100);
        a.add(20);
        a.add(15);


        l.add(150);
        l.add(2);
        l.add(5);
        //迭代，遍历
        //1.获取迭代器对象,不需要关心底层集合的具体类型，
        //所有集合依赖的迭代器都实现了java.util.Iterator接口
        //java.util.LinkedList$ListItr是LinkedList集合所依赖的迭代器
        //java.util.ArrayList$Itr是ArrayList集合所依赖的迭代器
        Iterator it = a.iterator();
        Iterator itw = l.iterator();
        System.out.println(it);//java.util.ArrayList$Itr@1b6d3586
        System.out.println(itw);//java.util.LinkedList$ListItr@4554617c
        //2.开始调用方法，
        while(it.hasNext())
        {
            Object element = it.next();
            System.out.println(element);
        }

        /*
            boolean b = it.hasNext();   判断是否有更多的元素，如果有返回true
            Object o = it.next();     将迭代器向下移动一位，并且取出指向元素

            原则：调用it.next()方法之前必须使用hasNext
         */

        //for循环
        //Iterator it = l.iterator()只执行一次；it.hasNext()为布尔类型
        for(Iterator i = l.iterator();i.hasNext();)
        {
            Object o = i.next();
            System.out.println(o);
        }
    }
}
