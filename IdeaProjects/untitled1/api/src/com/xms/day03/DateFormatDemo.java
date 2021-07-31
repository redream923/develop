package com.xms.day03;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author dpc
 * @create 2021-06-10 下午 2:49
 */
public class DateFormatDemo {
    public static void main(String[] args) {
//        创建日期格式器
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, Locale.CHINA);

//        创建日期
        Date date = new Date();

//         格式化
        String format = df.format(date);
        System.out.println(format);
    }
}
