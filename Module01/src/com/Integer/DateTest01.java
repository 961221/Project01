package com.Integer;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shkstart
 * @create 2019-09-11 12:03
 */
public class DateTest01 {
    public static void main(String[] args) {
        //获取当前系统时间
        Date nowTime = new Date();

        System.out.println(nowTime);//Wed Sep 11 12:04:38 CST 2019

        //以上程序说明java.util.Date已经重写了Object中的toString方法
        //只不过重写的结果对于中国人不太容易理解
        //所以引入“格式化”日期
        //java.util.Date;---->String
        /*
        日期格式：
            y       年
            M       月
            d       日
            H       小时
            m       分
            s       秒
            S       毫秒
         */
        //1.创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss  SSS");

        //2.开始格式化（Date--->String）
        String strTime = sdf.format(nowTime);
        System.out.println(strTime);
    }

}
