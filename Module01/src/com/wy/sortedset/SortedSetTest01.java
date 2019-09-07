package com.wy.sortedset;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author shkstart
 * @create 2019-09-01 17:44
 */
public class SortedSetTest01 {
    public static void main(String[] args) throws Exception
    {
        //创建集合
       SortedSet ss = new TreeSet();

        //添加元素
        ss.add(100);//自動装箱
        ss.add(15);
        ss.add(58);
        ss.add(56);

        //遍历
        Iterator it = ss.iterator();
        while(it.hasNext())
        {
            Object o = it.next();
            System.out.println(o);
        }
        //String
        SortedSet strs = new TreeSet();

        strs.add("daolai");
        strs.add("kebi");
        strs.add("kuli");
        strs.add("wenying");
        //遍历
        it = strs.iterator();
        while(it.hasNext())
        {
            Object o = it.next();
            System.out.println(o);
        }
        //日期
        String str1 = "2019-08-01";
        String str5 = "2017-08-01";
        String str2 = "2015-08-01";
        String str3 = "2020-08-01";
        String str4 = "2038-08-01";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date t1 = sdf.parse(str1);
        Date t2 = sdf.parse(str2);
        Date t3 = sdf.parse(str3);
        Date t4 = sdf.parse(str4);
        Date t5 = sdf.parse(str5);
        //添加
        SortedSet times = new TreeSet();

        times.add(t1);
        times.add(t2);
        times.add(t3);
        times.add(t4);
        times.add(t5);
        //遍历
        for(Iterator it1 = times.iterator();it1.hasNext();)
        {
            Object element = it1.next();
            if(element instanceof Date)
            {
                Date d = (Date)element;
                System.out.println(sdf.format(d));
            }
        }
    }
}
