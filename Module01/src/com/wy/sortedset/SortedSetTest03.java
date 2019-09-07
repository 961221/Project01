package com.wy.sortedset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author shkstart
 * @create 2019-09-01 22:00
 */
public class SortedSetTest03 {
    public static void main(String[] args)
    {
        //创建一个TreeSet集合的时候提供一个比较器
        SortedSet ss = new TreeSet(new ProductComparator());

        Product1 p1 = new Product1(3.5);
        Product1 p2 = new Product1(3.0);
        Product1 p3 = new Product1(5.9);
        Product1 p4 = new Product1(18.9);
        Product1 p5 = new Product1(6.5);


        //添加元素
        ss.add(p1);
        ss.add(p2);
        ss.add(p3);
        ss.add(p4);
        ss.add(p5);

        //遍历
        Iterator it = ss.iterator();
        while(it.hasNext())
        {
            Object element = it.next();
            System.out.println(element);
        }

    }
}

class Product1 {
    double price;

    Product1(double price)
    {
        this.price = price;
    }

    public String toString()
    {
        return price + "";
    }
}

//单独编写一个比较器
class ProductComparator implements Comparator {
    //需求按照商品价格排序
    public int compare(Object o1,Object o2)
    {
        double price1 = ((Product1)o1).price;
        double price2 = ((Product1)o2).price;
        if(price1 == price2)
            return 0;
        else if(price1>price2)
            return 1;
        else
            return -1;
    }
}