package com.oo;

/**
 * @author shkstart
 * @create 2019-09-09 12:18
 */
public class OOTest05 {
    public static void main(String[] args) {
        Customer c = new Customer();
        System.out.println(c.id);

        Customer d= null;

        /*
            以下程序编译可以通过，因为符合语法
            运行时会出现空指针异常
            空引用访问“实例”相关的数据一定会出现空指针异常
         */
        System.out.println(d.id);//java.lang.NullPointerException
    }
}

class Customer{
    int id;
}