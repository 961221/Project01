package com.thread;

/**
 * @author shkstart
 * @create 2019-09-06 13:32
 */

public class ThreadTest16 {

    public static void main(String[] args) throws Exception
    {

        MyClass1 mc1 = new MyClass1();
        MyClass1 mc2 = new MyClass1();
        Processor16 p1 = new Processor16(mc1);
        Processor16 p2 = new Processor16(mc2);

        //两个线程共享 一个对象mc
        Thread t1 = new Thread(p1);
        t1.setName("t1");
        Thread t2 = new Thread(p2);
        t2.setName("t2");

        //启动线程
        t1.start();
        //延迟（保证t1线程先执行，并执行run）
        Thread.sleep(1000);

        t2.start();

    }
}

class MyClass1{
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
    // 2.m2方法不会等m1方法结束，t1，t2不共享同一个mc
    public synchronized void m2(){
        System.out.println("m2....");
    }

}

class Processor16 implements Runnable{
    MyClass1 myClass;

    Processor16(MyClass1 myClass)
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
