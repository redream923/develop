package com.xms.day03;

import java.util.Date;

/**
 * @author dpc
 * @create 2021-06-10 下午 2:33
 */
public class DateDemo {
    public static void main(String[] args) {
//        当前日期
        Date now = new Date();
        System.out.println(now);

//        以指定毫秒值创建Date
        Date date = new Date(1000);
        System.out.println(date);

//         获取当前日期的毫秒值
        System.out.println(now.getTime());

//        设置当前日期的毫秒值(获取明天这个时候的日期)
        now.setTime(now.getTime()+24*60*60*1000);
        System.out.println(now);
    }

}
