package com.wy.map;

import java.util.*;

/**
 * @author shkstart
 * @create 2019-09-03 15:01
 */
public class SortedMapTest02 {
    public static void main(String[] args)
    {
        //Map:key存储Product，value存储重量
        //匿名内部类
        SortedMap products = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                double price1 = ((Product2)o1).price;
                double price2 = ((Product2)o2).price;
                if(price1>price2)
                    return 1;
                else if(price1<price2)
                    return -1;
                else
                    return 0;
            }
        });

        //准备对象
        Product2 p1 = new Product2("西瓜",1.0);
        Product2 p2 = new Product2("橘子",3.0);
        Product2 p3 = new Product2("香蕉",2.5);
        Product2 p4 = new Product2("苹果",5.0);
        Product2 p5 = new Product2("哈密瓜",7.0);

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

class Product2{
    String name;
    double price;
    Product2(String name,double price)
    {
        this.name = name;
        this.price = price;
    }

    public String toString()
    {
        return "Product[name="+name+".price="+price+"]";
    }
}
