package com.reflect.ioproperties;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author shkstart
 * @create 2019-09-07 21:50
 */
public class Test01 {
    public static void main(String[] args) throws Exception{
        //1.创建属性对象
        Properties p = new Properties();//和Map一样，只不过key和value只能存储字符串类型
                                        //key不能重复，如果key重复则value覆盖
        //2.创建输入流
        FileInputStream fis = new FileInputStream("Module01/src/com/reflect/ioproperties/dbinfo.properties");

        //3.将fis流中的所有数据加载到属性对象中
        p.load(fis);//所有现在属性对象中有（key=username，value=scott）

        //4.关闭流
        fis.close();

        //通过key获取value
        String v1 = p.getProperty("driver");
        String v2 = p.getProperty("url");
        String v3 = p.getProperty("username");
        String v4 = p.getProperty("password");

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);

    }
}
