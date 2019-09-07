package com.thread;

/**
 * @author shkstart
 * @create 2019-09-05 16:16
 */
public class ThreadTest03 {
    public static void main(String[] args)
    {

        //创建线程
        Thread t = new Thread(new Processor1());
        //启动
        t.start();
    }
}

//注意：这种方式是推荐的，因为一个类实现接口之外保留了类的继承
class Processor1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("run-->"+i);
        }
    }
}
