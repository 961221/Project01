package com.Integer;

/**
 * @author shkstart
 * @create 2019-09-11 10:58
 */
public class IntegerTest02 {
    public static void main(String[] args) {
        //获取int类型的最大和最小值
        System.out.println("int最大值"+Integer.MAX_VALUE);
        System.out.println("int最小值"+Integer.MIN_VALUE);

        //以int推Byte
        System.out.println("Byte最大值"+Byte.MAX_VALUE);
        System.out.println("Byte最小值"+Byte.MIN_VALUE);

        //创建Integer类型的对象
        Integer i1 = new Integer(10);//int---->Integer
        Integer i2 = new Integer("123");//String--->Integer

        System.out.println(i1);//10
        System.out.println(i2);//123

        /*
        以下程序编译可以通过，但是运行的时候会报异常，数字格式化异常
        虽然可以将字符串转换成Integer类型，但是该字符串也必须是“数字字符串”
         */
        //Integer i3 = new Integer("abfds");//java.lang.NumberFormatException:
    }
}
