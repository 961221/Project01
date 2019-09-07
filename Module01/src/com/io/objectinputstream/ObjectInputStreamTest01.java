package com.io.objectinputstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author shkstart
 * @create 2019-09-04 16:22
 */
public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws Exception
    {
        //1.创建反序列化流
        ObjectInputStream  ois = new ObjectInputStream(new FileInputStream("D:/java学习/Project01/Module01/src/com/io/30.txt"));

        //2.反序列化
        Object o = ois.readObject();

       System.out.println(o);//User[name=周杰伦]

        //关闭
        ois.close();


    }
}
