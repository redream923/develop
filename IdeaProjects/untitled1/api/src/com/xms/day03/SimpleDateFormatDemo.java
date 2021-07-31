package com.xms.day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author dpc
 * @create 2021-06-10 下午 3:04
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date now = new Date();

//        创建日期格式器（默认模式）
        SimpleDateFormat sdf = new SimpleDateFormat();
//        格式化
        String s1=sdf.format(now);//21-6-10 下午3:06
        System.out.println(s1);

//        建日期格式器（默认模式）
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s2 = sdf2.format(now);
        System.out.println(s2);// 2021-06-10 15:09:04

        String time="2012-12-12 12:12:12";
//        解析（字符串模式必须和格式器模式一致，不然不可以解析）
        Date date  = sdf2.parse(time);
        System.out.println(date);

    }
}
