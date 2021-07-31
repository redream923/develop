package com.xms.newtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * @author dpc
 * @create 2021-06-29 下午 6:01
 */
public class DatetimeFormatterDemo {
    public static void main(String[] args) {
//        获取日期时间格式器
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        格式化
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        String s = formatter.format(now);
        System.out.println(s);

//        解析(不推荐)
        String time ="2021-06-29 18:05:43";
        TemporalAccessor parse = formatter.parse(time);
        System.out.println(parse);

//        解析(推荐)
        LocalDateTime ldt = LocalDateTime.parse("2021-06-29T18:10:37.345");
        System.out.println(ldt);
    }
}
