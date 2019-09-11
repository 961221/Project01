package com.oo.Object;

/**
 * @author shkstart
 * @create 2019-09-10 16:36
 */
public class HashCodeTest01 {
    public static void main(String[] args) {
        //hashCode方法返回的是该对象的哈希码值
        //java对象的内存地址经过哈希算法得出的int类型的数值
        HashCodeTest01 hashCodeTest01 = new HashCodeTest01();
        System.out.println(hashCodeTest01.hashCode());//460141958
    }
}
