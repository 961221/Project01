package com.collection.foreach;

/**
 * @author shkstart
 * @create 2019-09-03 6:48
 */
public class ForeachTest02 {
    public static void main(String[] args)
    {
        String[] ins = {"运动","健身","旅游"};

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<ins.length; i++)
        {
            if(i==ins.length-1)
            {
                sb.append(ins[i]);
            }else{
                sb.append(ins[i]);
                sb.append(",");
            }

        }
        System.out.println(sb);

        //以上的循环就不适合使用增强for

        for(String sss:ins)
        {
            sb.append(sss);
            sb.append(",");
        }
        //截取“,”
        System.out.println(sb.substring(0,sb.length()-1));

    }
}
