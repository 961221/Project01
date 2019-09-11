package com.Integer;

/**
 * @author shkstart
 * @create 2019-09-11 11:55
 */
public class IntegerTest06 {
    public static void main(String[] args) {
        /*
        如果数据在（-128--127），java引入了一个“整形常量池”，在堆里面。
        该整形常量池中之存储了-128---127
         */
        //重点：
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);//false

        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println(i3 == i4);//true
    }
}
