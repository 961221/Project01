package com.oo.Object;

/**
 * @author shkstart
 * @create 2019-09-10 15:34
 */
public class ToStringTest01 {
    public static void main(String[] args) {
        //创建一个Object类型的对象
        Object o1 = new Object();

        //调用toString方法
        String str = o1.toString();
        System.out.println(str);//java.lang.Object@1b6d3586

        //创建一个Perso类型的对象
        Person p = new Person("道来",22);
        //调用toString方法
        System.out.println( p.toString());//[name=道来,age=22]
        //print方法后面括号如果是一个引用类型，会默认调用引用类型的toString方法
        System.out.println(p);//[name=道来,age=22]

    }
}

class Person{
    String name;
    int age;

    Person(String name,int age)
    {
        this.age = age;
        this.name = name;
    }

    //重写toString方法
    //需求规定：显示格式：Person[name=刘德华，age=50]
    public String toString()
    {
        return "[name="+name+",age="+age+"]";
    }
}