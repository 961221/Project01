package com.oo.Object;

/**
 * @author shkstart
 * @create 2019-09-10 15:51
 */
public class EqualsTest02 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println(o1.equals(o2));

        Star s1 = new Star(10,"胡歌");
        Star s2 = new Star(10,"胡歌");
        Star s3 = new Star(11,"胡歌");

        /*
        没重写之前，都是false，重写之后前面为true，后面为false
         */
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
    }
}

class Star{
    //身份证号
    int id;

    //姓名
    String name;

    //Constructor
    public Star(int id,String name)
    {
        this.id = id;
        this.name = name;
    }

    /*
    Object中的equals方法比较的是内存地址
    在现实的业务逻辑当中，不应该比较内存地址，应该比较内容
    所以Object中的equals方法也要重写
    需求规定：如果身份证号一致，并且名字也一致，则代表同一个人
    s1.equals(s2);
     */
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Star){
            Star s = (Star)obj;
            if(s.id == this.id && s.name.equals(this.name))
            {
                return true;
            }
        }
        return false;
    }
}