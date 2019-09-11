package com.oo.polymorphic;

/**
 * @author shkstart
 * @create 2019-09-09 17:43
 */
public class Cat extends Animal{
    //继承父类方法
    @Override
    public void move() {
        System.out.println("猫在走猫步");
    }
    //不是从父类中继承的方法
    //这个方法是子类对象他有的方法
    public void catchMouse(){
        System.out.println("抓老鼠");
    }

}
