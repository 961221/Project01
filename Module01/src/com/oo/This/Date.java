package com.oo.This;

/**
 * @author shkstart
 * @create 2019-09-09 16:44
 */
public class Date {
    //属性
    private int year;
    private int month;
    private int day;

    //构造方法
    public Date(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /*
    需求：当程序员调用一下无参数构造方法，默认创建的日期是“1970-1-1”
     */
    public Date(){
        /*
         this.year = year;
        this.month = month;
        this.day = day;
         */
        /*
        以上代码可以通过调用另一个构造方法体来完成
        但是前提不能创建新的对象，以下代码表示创建了一个全新的对象
        new Date(1970,1,1);
         */
        this(1970,1,1);
    }
}


