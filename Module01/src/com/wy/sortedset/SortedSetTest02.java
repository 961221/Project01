package com.wy.sortedset;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author shkstart
 * @create 2019-09-01 18:14
 */
public class SortedSetTest02 {
    public static void main(String[] args)
    {
        //创建SortedSet
        SortedSet ss = new TreeSet();

        User u1 =new User(10);
        User u2 =new User(18);
        User u3 =new User(16);
        User u4 =new User(29);
        User u5 =new User(38);

        //添加元素
        ss.add(u1);
        ss.add(u2);
        ss.add(u3);
        ss.add(u4);
        ss.add(u5);
        //遍历
        for(Iterator it = ss.iterator();it.hasNext();)
        {
            //未实现Comparable方法时:User cannot be cast to java.lang.Comparable
            System.out.println(it.next());
        }
    }
}

//实现Comparable
class User implements Comparable{
    int age;

    User(int age)
    {
        this.age = age;
    }

    //重写toString方法
    public String toString(){
        return "[age="+age+"]";
    }

    //实现java.lang.Comarable 接口中的compareTo方法
    //该方法程序员负责实现，SUN提供的程序已经调用了该方法
    //需求：按照User的age排序
    public int compareTo(Object o)
    {
        //编写一个比较规则
        int age1 = this.age;
        int age2 = ((User)o).age;
        return age1-age2;
    }
}