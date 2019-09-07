package com.io.objectoutputstream;

import java.io.Serializable;

/**
 * @author shkstart
 * @create 2019-09-04 17:09
 */
/*
    因为User实现了Serializable接口，JVM会特殊待遇，会给类添加一个属性，
    serialVersionUID = 7254626448010929022,
 */
public class User0 implements Serializable {
    //不让系统自动生成，自己写一个序列化版本号
    static final long serialVersionUID = 12315656456L;

    //如果不想让该属性参加序列化，需要使用transient关键字修饰
    String name;
    User0(String name)
    {
        this.name = name;
    }
    public String toString(){
        return "User["+name+"]";
    }

}
