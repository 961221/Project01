package com.oo.Fianl;

/**
 * @author shkstart
 * @create 2019-09-10 8:27
 */
public class FinalTest02 {
    /*成员变量之实例变量
      实例变量有默认值，final修饰的变量一旦赋值不能重新赋值
      综合考虑，java语言规定实例变量使用final修饰之后，必须手动赋值，不能采用系统默认值
     */
    //final int age;//编译错误
    //方法一
    final int age = 10;
    //方法二
    final int num;
    public FinalTest02(){
        this.num = 200;
    }
    //以上两种方式：本质上是一种方式，都是在构造方法执行的过程中给实例变量赋值

    public static void main(String[] args) {
        final int a;
        a = 100;
        //a = 200;不可二次赋值
    }

}
