package com.collection.generic;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author shkstart
 * @create 2019-09-02 23:51
 */
/*
    SortedSet集合使用泛型
 */
public class GenericTest04 {
    public static void main(String[] args)
    {
        SortedSet<Manager> ss = new TreeSet<Manager>();
        //添加
        Manager m1 = new Manager(5.55);
        Manager m2 = new Manager(8.55);
        Manager m3 = new Manager(3.55);

        ss.add(m1);
        ss.add(m2);
        ss.add(m3);

        //遍历
        Iterator<Manager> it = ss.iterator();
        while(it.hasNext())
        {
            Manager m = it.next();
            m.work();

        }

    }
}

class Manager implements Comparable<Manager>{
    double sal;

    Manager(double sal)
    {
        this.sal = sal;
    }


    public String toString()
    {
        return sal + "";
    }

    void work()
    {
        System.out.println("My Sal is :"+sal);
    }
    //实现接口中的方法
    public int compareTo(Manager m)
    {
        double sal1 = this.sal;
        double sal2 = m.sal;//不需要强转
        if(sal1>sal2)
        {
            return 1;
        }else if(sal1<sal2)
        {
            return -1;
        }else
            return 0;
    }

}