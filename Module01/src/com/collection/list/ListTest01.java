package com.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author shkstart
 * @create 2019-08-31 12:59
 */

/*
    List���ϴ洢Ԫ���ص�
        1.����List�����д洢���±꣩�����ȥ��������˳��ȡ��������������˳��
        2.���ظ�
 */
public class ListTest01 {
    public static void main(String[] args)
    {
        // ����һ��List����
       List l = new ArrayList();

        //���
      l.add(10);
      l.add(12);
      l.add(15);
      l.add(100);

        //����
        for(Iterator it = l.iterator();it.hasNext();)
        {
            Object o = it.next();
            System.out.println(o);
        }

    }
}
