package com.oo.This;

/**
 * @author shkstart
 * @create 2019-09-09 15:30
 */
public class Customer {
    //姓名【堆内存的对象内部存储，所以访问该数据的时候，必须先创建对象，通过引用方式访问】
    String name;//实例变量：必须采用“引用.”的方法访问

    //构造方法
    public Customer(){}

    /*
    不带有static关键字的一个方法
    顾客购物的行为
    每一个顾客购物最终结果是不一样的
    所以购物这个行为属于对象级别的行为
    由于每一个对象在执行购物这个动作的时候最终结果不同，所以购物这个动作必须要有“对象”参与
    重点：没有static关键字的方法被称为“实例方法”，实例方法的访问“引用.”
    重点：没有static关键字的变量是“实例变量”
    注意：当一个行为/动作执行的过程中是需要对象参与的，那么这个方法一定要定义为“实例方法”，不需要带static关键字
    以下方法定义为实例方法，因为每一个顾客真正购物的时候，最终结果是不同的，所以这个动作在完成的时候必须有对象的参与
     */
    public void shopping(){

        System.out.println(name+"is shopping");
    }

    //带有static
    public static void doSomg(){
        /*
        这个执行过程中没有“当前对象”，因为带有static的方法是通过类名的方式访问的
        或者说这个“上下文”当中没有“当前对象”，自然不存在this（this代表的是当前正在执行的这个动作的对象）
         */

        /*
        以下程序为什么编译错误呢？
        dosome方法调用不是对象去掉用，而是用类名去调用，执行过程中没有“当前对象”
        name是一个“实例变量”，以下代码的含义：
        访问当前对象的name，没有当前对象，自然也不能访问当前对象的name
         */
        //System.out.println(name);
    }

    public static void doOther(){
        /*
         假设想访问name这个实例变量，可以采用下面的方案（绝对不是访问当前对象的name）
         */
        Customer c = new Customer();

        System.out.println(c.name);//这里访问的name是c引用指向对象的name
    }
}
class CustomerTest{
    public static void main(String[] args) {
        //创建Customer对象
        Customer c = new Customer();
        c.name = "道来 ";
        c.shopping();

        //调用doSome方法（修饰列表有static）
        //采用“类名.”的方式访问，显示这个方法在执行的时候不需要对象的参加‘
        Customer.doSomg();

        //调用doOther
        Customer.doOther();
    }
}