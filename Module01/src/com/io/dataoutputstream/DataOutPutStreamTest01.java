package com.io.dataoutputstream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * @author shkstart
 * @create 2019-09-04 14:27
 */
public class DataOutPutStreamTest01 {
    public static void main(String[] args) throws Exception
    {
        //创建数据字节输出流
       DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:/java学习/Project01/Module01/src/com/io/29.txt"));
        //准备数据
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 10000L;
        float f = 3.14f;
        double d = 23.3;
        boolean flag = true;
        char c = 'a';

        //写
        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(flag);
        dos.writeChar(c);


        //刷新
        dos.flush();

        //关闭
        dos.close();


    }
}
