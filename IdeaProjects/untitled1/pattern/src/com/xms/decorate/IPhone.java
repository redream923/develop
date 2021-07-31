package com.xms.decorate;

/**
 * @author dpc
 * @create 2021-06-23 下午 2:30
 */
public class IPhone implements Phone {

    @Override
    public void function() {
        System.out.println("打电话");
    }
}
