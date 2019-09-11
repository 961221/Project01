package com.oo.This;

/**
 * @author shkstart
 * @create 2019-09-09 17:09
 */
public class ThisTest03 {
    public static void main(String[] args) {
        ThisTest03.doSome();
        doSome();

        ThisTest03 t = new ThisTest03();
        t.doSome();
        //引用是空
        t = null;
        /*
        带有static的方法，其实既可以采用类名的方式访问，也可以采用引用的方式访问
        但是即使采用引用的方式访问，实际上执行的时候和引用指向的对象无关
       在myeclipse中开发的时候，使用引用的方式访问带有static的方法，程序会出现警告
       所以带有static方法还是建议使用“类名.”方式访问
         */
        t.doSome();
    }
    //带有static的方法，需要使用类名.的方式访问
    public static void doSome(){
        System.out.println("do Some!");
    }
}
