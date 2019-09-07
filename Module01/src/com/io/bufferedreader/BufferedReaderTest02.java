package com.io.bufferedreader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author shkstart
 * @create 2019-09-04 11:03
 */
public class BufferedReaderTest02 {
    public static void main(String[] args)throws Exception {
        //創建带有缓冲区的字符输入流


        /*//文件字节输入流
        FileInputStream fis = new FileInputStream("D:/java学习/Project01/Module01/src/com/io/22.txt");


        //转换流（将字节流转换成为字符流）
        //isr是字符流
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

         */
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:/java学习/Project01/Module01/src/com/io/22.txt")));


        //开始读
        String temp = null;
        while ((temp = br.readLine()) != null)
        {
            System.out.println(temp);
        }

        //关闭，关闭最外层的流即可（装饰者模式）
        br.close();

    }
}
