package com.xms.day01;

/**
 * @author dpc
 * @create 2021-06-21 下午 4:27
 * 最终版
 * 一般共享资源会存储到资源池中.在资源池中处理共享资源
 */
//取票机
class TicketMachine {
    static int tickets = 100;//票号

    //    取票
    public static synchronized int getTickNO() {
        return tickets--;
    }
}

//        售票窗口
class SellWindow implements Runnable{
    TicketMachine tm ;

    public SellWindow(TicketMachine tm) {
        this.tm = tm;
    }

    @Override
    public void run() {
        while (true){
//            取票
            int tickNo = tm.getTickNO();
            if( tickNo<=0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"卖出的第"+tickNo+"张票");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class SellTicketDemo07 {
    public static void main(String[] args) {
//        取票机（唯一的）
        TicketMachine tm = new TicketMachine();
//        售票窗口任务
        Runnable target = new SellWindow(tm);

//        售票窗口
        Thread t1 = new Thread(target,"窗口1");
        Thread t2 = new Thread(target,"窗口2");
        Thread t3 = new Thread(target,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
