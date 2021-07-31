package com.xms.day02.PC;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dpc
 * @create 2021-06-21 下午 4:46
 * 需求:
 * 资源类
 * 生产者:提供资源,从1开始,依次+1
 * 消费者:消费资源,删除生产者生产的资源
 * 解决方案:
 *      使用等待唤醒机制
 *      1)资源满了,生产者不停抢夺CPU
 *          解决:让生产者等待,等待消费者消费资源.当资源不满的时候,才允许生产者继续生产
 *      2)资源空了,消费者不停抢夺CPU
 *          解决:让消费者等待,等待生产者生产资源,当有资源的时候,才允许消费者继续消费
 * 问题:
 *  发生了死锁
 *      1)notifyAll():唤醒等待队列中所有线程
 *      2)wait(time); 如果time时间内没有被唤醒,那么当到time时间后会自动唤醒
 */

//资源类
class MyList3 {
    static int n = 1;//共享资源
    List<Integer> list = new ArrayList<>();
    public static final int MAX_SIZE = 1;//生产上限

    //    生产数据
    public synchronized void addSource()  {
//        判断是否达到生产上线

        while (list.size() == MAX_SIZE){//满了,等待消费者消费
//            当通过notify唤醒了由wait进入到等待队列中的线程后,当该线程重新抢到CPU时间片后,会执行之前wait后面的操作
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + "生产的数据" + n);
        list.add(n);
        System.out.println(Thread.currentThread().getName() + "生产后的集合为" + list);
        n++;

//        唤醒线程
        this.notifyAll();
    }

    //    消费数据
    public synchronized void removeSourse()  {
//        判断是否资源全部消费
        while (list.size() == 0){//没有资源,等待生产者生产
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        有资源消费资源

        Integer value = list.remove(0);
        System.out.println(Thread.currentThread().getName() + "消费的数据为" + value);
        System.out.println(Thread.currentThread().getName() + "消费后的集合为" + list);
//        唤醒线程
        this.notifyAll();
    }

}

//生产者任务类
class ProductRunn3 implements Runnable {
    MyList3 ml;

    public ProductRunn3(MyList3 ml) {
        this.ml = ml;
    }

    @Override
    public void run() {
        while (true) {
//            生产资源
            ml.addSource();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//消费者任务
class CustomerRunn3 implements Runnable {
    MyList3 ml;

    public CustomerRunn3(MyList3 ml) {
        this.ml = ml;
    }

    @Override
    public void run() {
        while (true) {
//            消费数据
            ml.removeSourse();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class PCDemo03 {
    public static void main(String[] args) {
//        资源
        MyList3 ml = new MyList3();
//        任务
        Runnable target1 = new ProductRunn3(ml);
        Runnable target2 = new CustomerRunn3(ml);

//        生产者
        Thread t1 = new Thread(target1, "生产者1号");
        Thread t2 = new Thread(target1, "生产者2号");
        Thread t3 = new Thread(target1, "生产者3号");
//        消费者
        Thread t4 = new Thread(target2, "消费者1号");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
