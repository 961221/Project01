package com.enuM;

/**
 * @author shkstart
 * @create 2019-09-11 14:00
 */
public class EnumTest02 {

    //定义一个枚举类型
    enum Result{
        //成功和失败
        //规范要求：大写
        SUCCESS,FAIL   //有限的
    }

    //实现需求
    public static Result divide(int a,int b)
    {
        try{
            int c = a/b;
            return Result.SUCCESS;
        }catch (Exception e){
            return Result.FAIL;
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        Result retValue = divide(a,b);

        if(retValue == Result.SUCCESS)
        {
            System.out.println("成功");
        }else if(retValue == Result.FAIL)
        {
            System.out.println("失败");
        }
    }
}
