package com.xms.fr;

/**
 * @author dpc
 * @create 2021-06-28 上午 10:26
 * * 方法引用案例3
 * *  this :: 实例方法
 */
interface Richable {
    void buy();

}

class Husband {
    public void buyHouse() {
        System.out.println("买套房子");
    }

    public void marry(Richable richable) {
        richable.buy();
    }

    public void happy() {
        marry(() -> this.buyHouse());
        marry(this::buyHouse);
    }
}

public class Demo03 {
    public static void main(String[] args) {
        new Husband().happy();
    }
}
