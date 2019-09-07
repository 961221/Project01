package com.io.coye;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author shkstart
 * @create 2019-09-04 10:01
 */
public class Copy02 {
    public static void main(String[] args) throws Exception
    {
        FileReader fr = new FileReader("D:/java学习/Project01/Module01/src/com/io/coye/Copy02.java");
        FileWriter fw = new FileWriter("D:/demo/Copy02.java");

        char[] chars = new char[512];
        int temp = 0;
        while((temp = fr.read(chars)) != -1)
        {
            //д
            System.out.println(new String(chars,0,temp));
        }

        fw.flush();
        fr.close();
        fw.close();

    }
}
