package com.io.decorator;

/**
 * @author shkstart
 * @create 2019-09-04 13:22
 */
// 使用BufferedReader对FileReader中的close方法进行扩展
    //1.装饰者模式中要求：装饰者中含有被装饰者的引用
    //2.装饰者模式要求：装饰者和被装饰者应该是实现同一个类型
public class BufferedReader extends Reader//BufferedReader   装饰者
{
    //关联关系
    //FileReader就是被装饰者
    Reader reader;

    //Constructor

    BufferedReader(Reader reader) //Reader reader = new FileReader()
    {
        this.reader = reader;
    }

    //对FileReader中的close方法进行扩展
    public void close()
    {
        System.out.println("fsdafsa");
        reader.close();
        System.out.println("jogjetiroijfod");
    }

}
