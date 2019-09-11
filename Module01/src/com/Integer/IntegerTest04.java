package com.Integer;

/**
 * @author shkstart
 * @create 2019-09-11 11:15
 */
/*
    三种类型的转换
    int
    Integer
    String
 */
public class IntegerTest04 {
    public static void main(String[] args) {
        //int--》Integer
        Integer i1 = Integer.valueOf(10);

        //Integer--->int
        int i2 = i1.intValue();

        //String--->Integer
        Integer i3 = Integer.valueOf("20");

        //Integer--->String
        String s = i3.toString();

        //String--->int
        int i4 = Integer.parseInt(s);

        //int--->String
        String s1 = 10 + "";
    }
}
