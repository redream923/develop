package com.xms.template;

/**
 * @author dpc
 * @create 2021-06-23 上午 11:37
 */
public class GetTimeTest {
    public static void main(String[] args) {
        GetTime gt1 = new GetStringTime();
        gt1.getTime();
        GetTime gt2 = new GetStringBuilderTime();
        gt2.getTime();
    }
}
