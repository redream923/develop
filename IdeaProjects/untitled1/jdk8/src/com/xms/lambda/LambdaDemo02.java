package com.xms.lambda;

/**
 * @author dpc
 * @create 2021-06-25 下午 4:22
 * Lambd的使用
 */
interface Calculator {
    int clac(int a, int b);
}

public class LambdaDemo02 {
    public static void main(String[] args) {
        demo1();
        demo2();
    }

    //    2)有参有返回值
//    需求:求2个整数和
    private static void demo2() {
        Calculator c = (a, b) -> a + b;
        System.out.println(c.clac(1, 2));
    }

    //    1)无参无返回值
//    需求:创建线程并启动
    private static void demo1() {
//        方式1
        Runnable target = new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程任务1");
            }
        };
        new Thread(target).start();

        Runnable target2 = () -> System.out.println("多线程任务2");
        new Thread(target2).start();
    }
}
