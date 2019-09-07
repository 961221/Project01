package com.thread;

/**
 * @author shkstart
 * @create 2019-09-05 23:32
 */
public class ThreadTest06 {
    public static void main(String[] args) throws Exception{
        Thread t1 = new Processor5();
        t1.setName("t1");
        t1.start();

        //阻塞主线程
        for (int i = 0; i<10; i++)
        {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
            Thread.sleep(500);
        }
    }


}

class Processor5 extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i = 0; i<10; i++)
        {
            System.out.println(Thread.currentThread().getName()+"---->"+i);
            try{
                Thread.sleep(1000);
            }catch (Exception e){

            }

        }
    }
}