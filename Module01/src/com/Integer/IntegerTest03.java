package com.Integer;

/**
 * @author shkstart
 * @create 2019-09-11 11:05
 */
public class IntegerTest03 {
    public static void main(String[] args) {
        //int--->Integer
        //基本数据类型---》引用类型
        Integer i1 = new Integer(10);

        //引用类型---》基本类型
        int i2 = i1.intValue();

        System.out.println(i2+1);//11

        //重要：static int parseInt（String s）；
        //String ---》int
        int age = Integer.parseInt("25");
        System.out.println(age + 1);

        //""这个字符串必须是“数字字符串”才行
        //int price = Integer.parseInt("abc");//NumberFormatException

        //重要：static double parseDuble（String s）；
        double price = Double.parseDouble("3.2");
        System.out.println(price+1.2);//4.4
    }
}
