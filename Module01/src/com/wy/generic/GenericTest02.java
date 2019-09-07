package com.wy.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author shkstart
 * @create 2019-09-02 23:34
 */
/*
    2.泛型语法如何实现？
    泛型是一个编译阶段的语法
    在编译阶段统一集合中的类型
 */
public class GenericTest02 {
    public static void main(String[] args)
    {
        //创建一个List集合，只能存储字符串集合
        List<String> strs = new ArrayList<>();

        //添加元素
        //Error
        //strs.add(1);

        strs.add("daolai");
        strs.add("wenying");
        strs.add("jjjj");


        //遍历
        for(Iterator<String> it = strs.iterator();it.hasNext();)
        {
            String s = it.next();
            System.out.println(s);
        }

    }
}
