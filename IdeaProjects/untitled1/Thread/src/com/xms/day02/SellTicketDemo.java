package com.xms.day02;

/**
 * @author dpc
 * @create 2021-06-21 上午 11:40
 * 例子：创建个窗口卖票，总票数为100张.使用实现Runnable接口的方式
 *
 *  1.问题：卖票过程中，出现了重票、错票 -->出现了线程的安全问题
 *  2.问题出现的原因：当某个线程操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票。
 *  3.如何解决：当一个线程a在操作ticket的时候，其他线程不能参与进来。直到线程a操作完ticket时，
 * 其他线程才可以开始操作ticket。这种情况即使线程a出现了阻塞，也不能被改变。
 */
class STWindow implements Runnable {
    int tackets = 100;
    int num = 0;


    @Override
    public void run() {
        Thread t = Thread.currentThread();
        while (true) {
            System.out.println(t.getName() + "卖出的第" +(tackets--)+"张票" );
            if (tackets <= 0) {
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class SellTicketDemo {
    public static void main(String[] args) {
        Runnable target = new STWindow();
        Thread thread1 = new Thread(target,"售票口1");
        Thread thread2 = new Thread(target,"售票口2");
        Thread thread3 = new Thread(target,"售票口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
