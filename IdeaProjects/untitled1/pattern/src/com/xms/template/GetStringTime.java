package com.xms.template;

/**
 * @author dpc
 * @create 2021-06-23 上午 11:34
 */
public class GetStringTime extends GetTime {
    @Override
    public void code() {
        String s = new String("hello");
        for (int i = 0; i < 100000; i++) {
            s += "world";
        }


    }
}
