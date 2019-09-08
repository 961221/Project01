package com.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author shkstart
 * @create 2019-09-07 23:19
 */
public class ReflectTest04 {
    public static void main(String[] args) throws Exception{
        //1.获取整个类
        Class c = Class.forName("java.lang.Integer");

        //获取属性Filed
        Field[] fs = c.getDeclaredFields();
        /*
        //获取所有public修饰的属性
        Field[] fs = c.getFields();
        System.out.println(fs.length);
        System.out.println(fs[0].getName());
         */
        //获取所有的属性？
       /* Field[] fs = c.getDeclaredFields();
        for(Field field:fs)
        {
            int i = field.getModifiers();
            //System.out.println(i);
            String str = Modifier.toString(i);
            System.out.println(str);
            Class type = field.getType();
            //获取属性类的名字
            //System.out.println(type.getName());
            System.out.println(type.getSimpleName());

            System.out.println(field.getName());
           }
        */
       //获取整个类的信息
        StringBuffer sb = new StringBuffer();
        sb.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName()+"{\n");
        for(Field field:fs)
        {
            sb.append("\t");
            sb.append(Modifier.toString(field.getModifiers())+" ");
            sb.append(field.getType().getSimpleName()+" ");
            sb.append(field.getName()+";\n");
        }
        sb.append("}");
        System.out.println(sb);
    }
}
