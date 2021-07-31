package com.xms.day02;

/**
 * @author dpc
 * @create 2021-06-21 上午 11:32
 * 线程优先级
 */
class PriorityThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "--" + i);
        }
    }
}

public class PriorityThreadDemo {
    public static void main(String[] args) {
//        2个线程
        Thread t1 = new PriorityThread();
        t1.setName("线程1");
        Thread t2 = new PriorityThread();
        t2.setName("线程2");

//        获取线程优先级(默认为5)
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

//        设置线程优先级(优先级越高,执行的概率越大)
        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
