package com.xms.template;

/**
 * @author dpc
 * @create 2021-06-23 上午 11:27
 * 模板设计模式
 */
public abstract class GetTime {
    public void getTime() {
        long t1 = System.currentTimeMillis();

//        操作
        code();


        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }

    public abstract void code();
}
