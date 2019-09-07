package com.io.bufferedreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author shkstart
 * @create 2019-09-04 10:10
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) throws Exception
    {
        //创建一个带缓冲区的字符输入流

        /*//创建一个文件字符输入流
        FileReader fr = new FileReader("D:/java学习/Project01/Module01/src/com/io/22.txt");

        //将文件字符输入流包装成带有缓冲区的字符输入流
        BufferedReader br = new BufferedReader(fr);

         */

        BufferedReader br = new BufferedReader(new FileReader("D:/java学习/Project01/Module01/src/com/io/22.txt"));


        //根据流出现的位置，可以分为包装流（处理流）和节点流
        //FileReader fr是一个节点流
        //BufferedReader br 是一个包装流（处理流）


        //开始读

        String temp = null;
        while((temp = br.readLine()) != null)//br.readLine()方法读取一行，但是行尾不带换行符
        {
            System.out.println(temp);//输出一行
        }


        //关闭
        //注意：关闭的时候只需要关闭最外层的包装流，（这里有一个装饰者模式）
        br.close();



    }
}
