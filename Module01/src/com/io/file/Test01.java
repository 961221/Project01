package com.io.file;

import java.io.File;

/**
 * @author shkstart
 * @create 2019-09-04 17:35
 */
public class Test01 {
    public static void main(String[] args) throws Exception
    {
        //路径
        File f1 = new File("D:/java学习/Project01/Module01/src/com/io/26.txt");
        File f2 = new File("D:/java学习");

        System.out.println(f1.exists());//true
        System.out.println(f2.exists());//true

        File f3 = new File("D:/TT");
        System.out.println(f3.exists());//false

        //如果不存在创建
        if(!f3.exists())
        {
            //创建目录
            //f3.mkdir();

            //创建文件
            f3.createNewFile();  //C盘拒绝访问哦！
        }
        File f4 = new File("D:/a/b/c/d/e/f/g");
        if(!f4.exists())
        {
            //创建多重目录
            f4.mkdirs();
        }

    }
}

