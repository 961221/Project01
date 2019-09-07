package com.io.datainputstream;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * @author shkstart
 * @create 2019-09-04 14:57
 */
public class DataInputStreamTest01 {
    public static void main(String[] args) throws Exception{
        //创建输入流
        DataInputStream dis = new DataInputStream(new FileInputStream("D:/java学习/Project01/Module01/src/com/io/29.txt"));


        //读
        //注意：要使用该流读取数据，必须提前知道该文件的存储格式，顺序。
        //读的顺序必须和写的顺序相同
        byte b = dis.readByte();
        short s = dis.readShort();
        int i = dis.readInt();
        long l = dis.readLong();
        float f = dis.readFloat();
        double d = dis.readDouble();
        boolean flag = dis.readBoolean();
        char c = dis.readChar();

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(flag);
        System.out.println(c);

        //关闭
        dis.close();



    }
}
