package com.oo.singleton;

/**
 * @author shkstart
 * @create 2019-09-10 10:26
 */
public class Test01 {
    public static void main(String[] args) {
        /*
        // Error:(9, 31) java: Singleton()可以在com.oo.singleton.Singleton中访问private
        Singleton singleton = new Singleton();

         */

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1 == s2);//true
        System.out.println(s2 == s3);//true

    }
}
