package com.oo.This;

/**
 * @author shkstart
 * @create 2019-09-09 16:14
 */
public class ThisTest01 {
    //实例变量（引用.的方式访问）
    int num = 10;

    //带有static的方法
    //JVM负责调用main方法，JVM是怎么调用的？
    //ThisTest01.main(String[]);

    public static void main(String[] args) {
        //没有当前对象this
        //以下代码的含义是啥？
        //访问“当前对象”的num属性
        //System.out.println(num);//编译错误
        //System.out.println(this.num);//编译错误

        //想要调用num怎么办？
        ThisTest01 tt = new ThisTest01();
        System.out.println(tt.num);
        tt.run();
    }

    //带有static
    public static void doSome(){
        System.out.println("do some!");
    }

    //实例方法
    public void doOther(){
        //this代表当前对象
        System.out.println("do other!");
    }
    //run是实例方法，调用run方法一定存在对象
    //一定是先创建了一个对象才能调用run方法
    public void run(){
        //在大括号中的代码执行的过程中一定存在“当前对象”
        //也就是这里一定有“this”的、
        System.out.println("run execute");

        //doOther是一个实例方法，实例方法调用必须有对象的存在
        //以下的代码表示的含义就是：调用当前对象的doOther方法
        doOther();//this大部分时间都是可以省略的
        this.doOther();//比较完整的写法。
    }
}
