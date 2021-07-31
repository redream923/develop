package com.xms.day03;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author dpc
 * @create 2021-06-22 上午 11:31
 * 定时器
 *
 */
class MyTimerTask extends TimerTask{
    Timer t ;

    public MyTimerTask(Timer t) {
        this.t = t;
    }

    //    定时任务操作
    @Override
    public void run() {
        System.out.println("du...懒猪起床了...");
//        关闭定时器
//        t.cancel();
    }
}
public class TimerDemo {
    public static void main(String[] args) {
//        创建定时器
        Timer t = new Timer();
//        定时任务
        TimerTask task =new MyTimerTask(t);
//        执行定时任务
//        在指定毫秒后执行一次定时任务
//        t.schedule(task,3000);

//        2)在指定毫秒后执先行一次定时任务,然后每隔指定毫秒执行1次定时任务
        t.schedule(task,3000,2000);
//        3000后关闭定时器
/*
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                t.cancel();
            }
        },3000);
*/

//        关闭定时器
//        t.cancel();
//        关闭任务
//        task.cancel();

    }
}
