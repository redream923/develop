package com.xms.adaptor;

/**
 * @author dpc
 * @create 2021-06-23 下午 12:11
 */
public class ToolTest  {
    public static void main(String[] args) {
        Tool.fun(new InterAdaptor(){
            @Override
            public void show() {
                System.out.println("show2");
            }
        });
    }
}
