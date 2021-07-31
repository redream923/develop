package com.xms.newtime;

import java.time.LocalDate;
import java.time.Period;

/**
 * @author dpc
 * @create 2021-06-29 下午 5:31
 * 日期间隔
 */
public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2020,10,11);
        LocalDate ld2 = LocalDate.of(2021,12,12);
//        获取日期间隔
        Period per = Period.between(ld1, ld2);
        System.out.println(per);
        System.out.println(per.getYears());//1
        System.out.println(per.getMonths());//0
        System.out.println(per.getDays());//1

//        设置间隔的年数
        Period period = per.withYears(3);
        System.out.println(period);
    }
}
