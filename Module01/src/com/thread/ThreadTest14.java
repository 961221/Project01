package com.thread;

/**
 * @author shkstart
 * @create 2019-09-06 9:20
 */
public class ThreadTest14 {
    public static void main(String[] args) {
        //创建一个公共的账户
        Account2 act = new Account2("actno-001", 5000);

        //创建线程对同一个账户取款
        Thread t1 = new Thread(new Processor14(act));
        Thread t2 = new Thread(new Processor14(act));

        t1.start();
        t2.start();
    }

}

//取款线程
class Processor14 implements Runnable{
    Account2 act;

    Processor14(Account2 act)
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
class Account2{
    private String actno;
    private double balance;  //余额

    public Account2(){}

    public Account2(String actno,double balance)
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
    //synchronized关键字添加到成员方法上，线程拿走也是this的对象锁
    public synchronized void withDraw(double money)//对账户进行取款操作
    {
        //把需要同步的代码放到同步语句快中

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