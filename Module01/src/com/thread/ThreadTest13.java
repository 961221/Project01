package com.thread;

/**
 * @author shkstart
 * @create 2019-09-06 9:20
 */
public class ThreadTest13 {
    public static void main(String[] args) {
        //创建一个公共的账户
        Account1 act = new Account1("actno-001", 5000);

        //创建线程对同一个账户取款
        Thread t1 = new Thread(new Processor13(act));
        Thread t2 = new Thread(new Processor13(act));

        t1.start();
        t2.start();
    }

}

//取款线程
class Processor13 implements Runnable{
    Account1 act;

    Processor13(Account1 act)
    {
        this.act = act;
    }
    @Override
    public void run() {
        act.withDraw(1000);
        System.out.println("取款1000.0成功，余额“"+act.getBalance());
    }
}

//账户
class Account1{
    private String actno;
    private double balance;  //余额

    public Account1(){}

    public Account1(String actno,double balance)
    {
        this.actno = actno;
        this.balance = balance;
    }
    //get和set方法
    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //对外提供一个取款的方法
    public void withDraw(double money)//对账户进行取款操作
    {
        //把需要同步的代码放到同步语句快中
        /*

         */
        synchronized (this) {
            double after = balance - money;
            //延迟
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            //更新
            this.setBalance(after);
        }
    }
}