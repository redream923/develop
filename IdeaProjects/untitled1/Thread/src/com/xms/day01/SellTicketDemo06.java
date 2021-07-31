package com.xms.day01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author dpc
 * @create 2021-06-21 上午 11:40
 * 例子：创建个窗口卖票，总票数为100张.使用实现Runnable接口的方式
 * <p>
 * 1.问题：卖票过程中，出现了重票、错票 -->出现了线程的安全问题
 * 2.问题出现的原因：当某个线程操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票。
 * 3.如何解决：当一个线程a在操作ticket的时候，其他线程不能参与进来。直到线程a操作完ticket时，
 * 其他线程才可以开始操作ticket。这种情况即使线程a出现了阻塞，也不能被改变。
 *
 * 解决方案1:同步代码块,(通过集成Thread实现操作)
 */
class STWindow06 extends Thread {
    static int tackets = 100;


    //    票号对于三个售票窗口共享

    public STWindow06(String name) {
        super(name);
    }

    //    锁对象
    public static Lock lock=new ReentrantLock();

    @Override
    public void run() {
//        同步代码块(锁对象可以使任意类型的对象)
//        注意: 对于所有的线程对象而言,锁对象一定要是唯一的.(所有线程对象共享同一个锁对象)



        while (true) {
            if (tackets <= 0) {
                break;
            }

            lock.lock();
//                同步的是对共享数据进行写操作的代码
                System.out.println(getName() + "卖出的第" + (tackets--) + "张票");
            lock.unlock();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}

public class SellTicketDemo06 {
    public static void main(String[] args) {


        Thread thread1 = new STWindow02("售票口1");
        Thread thread2 = new STWindow02("售票口2");
        Thread thread3 = new STWindow02("售票口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
