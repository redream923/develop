package com.xms.adaptor;

/**
 * @author dpc
 * @create 2021-06-23 上午 11:53
 * 当具体类实现某个接口的时候,需要实现接口中所有的抽象方法.
 * 但是该具体类可能只需要接口中的部分方法,但是具体类还是得重写所有抽象方法
 */
public class Cat implements Inter {
    @Override
    public void eat() {
        System.out.println("吃鱼");
    }

    @Override
    public void add() {}

    @Override
    public void show() {}
}
