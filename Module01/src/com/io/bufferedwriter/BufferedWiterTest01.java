package com.io.bufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * @author shkstart
 * @create 2019-09-04 11:30
 */
public class BufferedWiterTest01 {
    public static void main(String[] args)throws Exception
    {
        //创建带有缓冲区的字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:/java学习/Project01/Module01/src/com/io/28.txt"));

        //追加方式

        //开始写
        String ss = "fsndadf  fdsjak";
        bw.write(ss);
        //写一个行分隔符
        bw.newLine();
        bw.write("fjsafe");
        //刷新
        bw.flush();
        //关闭
        bw.close();

    }
}
