package com.xms.lambda;

/**
 * @author dpc
 * @create 2021-06-25 下午 4:40
 * Lambda的延迟执行
 */
@FunctionalInterface
interface MessageBuilder {
    String append();
}

public class LambdDemo04 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
//        问题:当lev条件不满足的时候,还是要执行s1+s2
        log("1", s1 + s2);
//        第二个需要计算的参数需要通过Lambda提供
//        只有当lev条件满足了,才会执行append()操作,这时候执行Lambda
        log2("1", () -> s1 + s2);
    }

    private static void log(String lev, String s) {
        if ("1".equals(lev)) {
            System.out.println(s);
        }
    }

    private static void log2(String lev, MessageBuilder mb) {
        if ("1".equals(lev)) {
            System.out.println(mb.append());
        }
    }
}
