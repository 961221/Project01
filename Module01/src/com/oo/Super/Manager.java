package com.oo.Super;

/**
 * @author shkstart
 * @create 2019-09-10 11:16
 */
public class Manager extends Employee{

    String name = "胡道来";
    //子类将父类中的work方法重写的
    @Override
    public void work() {
        System.out.println("经理在工作");
    }

    //成员方法
    public void m1(){
        this.work();
        super.work();

        System.out.println(this.name);
        System.out.println(name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.m1();
    }
    /*
    //this和super相同人，都不能用在静态上下文中
    public static void m2(){
        System.out.println(super.name);
    }
     */
}
