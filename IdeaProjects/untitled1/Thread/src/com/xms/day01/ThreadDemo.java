package com.xms.day01;

/**
 * @author dpc
 * @create 2021-06-18 下午 5:31
 */
class ThreadZi extends Thread {

    boolean flag;

    public ThreadZi() {

    }

    public ThreadZi(String name) {
        super(name);
    }
    public void run(){
        if(flag){
            for(int i =1;i<100;i++){
                System.out.println(getName()+"=="+i);
            }
        }else {
            for(int i =100;i<200;i++){
                System.out.println(getName()+"=="+i);
            }
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
//        创建线程对象
        ThreadZi t1 = new ThreadZi();
//        设置线程名
        t1.setName("线程1");
//        通过指定线程名创建线程对象
        ThreadZi t2 = new ThreadZi("线程2");
//        判断线程是否激活
        System.out.println(t1.isAlive());

        t1.start();
        t2.start();
//        判断线程是否激活
        System.out.println(t1.isAlive());

    }

}
