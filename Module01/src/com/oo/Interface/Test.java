package com.oo.Interface;

/**
 * @author shkstart
 * @create 2019-09-10 15:09
 */
public class Test {
    public static void main(String[] args) {
        //1.生产引擎
        YAMAHA e1 = new YAMAHA();

        //2.生产汽车
        Car c = new Car(e1);

        //3.测试引擎
        c.testEngine();

        //换HONDA
        c.e = new HONDA();

        c.testEngine();
    }
}
