package com.xms.newtime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Set;

/**
 * @author dpc
 * @create 2021-06-29 下午 6:12
 */
public class ZoneIdDemo {
    public static void main(String[] args) {
//       获取所有失去
        Set<String> ids = ZoneId.getAvailableZoneIds();
        System.out.println(ids);

//        通过式取名获取ZoneId
        ZoneId zi = ZoneId.of("Hongkong");
        System.out.println(zi);

//        通过ZoneId创建LocalDateTime
        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(now);

    }
}
