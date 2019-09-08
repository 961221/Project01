package com.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author shkstart
 * @create 2019-09-08 9:29
 */
/*
    java.lang.reflect.Method;
 */
public class ReflectTest06 {
    public static void main(String[] args) throws Exception{
        //获取类
        Class c = Class.forName("java.util.Date");

        //获取所有的方法
        Method[] ms = c.getDeclaredMethods();

        /*
        for(Method m:ms)
        {
            //修饰符
            System.out.println(Modifier.toString(m.getModifiers()));

            //方法的返回值类型
            Class returnType = m.getReturnType();
            System.out.println(returnType.getSimpleName());

            //方法名
            System.out.println(m.getName());

            //方法的形式参数
            Class[] paramterTypes = m.getParameterTypes();
            for (Class paramterType:paramterTypes)
            {
                System.out.println(paramterType.getSimpleName());
            }
        }*/

        //反编译
        StringBuffer sb = new StringBuffer();
        sb.append(Modifier.toString(c.getModifiers())+" class ");
        sb.append(c.getSimpleName()+"{\n");
        for (Method m:ms)
        {
            sb.append("\t");
            sb.append(Modifier.toString(m.getModifiers())+" ");
            sb.append(m.getReturnType().getSimpleName()+" ");
            sb.append(m.getName()+"(");
            //形参
            Class [] paramterTypes = m.getParameterTypes();
            for(int i =0; i<paramterTypes.length; i++)
            {
                Class paramterType = paramterTypes[i];
                if(i==paramterTypes.length-1)
                {
                    sb.append(paramterType.getSimpleName());
                }else{
                    sb.append(paramterType.getSimpleName()+",");
                }

            }
            sb.append("){}\n");
        }
        sb.append("}");
        System.out.println(sb);
    }
}
