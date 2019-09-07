package com.io.printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shkstart
 * @create 2019-09-04 15:10
 */
public class PrintStreamTest01 {
    public static void main(String[] args) throws Exception
    {
        //默认输出到控制台
       System.out.println("HelloWorld!");

       PrintStream ps = System.out;
       ps.println("Hello World!");

        //可以改变输出方向  static void setOut（PrintStream out）
        //log日志文件
        System.out.println(new FileOutputStream("D:/java学习/Project01/Module01/src/com/io/log.txt"));


        //再次输出
        //System.out.println("hhhhhaffds");
        //通常使用上面的方式记录日志
        //需求：记录日志：m1方法开始执行的时间和结束的时间记录到log文件中
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println("m1开始执行"+sdf.format(new Date()));
        m1();
        System.out.println("m1执行结束"+sdf.format(new Date()));


    }
    public static void m1(){
        System.out.println("m1方法执行");
    }

}
