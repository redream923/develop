package com.xms.Factory.fm;

/**
 * @author dpc
 * @create 2021-06-23 上午 10:38
 * 工厂方法
 * 1)抽象工厂类:负责制定具体工厂类的行为
 * 2)具体工厂类:负责创建具体的实例
 * 抽象工厂类
 *
 * 优点:解决了简单工厂的问题
 * 确定:会创建很多很多的具体工厂类,增加了工作量
 */
public abstract class AnimalFactory {
    public abstract Animal crateAnimal();
}
