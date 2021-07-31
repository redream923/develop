package com.xms.day03;

/**
 * @author dpc
 * @create 2021-06-10 下午 2:20
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
    }

    //      StringBuffer连接
    static void demo3() {
        long t1 = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("hello");
        for (int i = 0; i < 100000; i++) {
            sb.append("java");
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }

    //      字符串连接
    static void demo1() {
        long t1 = System.currentTimeMillis();
        String s = "hello";
        for (int i = 0; i < 100000; i++) {
            s += "java";
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }

    //      StringBuilder连接
    static void demo2() {
        long t1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("hello");
        for (int i = 0; i < 100000; i++) {
            sb.append("java");
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }
}
