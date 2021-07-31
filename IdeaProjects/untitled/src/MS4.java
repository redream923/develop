import java.util.Map;

/**
 * @author dpc
 * @create 2021-07-20 下午 8:08
 * 子线程运行执行 10 次后，主线程再运行 5 次。这样交替执行三遍
 */

class Bussiness {

    private boolean subFlag = true;

    public synchronized void mainMethod() {
        while (subFlag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()
                    + " : main thread running loop count -- " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        subFlag = true;
        notify();
    }

    public synchronized void  subMethod() {
        while (!subFlag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 10; i++) {
            System.err.println(Thread.currentThread().getName()
                    + " : sub thread running loop count -- " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        subFlag = false;
        notify();
    }
}

public class MS4 {

    public static void main(String[] args) {
        Bussiness bussiness = new Bussiness();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    bussiness.subMethod();
                }
            }
        }).start();

        for (int i = 0; i < 3; i++) {
            bussiness.mainMethod();
        }
    }


}
