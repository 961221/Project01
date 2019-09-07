package com.wy.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author shkstart
 * @create 2019-08-31 9:09
 */
public class CollectionTest01 {
    public static void main(String[] args){
        //1.创建集合
        Collection c = new ArrayList();//多态

        //2.添加元素
        c.add(1);   //自动装箱

        c.add(new Integer(100));

        Object o = new Object();
        c.add(o);//Collection集合只能单个存储元素，并且只能存储引用类型
        Customer cus = new Customer("daolai",20);
        c.add(cus);

        //3.获取元素个数
        System.out.println(c.size());  //4
        //isEmpty()
        System.out.println(c.isEmpty());//false

        //4.将集合转换成为Object类型的数组
        Object[] objs = c.toArray();
        for(int i = 0; i<objs.length;i++)
        {
            System.out.println(objs[i]);
        }

        // 5.清空
        c.clear();
        System.out.println(c.size());
        System.out.println(c.isEmpty());

    }
}

class Customer{
    String name;
    int age;

    Customer(String name,int age){
        this.age = age;
        this.name = name;
    }

    // 重写toString方法
    public String toString()
    {
        return "Customer{name="+name+",age="+age+"}";
    }



}