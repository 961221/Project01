package com.oo.Inner;

/**
 * @author shkstart
 * @create 2019-09-10 16:45
 */
public class OuterClassTest01 {
    //静态变量
    private static String s1 = "A";

    //成员变量
    private String s2 = "B";

    //静态方法
    private static void m1(){
        System.out.println("m1////");
    }

    //成员方法
    private void m2(){
        System.out.println("m2....");
    }

    //静态内部类
    //可以用访问控制权限的修饰符修饰
    //public，protected，private，缺省
    static class InnerClass{
        //静态方法
        public static void m3(){
            System.out.println(s1);
            m1();

            //无法访问
            //System.out.println(s2);
            //m2();
        }

        //成员方法
        public void m4(){
            System.out.println(s1);
            m1();

            //无法访问
            //System.out.println(s2);
            //m2();
        }
    }

    //入口
    public static void main(String[] args) {
        ///执行m3
        OuterClassTest01.InnerClass.m3();

        //执行m4
        InnerClass ic = new OuterClassTest01.InnerClass();
        ic.m4();
    }
}
