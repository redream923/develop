package com.xms.newtime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author dpc
 * @create 2021-06-29 下午 3:23
 * 封装时间格式器
 */
public class DateFormatThreadLocal {
//    使用ThreadLocal来封装时间格式器
//    (好处:同一时间只能有一个线程对象去使用时间格式器)
    private static final ThreadLocal<DateFormat> tl = new ThreadLocal<DateFormat>(){
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd");
        }
    };
//    解析:
    public static Date parse(String time) throws Exception{
        return tl.get().parse(time);
    }
}
