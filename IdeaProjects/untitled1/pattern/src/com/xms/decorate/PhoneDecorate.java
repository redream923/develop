package com.xms.decorate;

/**
 * @author dpc
 * @create 2021-06-23 下午 2:32
 * 抽象装饰类:对所有的具体装饰类进行功能定义
 *
 */
public abstract class PhoneDecorate implements Phone {
    Phone phone ;

    public PhoneDecorate(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void function() {
        phone.function();
    }


}
