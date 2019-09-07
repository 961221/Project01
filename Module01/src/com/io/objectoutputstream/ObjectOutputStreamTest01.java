package com.io.objectoutputstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author shkstart
 * @create 2019-09-04 15:55
 */
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws  Exception
    {
        //1.创建java对象
        User u = new User("周杰伦");

        //2.创建输出流（序列化流）（JVM中的java对象状态保存在硬盘中）
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/java学习/Project01/Module01/src/com/io/30.txt"));

        //3.写
       //NotSerializableException
        oos.writeObject(u);
        //刷新
        oos.flush();
        //关闭
        oos.close();

    }
}
