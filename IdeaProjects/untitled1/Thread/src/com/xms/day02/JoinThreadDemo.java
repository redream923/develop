package com.xms.day02;

/**
 * @author dpc
 * @create 2021-06-21 上午 10:04
 * 线程加入
 * 操作1:
 * t1.start();
 * t1.join();
 * t1.start();
 * <p>
 * 结果: 先执行t1的操作,当执行完t1的所有操作后才会执行t2的操作
 * 操作2:
 * t1.start();
 * t1.join(100);
 * t2.start();
 * 结果: 先执行100ms的t1的操作
 * 1) 如果100ms内,t1操作能够全部执行完毕
 * 当t1全部执行完毕后,执行t2操作
 * 2) 如果100ms内,t1操作不能够全部执行完毕
 * 当100ms后,t1和t2一起抢夺cpu执行权限
 * <p>
 * 操作3:
 * t1.join(0) == t1.join();
 */

//需求: 模拟4个人从家到棋牌室打牌
class Player extends Thread {
    long time;//从家到棋牌室的时间

    public Player(String name, long time) {
        super(name);
        this.time = time;
    }

    @Override
    public void run() {
        System.out.println(getName() + "从家出发了...");
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName() + "经过" + time + "时间后到了...");
    }
}

public class JoinThreadDemo {
    public static void main(String[] args) throws InterruptedException {
//        4个玩家
        Player p1 = new Player("张全蛋", 6000);
        Player p2 = new Player("李二狗", 3000);
        Player p3 = new Player("赵小六", 8000);
        Player p4 = new Player("王小二", 5000);

//        启动线程
        p1.start();
        p2.start();
        p3.start();
        p4.start();

//        线程礼让
        p1.join();
        p2.join();
        p3.join();
        p4.join();

        System.out.println("人齐了,开局!");
    }
}
