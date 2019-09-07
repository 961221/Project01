package com.thread;

/**
 * @author shkstart
 * @create 2019-09-05 20:57
 */
public class ThreadTest05 {
    public static void main(String[] args)
    {

        Thread t1 = new Processor4();
        t1.setName("t1");

        Thread t2 = new Processor4();
        t2.setName("t2");

        System.out.println(t1.getPriority());//5
        System.out.println(t2.getPriority());//5

        //设置优先级
        t1.setPriority(5);
        t2.setPriority(10);
        //启动线程
        t1.start();
        t2.start();
    }
}

class Processor4 extends Thread{
    public void run(){
        for(int i=0; i<20;i++)
        {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
