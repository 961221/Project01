package com.thread;

/**
 * @author shkstart
 * @create 2019-09-06 13:32
 */
/*
    问题：m1方法没结束的时候，m2能不能执行？
        1. 能，m2没有synchronized对象锁
        2. 不能，m2有synchronized对象锁
 */
public class ThreadTest15 {

    public static void main(String[] args) throws Exception
    {

        MyClass mc = new MyClass();
        Processor15 p = new Processor15(mc);

        //两个线程共享 一个对象mc
        Thread t1 = new Thread(p);
        t1.setName("t1");
        Thread t2 = new Thread(p);
        t2.setName("t2");

        //启动线程
        t1.start();
        //延迟（保证t1线程先执行，并执行run）
        Thread.sleep(1000);

        t2.start();

    }
}

class MyClass{
    public synchronized void m1(){
        try{
            Thread.sleep(10000);
        }catch (Exception e){e.printStackTrace();}
       System.out.println("m1.....");
    }
   /* 1. public void m2(){
         System.out.println("m2....");
    }
A
    */
   // 2.
   public synchronized void m2(){
       System.out.println("m2....");
   }

}

class Processor15 implements Runnable{
    MyClass myClass;

    Processor15(MyClass myClass)
    {
        this.myClass = myClass;
    }

    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("t1"))
        {
            myClass.m1();
        }
        if(Thread.currentThread().getName().equals("t2"))
        {
            myClass.m2();
        }
    }
}