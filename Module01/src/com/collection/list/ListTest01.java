package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author shkstart
 * @create 2019-08-31 12:59
 */

/*
    List集合存储元素特点
        1.有序（List集合中存储有下标）：存进去是这样的顺序，取出来还是这样的顺序
        2.可重复
 */
public class ListTest01 {
    public static void main(String[] args)
    {
        // 创建一个List集合
       List l = new ArrayList();

        //添加
      l.add(10);
      l.add(12);
      l.add(15);
      l.add(100);

        //遍历
        for(Iterator it = l.iterator();it.hasNext();)
        {
            Object o = it.next();
            System.out.println(o);
        }

    }
}
