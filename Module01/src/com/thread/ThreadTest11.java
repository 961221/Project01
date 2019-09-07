package com.thread;

/**
 * @author shkstart
 * @create 2019-09-06 1:54
 */
public class ThreadTest11 {
    public static void main(String[] args) throws Exception
    {
        Thread t = new Thread(new Processor11());
        t.setName("t");
        t.start();


        //合并线程
        t.join();//t和主线程合并，单线程程序！
        //主线程
        for(int i = 0; i<10; i++)
        {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}

class Processor11 implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i<5; i++)
        {
            try{
               // Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }


            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
