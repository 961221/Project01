package com.oo.Static;

/**
 * @author shkstart
 * @create 2019-09-10 7:53
 */
public class StaticTest01 {
    static{
        System.out.println("类加载————》1");
    }
    static{
        System.out.println("类加载————》2");
    }
    static{
        System.out.println("类加载————》3");
    }
    static{
        System.out.println("类加载————》4");
    }

    public static void main(String[] args) {
        System.out.println("main");
        new Test();
        new Test();
    }
}
class Test{
    //构造函数
    public Test(){
        System.out.println("Test构造方法执行");
    }
    {
        System.out.println(1);
    }
    {
        System.out.println(2);
    }
    {
        System.out.println(3);
    }

}
