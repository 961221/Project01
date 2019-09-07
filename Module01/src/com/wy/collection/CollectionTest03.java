package com.wy.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author shkstart
 * @create 2019-08-31 10:36
 */
/*
    boolean contains(Object o);  判斷集合中是否包含某个元素
    boolean remove(Object o);    删除集合中某个元素

    存储在集合中的元素要重写equals方法
 */
public class CollectionTest03 {
    public static void main(String[] args)
    {
        // 创建集合
        Collection c = new ArrayList();


        //创建两个Integer类型对象
        Integer a1 = new Integer(100);
        //添加元素
       c.add(a1);
        //判断集合中是否包含a1
        System.out.println(c.contains(a1));

        //创建两个Integer类型对象
        Integer a2 = new Integer(100);
        //contains方法底层调用的是equals方法，如果equals返回true，就是包含
        System.out.println(c.contains(a2));

        Manager mm = new Manager(100,"daolai");
        c.add(mm);
        System.out.println(c.contains(mm));

        Manager mmm = new Manager(100,"daolai");
        System.out.println(c.contains(mmm));
    }

}
class Manager{
    int no;
    String name;
    Manager(int no, String name)
    {
        this.name = name;
        this.no = no;
    }

    //重写equals方法
    //需求规定：如果编号和姓名都相同则表示同一个Manager

    public boolean equals(Object o)
    {
        if(this == o)
            return true;
        if(o instanceof Manager)
        {
            Manager m = (Manager)o;
            if( (m.no == this.no) && (m.name.equals(this.name)) )
            {
                return true;
            }
        }
        return false;
    }

}
