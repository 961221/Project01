package com.oo.Fianl;

/**
 * @author shkstart
 * @create 2019-09-10 8:36
 */
public class FinalTest03 {
    public static void main(String[] args) {
        //创建用户对象
        User u = new User(100);//User u = 0x123;

        //又创建了一个新的User对象
        //程序执行到此处表示以上的对象已经成为了垃圾数据，等待垃圾回收期回收
        u = new User(200); //u = 0x2568;

        //创建用户对象
        final User user = new User(30);
        //final修饰的引用，一旦指向某个对象之后，不能再指向其它对象，那么被指向的对象无法被垃圾回收器回收
        //user = new User(500);
        //final修饰的引用虽然指向某个对象之后不能再指向其它对象，但是所指的对象内部的内存是可以被修改的
        user.id = 50;

    }
}

class User{
    int id;
    public User(int id)
    {
        super();
        this.id = id;
    }
}
//中国人
class Chinese{
    /*国籍
    需求：每个中国人的国籍都是中国，而且国籍不会发生改变，为了防止国籍被修改，建议加final修饰
    final修饰的实例变量不可变，这种变量和static联合使用，被称为“常量”
    定义语法：
        public static final 类型 常量名 = 值；
    java规范中要求所有常量的名字全部大写，每一个单词之间用下划线链接
     */
    public final static String GUO_JI = "中国";
}