package com.collection.generic;

/**
 * @author shkstart
 * @create 2019-09-03 0:20
 */
/*
    自定义泛型
 */
public class GenericTest05 {
    public static void main(String[] args)
    {

        MyClass<String> mc = new MyClass<String>();
        //泛型就是编译期检查类型
        //Error
        //mc。m1（100）；
        mc.m1("Jack");

    }
}

//自定义泛型
//T:type
//E:element
class MyClass<T>{
    public void m1(T t)
    {
        System.out.println(t);
    }
}