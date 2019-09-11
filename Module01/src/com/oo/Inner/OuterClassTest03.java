package com.oo.Inner;

/**
 * @author shkstart
 * @create 2019-09-10 19:16
 */

public class OuterClassTest03 {
    //方法
    public void m1(){
        //局部变量
        final int i = 10;

        //局部内部类
        //局部内部类不能用访问控制权限修饰符修饰
        class InnerClass{

            //内部类不能有静态声明
            //public static void m1(){}

            //成员方法
            public void m2(){
                System.out.println(i);//10
            }
        }
        //调用m2
        InnerClass inn = new InnerClass();
        inn.m2();
    }

    //入口
    public static void main(String[] args) {
        OuterClassTest03 oc = new OuterClassTest03();
        oc.m1();
    }
}
