package com.oo.Object;

/**
 * @author shkstart
 * @create 2019-09-10 15:47
 */
public class EqualsTest01 {
    public static void main(String[] args) {
        String s1 = new String("ABV");
        String s2 = new String("ABV");

        System.out.println(s1==s2);//false

        //String已经重写了Object中的equals方法，比较的是内容
        System.out.println(s1.equals(s2));//true
        }


}
