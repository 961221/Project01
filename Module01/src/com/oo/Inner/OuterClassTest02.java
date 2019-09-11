package com.oo.Inner;

/**
 * @author shkstart
 * @create 2019-09-10 16:45
 */
public class OuterClassTest02 {
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

    //成员内部类
    //可以用访问控制权限的修饰符修饰
    //public，protected，private，缺省
    class InnerClass{
        //静态方法
        /*public static void m3(){
            System.out.println(s1);
            m1();*/

            //无法访问
            //System.out.println(s2);
            //m2();
        }

        //成员方法
        public void m4(){
            System.out.println(s1);
            m1();

            //无法访问
            System.out.println(s2);
            m2();
        }


    //入口
    public static void main(String[] args) {
        //创建外部类对象
        OuterClassTest02 oc = new OuterClassTest02();
        InnerClass inner = oc.new InnerClass();
        //inner.m4();
    }
}
