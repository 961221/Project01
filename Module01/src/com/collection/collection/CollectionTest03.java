package com.collection.collection;

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

        //创建第一个Integer类型对象
        Integer i1 = new Integer(10);

        //添加元素
        c.add(i1);
        //判断集合中是否包含a1
        System.out.println(c.contains(i1));

        //创建第二个Integer类型对象
        Integer i2 = new Integer(10);
        System.out.println(c.contains(i2));

        Manager m1 = new Manager(123,"daolai");
        c.add(m1);
        System.out.println(c.contains(m1));

        Manager m2 = new Manager(123,"daolai");
        System.out.println(c.contains(m2));
        //contains方法底层调用的是equals方法，如果equals返回true，就是包含


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
        if(o instanceof Manager)
        {
            Manager m = (Manager)o;
            if( (m.name.equals(this.name)) && (m.no == this.no) )
            {
                return true;
            }
            if (this == o)
                return true;
        }
        return false;
    }

}
