package com.io.fileoutputstream;

import java.io.FileOutputStream;

/**
 * @author shkstart
 * @create 2019-09-04 7:30
 */
public class FileOutputStreamTest01 {
    public static void main(String[] args) throws Exception
    {
        FileOutputStream fos = null;

        try{
            //1.创建文件字符输出流
            //金森使用，会将源文件覆盖
            //该文件不存在则自动创建
            fos = new FileOutputStream("D:/java学习/Project01/Module01/src/com/io/22.txt");
            //以追加的方式写入
            //fos = new FileOutputStream("D:/java学习/Project01/Module01/src/com/io/22.txt",true);
            //2.开始写
            String mgs = "HelloWorld！";

            //将String转换为byte数组
            byte[] bytes = mgs.getBytes();

            //将byte数组中的所有数组写入
            fos.write(bytes);

            //将byte数组的一部分写入
            fos.write(bytes,0,3);


            //推荐最后的时候为了保证数据完全写入硬盘，所以要刷新
            //强制写入
            fos.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭
            if(fos != null)
            {
                try{
                    fos.close();
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }

        }



    }
}
