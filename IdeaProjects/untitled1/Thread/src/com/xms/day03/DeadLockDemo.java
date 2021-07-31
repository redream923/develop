package com.xms.day03;

/**
 * @author dpc
 * @create 2021-06-22 上午 9:39
 * 多个线程抢夺共享资源的过程中发生的相互等待现象
 */
class MyLock {
    public static final Object objA = new Object();
    public static final Object objB = new Object();

}

class myLockThread extends Thread {
    boolean flag;

    public myLockThread(boolean flage) {
        this.flag = flage;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (MyLock.objA) {
                System.out.println(getName() + "---lick is objA");
                synchronized (MyLock.objB) {
                    System.out.println(getName() + "---lick is objB");
                }
            }
        } else {
            synchronized (MyLock.objB) {
                System.out.println(getName() + "---lick is objB");
                synchronized (MyLock.objA) {
                    System.out.println(getName() + "---lick is objA");
                }
            }

        }
    }
}

public class DeadLockDemo {
    public static void main(String[] args) {
        Thread t1 = new myLockThread(true);
        Thread t2 = new myLockThread(false);
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
