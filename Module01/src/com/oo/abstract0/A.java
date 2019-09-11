package com.oo.abstract0;

/**
 * @author shkstart
 * @create 2019-09-10 11:54
 */
public abstract class A {

    //Constructor
    A(){
        System.out.println("A.....");
    }

    //抽象方法
    public abstract void m1();

    public static void main(String[] args) {
        //抽象类无法创建对象
        //A a = new A();

        //多态
        A a = new B();
    }
}

class B extends A{
    @Override
    public void m1() {
        System.out.println("hhh");
    }

    B(){
        //super();
        System.out.println("B/...");
    }
}
