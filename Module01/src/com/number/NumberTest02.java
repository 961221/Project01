package com.number;

import sun.awt.image.PixelConverter;

import java.math.BigDecimal;

/**
 * @author shkstart
 * @create 2019-09-11 12:23
 */
public class NumberTest02 {
    public static void main(String[] args) {
        //创建大数据
        BigDecimal v1 = new BigDecimal(10);
        BigDecimal v2 = new BigDecimal(20);
        /*
        做加法运算
        v1+v2;//错误：两个引用类型不能做加法运算
         */
        //必须调用方法执行加法运算
        BigDecimal v3 = v1.add(v2);
        System.out.println(v3);//30

    }
}
