package com.xms.template;

/**
 * @author dpc
 * @create 2021-06-23 上午 11:36
 */
public class GetStringBuilderTime extends GetTime {

    @Override
    public void code() {
        StringBuilder s = new StringBuilder();
        for(int i= 0;i<100000;i++){
            s.append("hello");
        }
    }
}
