package com.xms.day03;

import java.util.Calendar;
import java.util.Date;

/**
 * @author dpc
 * @create 2021-06-10 下午 4:01
 */
public class CalenderDemo {
    public static void main(String[] args) {
//        创建日历
        Calendar c = Calendar.getInstance();
//        获取日历字段
//        年
        System.out.println(c.get(Calendar.YEAR));
//        月（注意：1月份用0表示）
        System.out.println(c.get(Calendar.MONTH)+1);
//        日
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DATE));

//        设置日历字段
//        给指定日历对象设置指定的值
        c.set(Calendar.YEAR,2008);
//        设置年月日
        c.set(2020,11,12);//2020-12-12
        System.out.println(c);

//        获取日历的日期
        Date date = c.getTime();
        System.out.println(date);

//        设置日历的日期
        c.setTime(new Date());
        System.out.println(c);

//        给指定日历对象增加指定的值：2021-06-10
//        1）往后推21天
        c.add(Calendar.DATE,21);
//        2）月份提前两个月
        c.add(Calendar.MONTH,-2);
//        3）年份往后推四年
        c.add(Calendar.YEAR,4);
        System.out.println(c.get(Calendar.YEAR)+"-"
                +(c.get(Calendar.MONTH)+1)+"-"
                +c.get(Calendar.DATE));//2025-5-1
    }
}
