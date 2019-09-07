package com.io.objectinputstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author shkstart
 * @create 2019-09-04 16:54
 */
//反序列化
public class Test02 {
    public static void main(String[] args) throws Exception
    {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/java学习/Project01/Module01/src/com/io/31.txt"));
        System.out.println(ois.readObject());
        ois.close();
    }
}

//local class incompatible:
// stream classdesc serialVersionUID = 7254626448010929022,
// local class serialVersionUID = -5238492003609970903