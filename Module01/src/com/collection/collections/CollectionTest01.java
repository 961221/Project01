package com.collection.collections;

import java.util.*;

/**
 * @author shkstart
 * @create 2019-09-02 22:23
 */
/*
    关于集合工具类 java.util.Collections;类

    java.util.Collection;集合接口
 */
public class CollectionTest01{
    public static void main(String[] args)
    {
        //使用Collections工具完成集合的排序
        List l = new ArrayList();

        //添加元素
        l.add(10);
        l.add(5);
        l.add(50);
        l.add(40);


        //遍历
        for(int i = 0; i<l.size(); i++)
        {
            System.out.println(l.get(i));
        }
        System.out.println("==========");
        for(Iterator it = l.iterator();it.hasNext();)
        {
            System.out.println(it.next());
        }


        //排序
        Collections.sort(l);
        System.out.println("==========");
        for(Iterator it = l.iterator();it.hasNext();)
        {
            System.out.println(it.next());
        }

        //给定Set集合
        Set s = new HashSet();

        s.add(1);//自动装箱
        s.add(10);
        s.add(19);
        s.add(8);
        //对Set集合排序
        //Collections.sort(s);找不到包

        //将Set集合转换成为List集合
        List lists = new ArrayList(s);
        Collections.sort(lists);

        //遍历
        System.out.println("==========");
        for(Iterator it = lists.iterator();it.hasNext();)
        {
            System.out.println(it.next());
        }


        //创建List集合，List集合中存储Person类型，是否可以排序？
       /*
       //Collections工具类可以对List集合的元素排序，但是集合中的元素必须是“可比较的”，
         实现Comparale接口

        List ps = new ArrayList();
        ps.add(new Person());
        ps.add(new Person());
        ps.add(new Person());
        ps.add(new Person());

        Collections.sort(ps);
     */
       //將ArrayList集合转换成为线程安全的
        List myList = new ArrayList();
        Collections.synchronizedList(myList);

    }
}

class Person{

}
