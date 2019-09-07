package com.wy.map;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author shkstart
 * @create 2019-09-02 21:27
 */
/*
    SortedMap中的key的特点：无序不可重复，但是存进去的元素可以按照大小自动排序
    如果想自动排序：key部分的元素需要：1.实现Comparable接口，2.单独写一个比较器
 */
public class SortedMapTest01 {
    public static void main(String[] args)
    {
        //Map,key存储Product，value存储重量
        SortedMap products = new TreeMap();

        //准备对象
        Product1 p1 = new Product1("西瓜",1.0);
        Product1 p2 = new Product1("橘子",3.0);
        Product1 p3 = new Product1("香蕉",2.5);
        Product1 p4 = new Product1("苹果",5.0);
        Product1 p5 = new Product1("哈密瓜",7.0);

        //添加对象
        products.put(p1,8.0);//自动装箱
        products.put(p2,1.0);
        products.put(p3,15.0);
        products.put(p4,7.2);
        products.put(p5,6.9);

        //遍历
        Set key = products.keySet();
        for(Iterator it = key.iterator();it.hasNext();)
        {
            Object k = it.next();
            Object v = products.get(k);
            System.out.println(k+"---->"+v+"kg");
        }


    }
}

//实现Comparable接口
class Product1 implements Comparable{
    String name;
    double price;

    Product1(String name,double price)
    {
        this.name = name;
        this.price = price;
    }

    public String toString()
    {
        return "Product[name="+name+".price="+price+"]";
    }

    //实现compareTo方法
    //需求：按照商品的价格排序
    public int compareTo(Object o)
    {
        double price1 = this.price;
        double price2 = ((Product1)o).price;
        if(price1<price2)
            return -1;
        else if(price1>price2)
            return 1;
        else
            return 0;
    }

}