package com.xms.fr;

/**
 * @author dpc
 * @create 2021-06-28 上午 10:16
 * 方法引用案例2
 *  super :: 实例方法
 */
@FunctionalInterface
interface Greenable {
    void green();
}

class Father {
    public void show() {
        System.out.println("fu show");
    }
}

class Son extends Father {
    @Override
    public void show() {
        System.out.println("Zi show");
    }

    public void fun() {
        method(() -> new Father().show());//fu show
        method(new Father()::show);
        method(() -> super.show());
        method(super::show);
    }

    public void method(Greenable ga) {
        ga.green();
    }
}

public class Demo02 {
    public static void main(String[] args) {
        new Son().fun();
    }
}
