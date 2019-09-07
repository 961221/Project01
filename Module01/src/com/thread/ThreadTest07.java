package com.thread;

/**
 * @author shkstart
 * @create 2019-09-05 23:50
 */
public class ThreadTest07 {
    public static void main(String[] args) throws Exception
    {
        Thread t = new Processor5();
        t.setName("t");
        t.start();

        //休眠
        //静态方法可以直接类名调用，也可以引用.调用
        t.sleep(5000);//等同于Thread.sleep(50000);阻塞的还是当前的线程（主线程），和t线程无关（静态方法，不是成员方法）
        System.out.println("Hello World!");

        A a1 = null;
        a1.m1();//不会报空指针异常（m1是静态的与对象无关，程序在编译阶段看的是a，运行阶段还是A）

    }
}

class Processor6 extends Thread{
    @Override
    public void run() {
        //super.run();
        for(int i = 0; i<5; i++)
        {System.out.println(Thread.currentThread().getName()+"---->"+i);
        }
    }
}

class A{
    public static void m1(){}
}