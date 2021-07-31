package com.xms.newtime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

/**
 * @author dpc
 * @create 2021-06-29 下午 5:38
 * 日期时间校正器
 */
public class TemporalAdjusterDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

//        设置天
        LocalDateTime ldt = now.withDayOfMonth(20);
        System.out.println(ldt);

//        with(TemporalAdjuster asjuster)通过时期时间校正器
//        1)设置当前月的第一天
        LocalDateTime ldt2 = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(ldt2);

//        2)设置下一个周几
        LocalDateTime ldt3 = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(ldt3);

//        3)获取下一个工作日
        LocalDateTime ldt4 = now.with(t -> {
            LocalDateTime ld = (LocalDateTime) t;
//            获取星期
            DayOfWeek dow = ld.getDayOfWeek();
//            判断星期
            if (dow.equals(DayOfWeek.FRIDAY)) {
                return ld.plusDays(3);
            } else if (dow.equals(DayOfWeek.SATURDAY)) {
                return ld.plusDays(2);
            } else {
                return ld.plusDays(1);
            }
        });
        System.out.println(ldt4);
    }
}
