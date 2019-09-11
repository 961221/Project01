package com.io.filewriter;

import java.io.FileWriter;

/**
 * @author shkstart
 * @create 2019-09-04 9:51
 */
public class FileWriterTest01 {
    public static void main(String[] args) throws Exception
    {
        //创建文件字符输出流
        FileWriter fw = new FileWriter("D:/java学习/Project01/Module01/src/com/io/27.txt");

        //开始写
        fw.write("林俊杰");

        char[] chars = {'f','f','t','g','p','y'};
        //将char数组的一部分写入
        fw.write(chars,0,3);
        //刷新
        fw.flush();

        //关闭
        fw.close();
    }
}
