package com.collection.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author shkstart
 * @create 2019-08-31 12:12
 */
/*
    boolean remove(Object o);
    remove和contains方法都需要集合中的元素重写equals方法，因为Object中的equals方法
    比较内存地址，在现实的业务逻辑当中不能比较内存地址，该比较内容
 */

public class CollectionTest04 {
    public static void main(String[] args)
    {
        //创建集合对象
        Collection c = new ArrayList();

        //创建Integer类型对象
        Integer i1 = new Integer(100);
        //添加元素
        c.add(i1);

        Integer i2 = new Integer(100);
        //删除
        c.remove(i2);
        System.out.println(c.size());

        //创建Manager1对象
        Manager1 m1 = new Manager1(123,"道来");
        c.add(m1);
        Manager1 m2 = new Manager1(123,"道来");

        c.remove(m2);
        System.out.println(c.size());
    }
}
class Manager1 {
    int no;
    String name;

    Manager1(int no, String name) {
        this.name = name;
        this.no = no;
    }

    //重写equals方法
    //需求规定：如果编号和姓名都相同则表示同一个Manager1
    public boolean equals(Object o)
    {
        if (this == o){
            return true;
        }
        if(o instanceof Manager1) {
            Manager1 m = (Manager1)o;
            if(m.name.equals(this.name) && m.no==this.no)
            {
                return true;
            }
        }
        return false;
    }

}