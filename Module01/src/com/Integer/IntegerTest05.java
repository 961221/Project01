package com.Integer;

/**
 * @author shkstart
 * @create 2019-09-11 11:33
 */
public class IntegerTest05 {
    public static void main(String[] args) {
        //jak5.0之前
        //int--》Integer（装箱）
        Integer i1 = new Integer(10);
        //Integer-->int(拆箱)
        int i2 = i1.intValue();

        //jdk5.0后
        Integer i3 = 10;//自动装箱
        int i4 = i3;    //自动拆箱
        System.out.println(i3);//10
        System.out.println(i4+1);//11

        //jdk5.0之后
        m1(321);//自动装箱

    }

    public static void m1(Object o)
    {
        System.out.println(o);//321
    }
}
