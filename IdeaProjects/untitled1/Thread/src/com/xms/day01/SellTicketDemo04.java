package com.xms.day01;

/**
 * @author dpc
 * @create 2021-06-21 上午 11:40
 * 例子：创建个窗口卖票，总票数为100张.使用实现Runnable接口的方式
 * <p>
 * 1.问题：卖票过程中，出现了重票、错票 -->出现了线程的安全问题
 * 2.问题出现的原因：当某个线程操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票。
 * 3.如何解决：当一个线程a在操作ticket的时候，其他线程不能参与进来。直到线程a操作完ticket时，
 * 其他线程才可以开始操作ticket。这种情况即使线程a出现了阻塞，也不能被改变。
 * <p>
 * 解决方案2:同步代方法,(通过继承Thread实现操作)
 * 注意:如果通过集成Thread且采用同步方法解决多线程安全问题是解决不了的
 *
 */
class STWindow04 extends Thread {
    static int tackets = 100;


    //    票号对于三个售票窗口共享

    public STWindow04(String name) {
        super(name);
    }

    //    锁对象
    static public Object obj = new Object();

    @Override
    public void run() {
//        同步代码块(锁对象可以使任意类型的对象)
//        注意: 对于所有的线程对象而言,锁对象一定要是唯一的.(所有线程对象共享同一个锁对象)


        while (true) {
//            获取票号
            int tickNo = getTicketNo();
            if (tickNo <= 0) {
                break;
            }
            System.out.println(getName() + "卖出的第" + tickNo + "张票");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

//    同步方法的锁对象为:this
//    在该案例中,锁对象不唯一,所以还是会出现线程安全问题
    private synchronized int getTicketNo() {
        return tackets--;
    }


}

public class SellTicketDemo04 {
    public static void main(String[] args) {


        Thread thread1 = new STWindow04("售票口1");
        Thread thread2 = new STWindow04("售票口2");
        Thread thread3 = new STWindow04("售票口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
