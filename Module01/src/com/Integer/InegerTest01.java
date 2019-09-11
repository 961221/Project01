package com.Integer;

/**
 * @author shkstart
 * @create 2019-09-11 10:51
 */
public class InegerTest01 {
    //入口
    public static void main(String[] args) {
        //基本数据类型
        byte b = 10;

        //引用类型
        Byte b1 = new Byte(b);

        m1(b1);//10   Byte已经将Object中的toStringr方法重写
    }
    //需求：规定m1方法接受java中的任何一种类型
    //m1方法如果想接收byte类型的数据，可以将byte类型先包装成java.lang.Byte;

    public static void m1(Object o)
    {
        System.out.println(o);
    }

}
