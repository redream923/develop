package com.xms.day01;

/**
 * @author dpc
 * @create 2021-06-18 下午 4:56
 * 多线程实现方式1
 * 继承Tread
 */

class MyThread extends Thread {
    //    run:定义多线程的执行操作
    public void run() {
        for (int i = 0; i < 100; i++) {
//            getName():获取线程名
            System.out.println(getName() + "-" + i);
        }
    }
}

public class MyThreadDemo01 {
    public static void main(String[] args) {
//        创建2个线程对象
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();

//        执行线程操作
//        注意不能直接调用run(),调用run只是普通的方法调用,它会按照次序先后执行
//        并不会通过抢夺CPU的执行权来执行.
/*        t1.run();
        t2.run();*/

//        启动线程
//        在启动线程后,多个线程会一起抢夺CPU执行权,当某个线程抢到cpu执行权后,会执行run()里面的操作
        t1.start();
        t2.start();
    }
}
