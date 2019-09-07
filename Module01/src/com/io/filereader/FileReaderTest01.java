package com.io.filereader;

import java.io.FileReader;

/**
 * @author shkstart
 * @create 2019-09-04 9:30
 */
public class FileReaderTest01 {
    public static void main(String[] args) throws  Exception {
        FileReader fr = null;
        try{
        fr = new FileReader("D:/java学习/Project01/Module01/src/com/io/22.txt");
            //开始读
        char[] chars = new char[512];
        int temp = 0;
        while((temp = fr.read(chars)) != -1)
        {
            //将char数组有效的部分转换为字符串
            System.out.println(new String(chars,0,temp));
        }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(fr != null){
                try{
                    fr.close();
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
