package com.oo.singleton;

import java.util.Comparator;

/**
 * @author shkstart
 * @create 2019-09-10 10:37
 */
public class Test02 {
    public static void main(String[] args) {
        Customer c1 = Customer.getInstance();
        Customer c2 = Customer.getInstance();

        System.out.println(c1==c2);//true
    }
}
