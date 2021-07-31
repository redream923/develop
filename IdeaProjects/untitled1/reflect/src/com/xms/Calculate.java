package com.xms;

/**
 * @author dpc
 * @create 2021-06-24 上午 11:32
 */
public class Calculate {
    @Check
    public void add() {
        System.out.println(1 + 2);
    }
    @Check
    public void sub() {
        System.out.println(5 - 3);
    }
    @Check
    public void mul() {
        System.out.println(3 * 3);
    }
    @Check
    public void div() {
        System.out.println(5 / 0);

    }
    @Check
    public void show() {
        String s = null;
        System.out.println(s.charAt(0));
    }
}
