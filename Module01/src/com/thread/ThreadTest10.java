package com.thread;

/**
 * @author shkstart
 * @create 2019-09-06 1:48
 */
public class ThreadTest10 {
    public static void main(String[] args)
    {
        Thread t = new Processor10();
        t.setName("t");
        t.start();
        //主线程
        for(int i = 0; i<100; i++)
        {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}

class Processor10 extends Thread{
    @Override
    public void run() {
        super.run();
        for(int i = 0; i<100; i++)
        {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
            if(i%20==0)
            {
                Thread.yield();
            }
        }
    }
}