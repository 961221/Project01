package com.thread;

/**
 * @author shkstart
 * @create 2019-09-05 15:42
 */
public class ThreadTest02 {
   public static void main(String[] args)
    {
        //创建线程
       Thread t = new Processor();
        //启动
        t.start();
        //这段代码执行瞬间结束，告诉JVM再分配一个新的栈给t线程
                    //run不需要程序员手动调用，系统线程启动后自动调用run方法

        //t.run(); //这是普通的方法的调用，这样做程序只有一个线程，run方法结束之后，下面的程序才能继续执行

        //这段代码在主线程中运行

        for (int i = 0; i < 10; i++)
        {
            System.out.println("main-->"+i);
        }

        //有了多线程之后，main方法结束只是主线程栈中没有方法栈帧了
        //但是其他线程或者其他栈中还有栈帧
        //main方法结束，程序可能还在运行


    }
}

//定义一个线程
class Processor extends Thread{
    //重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("run-->"+i);
        }
    }

}
