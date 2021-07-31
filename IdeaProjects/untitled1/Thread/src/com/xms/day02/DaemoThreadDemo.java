package com.xms.day02;

import java.util.Date;

/**
 * @author dpc
 * @create 2021-06-21 上午 10:34
 * 需求: 模拟客人在ktv唱歌,且服务员给客人计时
 */
class KTVRoom extends Thread {
    long time;

    @Override
    public void run() {
        System.out.println("客人开始唱歌了");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("时间到了,客人结账走人");
    }
}
class  Waiter extends Thread{
    @Override
    public void run() {
        while (true){//每隔100ms计时1次
            System.out.println(new Date());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class DaemoThreadDemo {
    public static void main(String[] args) {
        KTVRoom room = new KTVRoom();
        room.time = 3000;
        Waiter w =new Waiter();

//        设置守护线程
//        当所有前台线程结束,JVM退出,程序结束,后台线程结束
        w.setDaemon(true);

        room.start();
        w.start();
    }
}
