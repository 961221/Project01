package com.oo.Super;

/**
 * @author shkstart
 * @create 2019-09-10 11:34
 */
//账户
public class Account {
    //Field
    private String actno;
    private double balance;

    public String getActno() {
        return actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    //ConStructor
    public Account()
    {
        super();
        System.out.println("Account的无参构造方法执行！");
    }
    public Account(String actno,double balance)
    {
        super();
        this.actno = actno;
        this.balance = balance;
    }

}
