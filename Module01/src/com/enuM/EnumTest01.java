package com.enuM;

/**
 * @author shkstart
 * @create 2019-09-11 13:53
 */
public class EnumTest01 {
    /*
    需求：定义一个方法，该方法的作用是计算两个int类型的商
    如果计算成功该方法返回1，否则返回0；

    程序执行成功，但该程序存在风险，分析:存在什么风险？

    程序中的问题能在编译阶段解决的，绝对不会放到运行阶段，所以可以用“枚举类型”
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int retValue = divide(a,b);

        if(retValue == 1)
        {
            System.out.println("成功");
        }else if(retValue == 0)
        {
            System.out.println("失败");
        }
    }

    //实际需求
    public static int divide(int a,int b)
    {
        try{
            int c = a/b;
            return 1;
        }catch (Exception e){
            return 0;
        }
    }
}
