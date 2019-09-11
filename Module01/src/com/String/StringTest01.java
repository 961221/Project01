package com.String;

/**
 * @author shkstart
 * @create 2019-09-11 9:56
 */
public class StringTest01 {
    public static void main(String[] args) {
        byte[] bytes = {97,98,99,100};
        String s3 = new String(bytes);
        System.out.println(s3);//abcd  String已经重写了Object中的toString方法

        String s4 = new String(bytes,1,2);
        System.out.println(s4);

        char[] c1 = {'我','是','中','国','人'};
        String s5 = new String(c1);
        System.out.println(s5);

        String s6 = new String(c1,2,2);
        System.out.println(s6);


    }
}
