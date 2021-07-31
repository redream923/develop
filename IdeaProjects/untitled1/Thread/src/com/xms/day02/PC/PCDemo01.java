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
 * 问题:
 *      当生产者比较多且资源生产满了,这时候生产者抢到CPU的概率较大,当抢到CPU后没有执行任何操作,生产者
 */
//资源类
class MyList {
    static int n = 1;//共享资源
    List<Integer> list = new ArrayList<>();
    public static final int MAX_SIZE = 1;//生产上限

    //    生产数据
    public synchronized void addSource() {
//        判断是否达到生产上线
        if(list.size()<MAX_SIZE){
            System.out.println(Thread.currentThread().getName() + "生产的数据" + n);
            list.add(n);
            System.out.println(Thread.currentThread().getName() + "生产后的集合为" + list);
            n++;
        }

    }

    //    消费数据
    public synchronized void removeSourse() {
//        判断是否资源全部消费
        if(list.size()>0){
            Integer value = list.remove(0);
            System.out.println(Thread.currentThread().getName() + "消费的数据为" + value);
            System.out.println(Thread.currentThread().getName() + "消费后的集合为" + list);

        }
    }

}

//生产者任务类
class ProductRunn implements Runnable {
    MyList ml;

    public ProductRunn(MyList ml) {
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
class CustomerRunn implements Runnable {
    MyList ml;

    public CustomerRunn(MyList ml) {
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

public class PCDemo01 {
    public static void main(String[] args) {
//        资源
        MyList ml = new MyList();
//        任务
        Runnable target1 = new ProductRunn(ml);
        Runnable target2 = new CustomerRunn(ml);

//        生产者
        Thread t1 = new Thread(target1, "生产者1号");
        Thread t3 = new Thread(target1, "生产者2号");
        Thread t4 = new Thread(target1, "生产者3号");
//        消费者
        Thread t2 = new Thread(target2, "消费者1号");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
