package com.thread;

/**
 * @author shkstart
 * @create 2019-09-06 17:05
 */
/*
    其他所有的用户线程结束，则守护线程退出
    守护线程一般都是无限执行的
 */
public class ThreadTest19 {
    public static void main(String[] args)throws Exception
    {
        Thread t = new Processor19();
        t.setName("t1");

        //将t改为守护线程
        //t.setDaemon(true);

        t.start();

        //主线程
        for(int i = 0; i<10; i++)
        {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
            Thread.sleep(1000);

        }
    }

}

class Processor19 extends Thread{
    @Override
    public void run() {
        int i =0;
        while (true){
            i++;
            System.out.println(Thread.currentThread().getName()+"--->"+i);
            try{
                Thread.sleep(520);
            }catch (Exception e){}
        }

    }
}