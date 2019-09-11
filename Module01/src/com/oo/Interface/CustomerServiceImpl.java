package com.oo.Interface;

/**
 * @author shkstart
 * @create 2019-09-10 14:57
 */
/*
编写接口的实现类
该类的编写完全是面向接口去实现的
 */
public class CustomerServiceImpl implements CustomerService {
    //对接口中的抽象方法进行实现
    public void logout(){
        System.out.println("成功退出系统");
    }

}
