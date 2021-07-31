package com.xms.day02;

/**
 * @author dpc
 * @create 2021-06-21 上午 11:17
 * 中断线程
 */
class interruptThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i == 10) {
//                this.stop();//强制终止当前线程操作,现已过时
                interrupt();
            }
            System.out.println(getName() + "--" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("线程被中断了");
                break;
            }
        }
    }
}

public class InterruptThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new interruptThread();
        t1.start();
    }


}
