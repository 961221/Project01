package com.io.fileinputstream;

import java.io.FileInputStream;

/**
 * @author shkstart
 * @create 2019-09-04 6:57
 */
public class FileInputStreamTest04 {
    public static void main(String[] args) throws Exception
    {
        //1.创建输入流
        //FileInputStream fis = new FileInputStream("D:/java学习/Project01/Module01/src/com/io/21.txt");
        //读取自己的文件
        FileInputStream fis = new FileInputStream("D:/java学习/Project01/Module01/src/com/io/fileinputstream/FileInputStreamTest04.java");

        //2.循环读取
       byte[] bytes = new byte[1024];//每次读取1024B

      while(true)
      {
          int temp = fis.read(bytes);
          if(temp == -1)
              break;
          System.out.println(new String(bytes,0,temp));
      }
        //升级循环
       /* int temp =0;
        while((temp = fis.read(bytes)) != -1)
        {
            //将byte中的有效数据转换为字符串
            System.out.println(new String(bytes,0,temp));
        }

        */
        //3.关闭流
        fis.close();
    }
}
