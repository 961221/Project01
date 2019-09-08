package com.reflect;

/**
 * @author shkstart
 * @create 2019-09-07 8:40
 */
public class Employee {
        //Field
        private String name;

        //Constructor
        public Employee(){
                System.out.println("无参构造方法执行！");
        }

        public Employee(String name)
        {
            this.name = name;
        }

        //方法
        public void m1(){
            System.out.println(name+"哈喽 世界");
        }

}
