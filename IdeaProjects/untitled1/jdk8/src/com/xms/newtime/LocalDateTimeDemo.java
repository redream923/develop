package com.xms.newtime;

import java.time.LocalDateTime;

/**
 * @author dpc
 * @create 2021-06-29 下午 4:55
 */
public class LocalDateTimeDemo {
    public static void main(String[] args) {
//        获取当前的日期时间
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

//        通过指定的日期时间LocalDateTime
        LocalDateTime ldt2 = LocalDateTime.of(2021, 6, 29, 16, 55, 10);
        System.out.println(ldt2);

//        获取年月日时分秒
        System.out.println(ldt.getYear());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getMonthValue());
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt.getHour());
        System.out.println(ldt.getMinute());
        System.out.println(ldt.getSecond());

//        增加指定年份(也可以增加其他的日期或时间)
        LocalDateTime ldt3 = ldt.plusYears(2);
        System.out.println(ldt3);

//        减去指定的月份(也可以减去其他的日期或时间)
        LocalDateTime ldt4 = ldt3.minusMonths(3);
        System.out.println(ldt4);
    }
}
