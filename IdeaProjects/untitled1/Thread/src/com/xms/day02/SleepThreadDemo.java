package com.xms.day02;

/**
 * @author dpc
 * @create 2021-06-21 上午 9:38
 */
class SleepThread extends Thread{
    public SleepThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0;i<100;i++){
            System.out.println(getName()+"--"+i);
//            线程休眠
//            注意休眠时间到期,当线程抢到cpu执行权后,会先执行之前线程休眠未执行的方法
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
public class SleepThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new SleepThread("线程1");
        Thread t2 = new SleepThread("线程2");

        t1.start();
        t2.start();
    }
}
