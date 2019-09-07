package com.thread;

/**
 * @author shkstart
 * @create 2019-09-06 1:30
 */
public class ThreadTest09 {
    public static void main(String[] args) throws  Exception{
        Processor9 p = new Processor9();
        Thread t = new Thread(p);
        t.setName("t");

        t.start();

        //5s之后停止
        Thread.sleep(5000);

        //终止
        p.run = false;
    }

}
class Processor9 implements Runnable{
    boolean run = true;
    @Override
    public void run() {


        for(int i =0; i<20; i++)
        {
            if(run){
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"--->"+i);
            }else
                return;

        }
    }
}