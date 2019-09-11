package com.oo.polymorphic;

/**
 * @author shkstart
 * @create 2019-09-09 17:46
 */
public class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("鸟儿飞翔");
    }

    public void fly(){
        System.out.println("bird fly" );
    }
}
