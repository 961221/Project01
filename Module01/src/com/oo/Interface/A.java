package com.oo.Interface;

/**
 * @author shkstart
 * @create 2019-09-10 14:38
 */
public interface A {
    //常量（必须用public static final修饰）
    public static final String SUCCESS = "success";
    public static final double PI = 3.14;

    //public static final可以省略
    byte MAX_VALUE = 127;//常量

    //抽象方法（接口中所有的抽象方法都是public abstract）
    public abstract void m1();

    //public abstract可以省略
    void m2();
}

interface B{
    void m1();
}

interface C{
    void m2();
}

interface D {
    void m3();
}

interface E extends B,C,D{
    void m4();
}

//implements是实现的意思，是一个关键字，implements和extends意义相同
class MyClass implements B,C{
    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }
}
