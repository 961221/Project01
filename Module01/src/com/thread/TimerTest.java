package com.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author shkstart
 * @create 2019-09-06 17:27
 */
/*
    分两步：
        1.创建定时器
        2.指定定时任务
 */
public class TimerTest {
    public static void main(String[] args)throws Exception
    {
        //1.创建定时器
        Timer t = new Timer();

        //2.指定定时任务
        t.schedule(
                new LogTimerTask(),
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2019-09-06 17:35:00 000"),
                3*1000);
    }

}

//指定任务
class LogTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
    }
}