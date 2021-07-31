package com.xms.decorate;

/**
 * @author dpc
 * @create 2021-06-23 下午 2:39
 * 具体装饰类:负责装饰具体的某个功能
 */
public class MessageDecorate extends PhoneDecorate {
    public MessageDecorate(Phone phone) {
        super(phone);
    }

    @Override
    public void function() {
        System.out.println("发短信");
        super.function();
    }
}
