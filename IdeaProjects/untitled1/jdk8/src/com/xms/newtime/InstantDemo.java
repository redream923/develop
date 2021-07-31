package com.xms.newtime;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * @author dpc
 * @create 2021-06-29 下午 5:08
 */
public class InstantDemo {
    public static void main(String[] args) {
//        获取当前时间戳
        Instant now = Instant.now();
        System.out.println(now);

//       通过指定毫秒值创建时间戳
        Instant ins = Instant.ofEpochMilli(1000);
        System.out.println(ins);

//        获取时间戳毫秒值
        System.out.println(ins.toEpochMilli());

//        通过时区偏移量获取FooSetDateTime
        OffsetDateTime odt = ins.atOffset(ZoneOffset.ofHours(8));
        System.out.println(odt);
    }
}
