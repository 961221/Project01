package com.number;

import java.text.DecimalFormat;

/**
 * @author shkstart
 * @create 2019-09-11 12:15
 */
public class NumberTest01 {
    public static void main(String[] args) {
        //1.创建数字格式化对象
        //需求：加入千分位
        DecimalFormat df = new DecimalFormat("###,###");

        //开始格式化
        //Number--》String
        System.out.println(df.format(123456789));//123,456,789

        //需求：加入千分位，保留2位小数
        DecimalFormat df1 = new DecimalFormat("###,###.##");
        System.out.println(df1.format(12345678.223));//12,345,678.22

        //需求：加入千分位，保留4位小数,不够补0
        DecimalFormat df2 = new DecimalFormat("###,###.0000");
        System.out.println(df2.format(12345678.223));//12,345,678.2230
    }
}
