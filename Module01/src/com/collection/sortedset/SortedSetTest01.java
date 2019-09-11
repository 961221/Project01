package com.collection.sortedset;

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
        ss.add(4898);
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
        strs.add("djkas");
        strs.add("tieo");
        strs.add("qeroiw");
        strs.add("lkkof");
        //遍历
        Iterator ite = strs.iterator();
        while(ite.hasNext())
        {
            Object o = ite.next();
            System.out.println(o);
        }

        //日期
        String st1 = "2019-08-01";
        String st2 = "2009-08-01";
        String st3 = "2038-08-01";
        String st4 = "2045-08-01";
        String st5 = "2090-08-01";
        String st6 = "2100-08-01";

        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");

        Date t1 = sdf.parse(st1);
        Date t2 = sdf.parse(st2);
        Date t3 = sdf.parse(st3);
        Date t4 = sdf.parse(st4);
        Date t5 = sdf.parse(st5);
        Date t6 = sdf.parse(st6);

        //添加
        SortedSet timers = new TreeSet();
        timers.add(t1);
        timers.add(t2);
        timers.add(t3);
        timers.add(t4);
        timers.add(t5);
        timers.add(t6);


        //遍历
        for(Iterator i = timers.iterator();i.hasNext();)
        {
            Object element = i.next();
            if(element instanceof Date)
            {
                Date d = (Date)element;
                System.out.println(sdf.format(d));
            }
        }

    }
}
