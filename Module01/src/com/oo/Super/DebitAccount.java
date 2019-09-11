package com.oo.Super;

/**
 * @author shkstart
 * @create 2019-09-10 11:39
 */
public class DebitAccount extends Account {
    //Field
    //独特属性
    private double debit;

    //Constructor
    public DebitAccount(){
        super();
    }

    public DebitAccount(String actno, double balance,double debit){
        //通过子类的构造方法去调用父类的构造方法，作用是：给当前子类对象中的父类型特征赋值
        super(actno,balance);
        this.debit = debit;
    }
    //setter and getter

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }
}
