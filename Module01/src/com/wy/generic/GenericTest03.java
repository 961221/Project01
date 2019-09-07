package com.wy.generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author shkstart
 * @create 2019-09-02 23:43
 */
/*
    Map使用泛型
 */
public class GenericTest03 {
    public static void main(String[] args)
    {
        Map<String,Integer> maps = new HashMap<String,Integer>();

        //存
        maps.put("西瓜",10);
        maps.put("哈密瓜",15);
        maps.put("南瓜",180);
        maps.put("香瓜",38);
        //遍历
        Set<String> keys = maps.keySet();
        for(Iterator<String> it = keys.iterator();it.hasNext();)
        {
            String k = it.next();
            Integer v = maps.get(k);
            System.out.println(k+"====="+v+"kg");
        }

    }
}
