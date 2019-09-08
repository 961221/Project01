package com.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * @author shkstart
 * @create 2019-09-08 10:30
 */
/*
    获取构造方法
 */
public class ReflectTest08 {
    public static void main(String[] args) throws Exception{
        //1.获取类
        Class c = Class.forName("java.util.Date");
        //2.获取所有的构造方法
        Constructor[] cs = c.getDeclaredConstructors();

        /*for(Constructor constructor:cs)
        {
            //获取修饰符
            System.out.println(Modifier.toString(constructor.getModifiers()));

            //获取构造方法名
            System.out.println(c.getSimpleName());

            //构造方法的形式列表
            Class[] parameterTypes = constructor.getParameterTypes();
            for(Class paramterType:parameterTypes)
            {
                System.out.println(paramterType.getSimpleName());
            }
        }*/
        //反编译
        StringBuffer sb = new StringBuffer();

        sb.append(Modifier.toString(c.getModifiers())+ " class "+c.getSimpleName()+"{\n");

        //构造方法
        for(Constructor con:cs){
            sb.append("\t");
            sb.append(Modifier.toString(con.getModifiers())+" ");
            sb.append(c.getSimpleName()+"(");
            //形参、
            Class[] parameterTypes = con.getParameterTypes();
            for(int i = 0; i < parameterTypes.length; i++)
            {
                Class parameterType = parameterTypes[i];
                if(i == parameterTypes.length-1)
                {
                    sb.append(parameterType.getSimpleName());
                }else{
                    sb.append(parameterType.getSimpleName()+" ");
                }
            }
            sb.append("){}\n");
        }

        sb.append("}");
        System.out.println(sb);
    }
}
