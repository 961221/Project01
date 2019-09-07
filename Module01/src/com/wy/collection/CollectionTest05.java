package com.wy.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author shkstart
 * @create 2019-08-31 12:28
 */
/*
    深入remove方法
        1.迭代器的remove方法
        2。集合自身带的remove方法
 */
public class CollectionTest05 {
    public static void main(String[] args)
    {
        Collection c = new ArrayList();

        c.add(1);
        c.add(2);
        c.add(3);

        //遍历
        Iterator it = c.iterator();
        while(it.hasNext())
        {
            /*Object element = it.next();
            //删除
            it.remove();//通过迭代器删除
            */
            //使用集合自身所带的remove方法
           Object o = it.next();
            //删除
            //Exception in thread "main" java.util.ConcurrentModificationException
            c.remove(o);

        }

        System.out.println(c.size());//0
    }

}
