package com.wy.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author shkstart
 * @create 2019-08-31 16:24
 */
public class SetTest02 {
    public static void main(String[] args)
    {
        //创建集合
        Set s = new HashSet();
        Employee e1 = new Employee("100","daolai");
        Employee e2 = new Employee("101","dao");
        Employee e3 = new Employee("102","dlai");
        Employee e4 = new Employee("103","dolai");
        Employee e5 = new Employee("100","daolai");

        //未重写之前hashCode不一样，重写后相同
        System.out.println(e1.hashCode());
        System.out.println(e5.hashCode());
        //添加元素
        s.add(e1);
        s.add(e2);
        s.add(e3);
        s.add(e4);
        s.add(e5);

        //查看元素个数
         //没重写hashCode方法和equals方法前为5，之后为4
        System.out.println(s.size());

    }
}

//根据现实的业务逻辑得知，该员工的编号是：1000-9999
class Employee{

    //编号
    String no;
    //姓名
    String name;
    //Constructor
    Employee(String no,String name){
        this.no = no;
        this.name = name;
    }

    //2.重写equals方法
    //如果员工编号相同，并且名字相同，则是同一个对象
   /* public boolean equals(Object o)
    {
        if(this == o)
            return true;
        if(o instanceof Employee)
        {
            Employee e = (Employee)o;
            if( (this.no == e.no) && this.name.equals(e.name))
                return true;
        }
        return false;
    }


    //1.重写hashCode方法
    public int hashCode(){
        //以员工编号分组（String重写了hashCode方法）
        return no.hashCode();
    }*/

}