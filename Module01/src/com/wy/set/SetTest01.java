package com.wy.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author shkstart
 * @create 2019-08-31 16:15
 */
public class SetTest01 {
    public static void main(String[] args)
    {
        //创建集合对象
        Set s = new HashSet();
        //无序不可重复
        s.add(1);
        s.add(188);
        s.add(1);
        s.add(100);
        s.add(155);
        for(Iterator it = s.iterator();it.hasNext();)
        {
            System.out.println(it.next());
        }
    }
}
