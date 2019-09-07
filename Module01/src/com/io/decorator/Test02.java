package com.io.decorator;



/**
 * @author shkstart
 * @create 2019-09-04 13:30
 */
public class Test02 {
    public static void main(String[] args)
    {
        /*//1.创建被装饰者


        //2.创建装饰者

        */
        FileReader fr = new FileReader();

        BufferedReader br = new BufferedReader(fr);

        //3.通过执行装饰者中的方法间接执行被装饰者中的方法
       br.close();

    }
}
