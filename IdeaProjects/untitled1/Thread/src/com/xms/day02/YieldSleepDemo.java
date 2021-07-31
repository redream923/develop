package com.xms.day02;

/**
 * @author dpc
 * @create 2021-06-21 上午 9:57
 */
class YieldThread extends Thread {
    public YieldThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "--" + i);
//            线程礼让
//            释放当前cpu的执行权,回到Runnable状态,继续参与下一次CPU的抢夺
//            目的:为了使得线程操作能够更加和谐
            Thread.yield();
        }
    }
}

public class YieldSleepDemo {
    public static void main(String[] args) {
        Thread t1 = new YieldThread("线程1");
        Thread t2 = new YieldThread("线程2");

        t1.start();
        t2.start();

    }
}
