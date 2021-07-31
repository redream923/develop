package com.xms.day01;

/**
 * @author dpc
 * @create 2021-06-18 下午 5:18
 * 多线程事项方式2
 * 实现Runnable接口
 */
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
//            获取当前的线程对象
            Thread thread = Thread.currentThread();
            System.out.println(thread.getName() + "-" + i);
        }
    }
}

public class MyThread02 {
    public static void main(String[] args) {
//        创建线程任务
        Runnable target = new MyRunnable();
//        创建2个线程
        Thread t1 = new Thread(target,"线程1");
        Thread t2 = new Thread(target,"线程2");
//        启动线程
        t1.start();
        t2.start();

    }
}
