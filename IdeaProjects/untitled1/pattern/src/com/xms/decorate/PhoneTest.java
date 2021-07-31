package com.xms.decorate;

/**
 * @author dpc
 * @create 2021-06-23 下午 2:44
 */
public class PhoneTest {
    public static void main(String[] args) {
//        打电话
        Phone p1 = new IPhone();
        p1.function();
        System.out.println("---------");

//        发短信.打电话
        Phone p2 = new MessageDecorate(new IPhone());
        p2.function();
        System.out.println("----------");

//      打电话,玩游戏
        Phone p3 = new GameDecorate(new IPhone());
        p3.function();
        System.out.println("----------");

//        功能组合 发短信,打电话,玩游戏(套娃)
        Phone p4 = new MessageDecorate(new GameDecorate(new IPhone()));
        p4.function();

    }
}
