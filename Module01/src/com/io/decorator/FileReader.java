package com.io.decorator;

/**
 * @author shkstart
 * @create 2019-09-04 13:23
 */
/*
    思考：对FilReader这个类的close方法进行扩展
        //1.继承（不推荐，代码耦合度太高，不利于项目的扩展）
        //2.装饰者模式
 */
public class FileReader extends Reader{//被装饰者（里面的方法需要被扩展）
    public void close()
    {
        System.out.println("close方法被调用");
    }

}
