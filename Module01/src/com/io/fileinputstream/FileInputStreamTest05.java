package com.io.fileinputstream;

import java.io.FileInputStream;

/**
 * @author shkstart
 * @create 2019-09-04 7:22
 */
public class FileInputStreamTest05 {
    public static void main(String[] args) throws Exception
    {
        //1.创建流
        FileInputStream fis = new FileInputStream("D:/java学习/Project01/Module01/src/com/io/21.txt");
        System.out.println(fis.available());

        System.out.println(fis.read());
        //int available();返回流中剩余的估计字节数
        System.out.println(fis.available());

        //跳过2个字节
        fis.skip(2);
        System.out.println(fis.read());
        //关闭
        fis.close();
    }
}
