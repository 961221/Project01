package com.StringBufferStringBuilder;

/**
 * @author shkstart
 * @create 2019-09-11 10:30
 */
public class Test01 {
    public static void main(String[] args) {
        //创建字符串缓冲对象、
        StringBuffer sb = new StringBuffer();///16

        //可以向StringBuffer中追加字符串
        String[] ins = {"唱","跳","rap","篮球"};

        //推荐字符串频繁拼接使用StringBuffer或者StringBuilder
        for(int i = 0; i<ins.length; i++)
        {
            if(i == ins.length-1)
            {
                sb.append(ins[i]);
            }else{
                sb.append(ins[i]);
                sb.append(",");
            }
        }
        System.out.println(sb);
    }
}
