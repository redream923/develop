package com.xms.proxy;

/**
 * @author dpc
 * @create 2021-06-23 下午 2:58
 * 静态代理
 * 被代理类(真实类)
 * 代理类:代理真实类的功能
 */
interface Inter{
    void func();
}
class Starter implements Inter {
    public void func() {
        System.out.println("明星唱歌");
    }
}

class Broker implements Inter {
    Starter starter;

    public Broker(Starter starter) {
        this.starter = starter;
    }

    //    被代理人代理真实类的功能,并可以对真实类功能进行扩展
    public void func() {
        System.out.println("签合同");
        starter.func();
        System.out.println("收钱");
    }

}

public class ProxyDemo01 {
    public static void main(String[] args) {
        Starter starter = new Starter();
        Broker broker = new Broker(starter);
        broker.func();
    }
}
