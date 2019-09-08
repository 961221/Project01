package com.io.coye;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author shkstart
 * @create 2019-09-04 8:01
 */
public class Copy01 {
    public static void main(String[] args)throws  Exception
    {
        //创建输入流
        FileInputStream fis = new FileInputStream("Module01/src/com/io/22.txt");
        //FileInputStream f0s = new FileInputStream(new File("com/io/30.txt"));
        //创建输出流
        FileOutputStream fos = new FileOutputStream("D:/demo/21.txt");//名字可以更改，但必须有哦

        //一边读一边写
        byte[] bytes = new byte[1024];
        int temp =0;
        while((temp = fis.read(bytes)) != -1)
        {
            //将byte数组内容直接写入
            fos.write(bytes,0,temp);
        }

        //刷新
        fos.flush();


        //关闭
        fis.close();
        fos.close();

    }
}
