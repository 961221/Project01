package com.io.objectoutputstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author shkstart
 * @create 2019-09-04 16:51
 */
//序列化
public class Test01 {
    public static void main(String[] args)throws Exception
    {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/java学习/Project01/Module01/src/com/io/31.txt"));
        User0 u = new User0("道来");

        oos.writeObject(u);
        oos.flush();
        oos.close();

    }
}
