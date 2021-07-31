package com.xms.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author dpc
 * @create 2021-06-10 下午 3:15
 * 计算自己活了多少天
 */
public class Test01 {
    public static void main(String[] args) throws ParseException {
        Date now = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf2.parse("2000-09-23 00:00:00");
        long  second=now.getTime()-parse.getTime();
        long  day=second/1000/60/60/24;
        System.out.println(day);
    }
}
