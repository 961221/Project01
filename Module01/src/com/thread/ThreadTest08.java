package com.thread;

import sun.print.PrintJob2D;

/**
 * @author shkstart
 * @create 2019-09-06 0:06
 */
/*
    需求：启动线程，5s之后打断线程的休眠
 */
public class ThreadTest08 {
    public static void main(String[] args) throws Exception
    {
        Thread t = new Thread(new Processor8());
        //起名
        t.setName("t");

        t.start();
        //5s之后
        Thread.sleep(5000);
        //打断t的休眠
        t.interrupt();

    }
}

class Processor8 implements Runnable{
    @Override
    public void run() {
        try{
            Thread.sleep(100000000000L);
            System.out.println("Hello World!");
        }catch (InterruptedException e){
            //e.printStackTrace();
        }
        for(int i = 0; i<10; i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}