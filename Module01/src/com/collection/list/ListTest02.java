package com.collection.list;

import java.util.LinkedList;
import java.util.List;

/**
 * @author shkstart
 * @create 2019-08-31 13:10
 */
/*
    深入List集合
    ArrayList集合底层是数组，数组底层是有下标的
    所以ArrayList集合有很多自己的特性

    ArrayList集合底层默认初始化容量是10，扩大之后的容量是原容量的1.5倍
    Vector集合底层默认初始化容量也是10，扩大之后的容量是原容量的2倍

    如何优化ArrayList和Vector？
        尽量减少扩容操作，因为扩容操作需要数组拷贝，数组拷贝很耗内存
        一般推荐在创建集合的时候指定初始化容量
 */
public class ListTest02 {
    public static void main(String[] args)
    {
        //创建List集合
      //List l = new ArrayList();

        List l = new LinkedList();//面向抽象编程的好处
        //添加元素
       l.add(100);
       l.add(58);
       l.add(36);

        //在下标为1的位置上添加555
       l.add(1,250);

        //取得第二个元素
        System.out.println(l.get(1));
        System.out.println("=----------");

        //遍历List集合特有的遍历方式
        for(int i = 0; i<l.size(); i++)
        {
            System.out.println(l.get(i));
        }
    }
}
