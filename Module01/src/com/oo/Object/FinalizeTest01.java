package com.oo.Object;

/**
 * @author shkstart
 * @create 2019-09-10 16:03
 */
public class FinalizeTest01 {

    public static void main(String[] args) {
        Person1 p = new Person1();
        p = null;//没有引用指向它，等待回收

        //程序员只能“建议”垃圾回收器回收垃圾
        System.gc();
    }
}

class Person1{

    //重写Object中的finalize方法

    public void finalize() throws Throwable{
        System.out.println(this + "马上要被回收啦");

        //让引用再次重新指向该对象，该对象不是垃圾数据，不会被垃圾回收机制回收
        Person1 p = this;
    }

}
