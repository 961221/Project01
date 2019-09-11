package com.southwind.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author shkstart
 * @create 2019-09-11 7:14
 */
public class Test01 {
    public static void main(String[] args) {

//        String str1 = new String("Hello");
////        String str2 = str1;
////        System.out.println(str1.equals(str2));
////        str1 += "World";
////        System.out.println(str1==str2);
//        String str1 = new String("Hello");
//        String str2 = "hello";
//        System.out.println(str1.equalsIgnoreCase(str2));
//        System.out.println(str2==str1.intern());
//        String str = new String("Helloo,World;Java-String");
//        String[] array = str.split("[,|;|-]");
//        for(String item:array)
//        {
//            System.out.println(item);
//        }

        String str1 = "Hello World";
        String str2 = "Hello ";
        String str3 = "World";
        String str4 = str2 +str3;
        System.out.println(str1 == str4);//false
        System.out.println(str1 == str4.intern());//true

    }
}
