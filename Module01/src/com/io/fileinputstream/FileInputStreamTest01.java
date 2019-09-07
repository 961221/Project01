package com.io.fileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author shkstart
 * @create 2019-09-03 21:57
 */
/*
    java.io.InputStream;
        java.io.FileInputStream;文件字节输入流
        按照字节方式读取文件
 */
public class FileInputStreamTest01 {
    public static  void main(String[] args)throws Exception
    {

        FileInputStream fis = null;
        try {
            //1.要读取文件，先与这个文件创建一个“输入流”
            //文件路径
            //String filePath = "21.txt";  //相对路径，相对当前而言，在当前路径下找
            //String filePath = "D:\\java学习\\Project01\\Module01\\src\\com\\io\\21.txt";
            //D:/java学习/Project01/Module01/src/com/io/21.txt
            String filepath = "D:/java学习/Project01/Module01/src/com/io/21.txt";
            fis = new FileInputStream(filepath);

            //2.开始读
            int i1 = fis.read();//以字节的方式读取
            int i2 = fis.read();
            int i3 = fis.read();
            int i4 = fis.read();
            int i5 = fis.read();
            int i6 = fis.read();
            int i7 = fis.read();//-1  如果已经读取到了文件的末尾，就返回-1

            System.out.println(i1);
            System.out.println(i2);
            System.out.println(i3);
            System.out.println(i4);
            System.out.println(i5);
            System.out.println(i6);
            System.out.println(i7);
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }finally {
            //为了保证流一定会释放，所以finally语句块中执行
            if(fis != null)
            {try {
                fis.close();
            }catch (IOException e)
            {
                e.printStackTrace();
            }
            }
        }
    }
}
