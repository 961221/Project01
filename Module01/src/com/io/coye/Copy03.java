package com.io.coye;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author shkstart
 * @create 2019-09-04 11:40
 */
/*
    使用BufferedReader和BufferWriter完成复制
 */
public class Copy03 {
    public static void main(String[] args)throws Exception
    {
       BufferedReader br = new BufferedReader(new FileReader("D:/java学习/Project01/Module01/src/com/io/22.txt"));
       BufferedWriter bw = new BufferedWriter(new FileWriter("D:/demo/24.txt"));

       String temp = null;
       while ((temp = br.readLine()) != null)
       {
           bw.write(temp);
           bw.newLine();
       }
       bw.flush();
       br.close();
       bw.close();


    }
}
