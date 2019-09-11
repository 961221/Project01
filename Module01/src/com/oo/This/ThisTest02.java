package com.oo.This;

/**
 * @author shkstart
 * @create 2019-09-09 16:53
 */
public class ThisTest02 {
    //没有static的变量
    int i = 10;

    public static void main(String[] args) {
        method1();
        ThisTest02.method1();
        ThisTest02 t = new ThisTest02();
        t.method2();
    }

    //带有static方法
    public static void doSome(){
        System.out.println("doSome");
    }

    //不带有static方法
    public void doOther()
    {
        System.out.println("doOther");
    }

    //带有static方法
    public static void method1(){
        //调用doSOme
        doSome();
        //调用doOther
        ThisTest02 t = new ThisTest02();
        t.doOther();
        //访问i
        System.out.println(t.i);
    }

    //不带static方法
    public void method2(){
        //调用doSOme
        doSome();
        ThisTest02.doSome();
        //调用doOther
        doOther();
        //访问i
        System.out.println(i);
        System.out.println(this.i);
    }
}
