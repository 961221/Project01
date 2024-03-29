package com.io.fileinputstream;

import java.io.FileInputStream;

/**
 * @author shkstart
 * @create 2019-09-03 23:13
 */
//以下程序存在缺点：频繁访问磁盘，伤害磁盘，并且效率低
public class FileInputStreamTest02 {
    public static void main(String[] args) throws Exception
    {
        //1.创建流
        FileInputStream fis = new FileInputStream("D:/java学习/Project01/Module01/src/com/io/21.txt");

        //2.开始读
        /*while(true)
        {
            int temp = fis.read();
            if(temp == -1)
                break;
            System.out.println(temp);
        }*/

        //升级循环
        int temp = 0;
        while((temp = fis.read()) != -1)
        {
            System.out.println(temp);
        }

        //关闭
        fis.close();

    }
}
