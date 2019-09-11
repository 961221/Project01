package com.oo.Interface;

/**
 * @author shkstart
 * @create 2019-09-10 15:02
 */
//生产汽车
public class Car {
    //Field
    //引擎
    //面向接口编程
    Engine e;

    //Constructor
    Car(Engine e)
    {
        this.e = e;
    }

    //汽车能够测试引擎
    public void testEngine(){
        e.start();//面向接口调用
    }
}
