package com.oo.Inner;


import com.oo.Interface.CustomerService;

/**
 * @author shkstart
 * @create 2019-09-10 19:28
 */
/*
    匿名内部类的优点：少定义一个类
    缺点：无法重复使用
 */
public class OuterClassTest04 {
    //静态方法
    public static void t(CustomerService cs){
        cs.logout();
    }

    //入口
    public static void main(String[] args) {
        //调用t方法
        //使用匿名内部类的方法执行t方法
        //整个这个“new CustomerService（）{}”就是匿名内部类
        t(new CustomerService() {
            @Override
            public void logout() {
                System.out.println("exit");
            }
        });
    }
}
