package com.oo.polymorphic;

/**
 * @author shkstart
 * @create 2019-09-09 17:48
 */
public class Test {
    public static void main(String[] args) {
        //以前写的程序
        /*Animal a = new Animal();
        a.move();

        Cat c = new Cat();
        c.catchMouse();
        c.move();

        Bird b = new Bird();
        b.fly();
        b.move();*/

        //使用多态语法机制
        /*
        1.Animal和Cat之间存在继承关系，Aniaml是父类，Cat是子类
        2.Cat is an Animal【合理的】
        3.new Cat()创建的对象类型是Cat。a2这个引用的数据类型是Animal，可见他们进行了类型转换
        子类型转换为父类型，称为向上转型/upcasting，或者称为自动类型转换
        4.java中允许这种语法：父类型引用指向子类型对象
         */

        Animal a2 = new Cat();
        /*
        1.java程序永远都分为编译阶段和运行阶段
        2.先分析编译阶段，再分析运行阶段，若编译无法通过，根本是无法运行的
        3.编译阶段编译器检查a2这个引用的数据类型是Animal，由于Animal.class字节码
        当中有move（）方法，所以编译通过了。这个过程我们称为静态绑定，编译阶段绑定，
        只有静态绑定成功之后才有后续的运行
        4.在程序运行阶段，JVM堆内存当中真实创建的对象是Cat对象，那么以下程序一定会调用Cat
        对象的move（）方法，此时发生了程序的动态绑定，运行阶段绑定
        5.无论是Cat类有没有重写move方法，运行阶段一定调用的是Cat对象的move方法，
        因为底层真实的对象是Cat对象
        6.父类型引用指向子类型对象这种机制导致程序存在编译阶段绑定和运行阶段绑定两种不同的形态/状态
        这种机制可以称为一种多态的语法机制
         */
        a2.move();

        /*
        分析以下程序为什么不能调用？
            因为编译阶段编译器检查到a2的类型是Animal类型，从Animal.class文件中查找catchMouse（）方法，
            最终没有找到该方法，导致静态绑定失败，没有绑定成功，也就是编译失败了，别谈运行了。
         */
        //a2.catchMouse();
        /*
        需求：
            假设想让以上的对象执行catchMouse()方法，怎么办？
                a2是无法直接调用的，因为a2的类型是Animal，Animal中没有catchMouse方法
                我们可以将a2强制类型转换为Cat类型
                a2的类型是Animal（父类），转换为Cat类型（子类），被称为向下转型/downcasting/强制类型转换。
            注：向下转型也需要两种类型之间必须有继承关系，不然编译报错，强制类型转换需要加强制类型转换符。
            什么时候需要向下转型？
                当调用的方法是子类特有的。在父类中不存在，必须进行向下转型
         */
        Cat c2 = (Cat)a2;
        c2.catchMouse();//猫抓老鼠
        long x = 100L;
        int i = (int)x;
        System.out.println(i);
        /*
        1.以下程序编译是没有问题的，因为编译器查到a3的数据类型是Animal，Animal和Cat之间存在继承关系，
        并且Animal是父类型的，Cat是子类型，父类型转换成子类型叫做向下转型，语法合格。
        2.程序虽然编译通过了，但是程序在运行阶段会出现异常，因为JVM堆内存当中真实存在的对象是Bird类型，
        Bird对象无法转换成Cat对象，因为两种类型之间不存在任何的继承关系，
        此时出现著名的： java.lang.ClassCastException
        类型转换异常这种异常总是在“向下转型”的时候会发生
         */
        /*Animal a3 = new Bird();
        Cat c3 = (Cat)a3;*/

        /*
        1.以上异常只有在强制类型转换的时候会发生，也就是说“向下转型”存在隐患（编译过了 ，但是运行错了）
        2.向上转型只要编译通过了，运行就一定不会出现问题：Animal a3 = new Bird（）；
        3.向下转型编译通过了，运行可能会错误：Animal a3 = new Bird(); Cat c3 = (Cat)a3;
        4.怎么避免向下转型出现的ClassCastException呢？
            使用instanceof运算符可以避免出现以上的异常
        5.instanceof运算符怎么用？
            5.1、语法格式：
                （引用 instanceof 数据类型名）
            5.2、以上运算符的执行结果类型是布尔类型，结果可能是true/false
            5.3、关于运算结果true/false
                 假设：（a instanceof Animal）
                 true表示：
                    a这个引用指向的对象是一个Animal类型
                 false表示：
                    a这个引用指向的不是一个Animal类型
         */
        Animal a3 = new Bird();
        if(a3 instanceof Cat)
        {
            Cat c3 = (Cat)a3;
            //调用子类对象中特有的方法
            c3.catchMouse();
        }else if(a3 instanceof Bird)
        {
            Bird b2 = (Bird)a3;
            b2.fly();
        }
    }
}
