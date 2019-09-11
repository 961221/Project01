package com.oo.This;

/**
 * @author shkstart
 * @create 2019-09-09 16:37
 */
/*
    "this."用来区分局部变量和实例变量的时候，“this.”不能省略
 */
public class User {
    //属性
    private int id;   //实例变量
    private String name;

    //构造方法
    public User(){}

    public User(int id,String name)
    {
        this.id = id;//前面为实例变量，后面为局部变量
        this.name = name;
    }


}
