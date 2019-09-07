package com.io.fileinputstream;
import java.io.FileInputStream;

/**
 * @author shkstart
 * @create 2019-09-03 23:29
 */
public class FileInputStreamTest03 {
    public static void main(String[] args) throws Exception
    {
        //1.创建输入流
        FileInputStream fis = new FileInputStream("D:/java学习/Project01/Module01/src/com/io/21.txt");
        //2.开始读
        //准备一个byte数组
        //每次最多读取3个字节
        byte[] bytes = new byte[3];
        //int read(byte[] bytes);  该方法返回的int类型的值代表的是这次读取了多少个字节
        int i1 = fis.read(bytes);
        System.out.println(i1);//3

        //将byte数组转换成为字符串
        System.out.println(new java.lang.String(bytes));//abc
        int i2 = fis.read(bytes);
        System.out.println(i2);//3
        System.out.println(new java.lang.String(bytes));//def

        int i3 = fis.read(bytes);
        System.out.println(i3);//1
        System.out.println(new java.lang.String(bytes));//gef
        System.out.println(new String(bytes,0,i3));//将byte[]部分转换为字符串

        int i4 = fis.read(bytes);//-1 已经到达文件的末尾，返回-1
        System.out.println(i4);
        //关闭
        fis.close();
    }
}