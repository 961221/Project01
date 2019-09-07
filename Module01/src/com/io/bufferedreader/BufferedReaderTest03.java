package com.io.bufferedreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author shkstart
 * @create 2019-09-04 11:17
 */
public class BufferedReaderTest03 {
    public static void main(String[] args) throws Exception
    {

        //以前的方式
        //System.in是一个标准的输入流，默认接收键盘的输入
       /* Scanner scanner = new Scanner(System.in);

        //程序执行到此处停下来，等待用户的输入
        //以空格为分割线，拿空格前面的数据，后面的拿不到
        String str = scanner.next();

        System.out.println("您输入了"+str);

        */


        //使用BufferedReader用来接收用户的输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //接收输入（每一次都接收一行）
        String str = br.readLine();
        System.out.println("您输入了"+str);

        //关闭
        br.close();

    }
}
