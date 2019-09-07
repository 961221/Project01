package com.wy.map;

import java.util.*;

/**
 * @author shkstart
 * @create 2019-09-01 23:09
 */
public class MapTest01 {
    public static void main(String[] args)
    {
        // 1.创建Map集合
        //HashMap的默认初始化容量是16，默认加载因子是0.75
        Map persons =  new HashMap();

        //2.存储键值对
        persons.put("1000","daolai");
        persons.put("1001","dalai");
        persons.put("2000","dolai");
        persons.put("2001","daoli");
        persons.put("3000","daola");
        persons.put("3001","daoi");
        persons.put("1000","daoai");

        //3.判断键值对的个数
        //Map中的key是无序不可重复的和HashSet相同
        System.out.println(persons.size());

        //4..判断集合中是否包含这样的key
        System.out.println(persons.containsKey("1000"));

        //5.判断集合中是否包含这样value
        //注意 ：Map中如果key重复了，value采用的是“覆盖”
        System.out.println(persons.containsValue("daolai"));

        //6.通过key来获取value
        System.out.println(persons.get("1000"));

        //7.通过key删除键值对
        System.out.println(persons.remove("3000"));
        System.out.println(persons.size());

        //8.获取所有的value
        Collection values = persons.values();
        //遍历
        for(Iterator it = values.iterator();it.hasNext();)
        {
            System.out.println(it.next());
        }

        //9.获取所有的key
        //以下程序演示如何遍历Map集合
        Set key = persons.keySet();
        Iterator it2 = key.iterator();
        while(it2.hasNext())
        {
            Object id = it2.next();
            //获取id的姓名
            Object name = persons.get(id);
            System.out.println(id+"--->"+name);
        }


        //10.entrySet
        //将Map转换成Set集合
        Set entrySet = persons.entrySet();
        //遍历
        for(Iterator it = entrySet.iterator();it.hasNext();)
        {
            System.out.println(it.next());
        }

    }
}
