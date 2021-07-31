package com.xms.newtime;

import java.time.Duration;
import java.time.Instant;

/**
 * @author dpc
 * @create 2021-06-29 下午 5:19
 * 时间间隔
 */
public class DurationDemo {
    public static void main(String[] args) {
//        创建两个日期
        Instant ins1=Instant.now();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Instant ins2 = Instant.now();
//        获取2个时间戳之间的日期间隔
        Duration dur = Duration.between(ins1, ins2);
        System.out.println(dur.getSeconds());
        System.out.println(dur.getNano());
        System.out.println(dur.toMillis());

/*        LocalDate ld1 = LocalDate.of(2020,10,11);
        LocalDate ld2 = LocalDate.of(2021,10,11);
        Duration dur2 = Duration.between(ld1, ld2);
        System.out.println(dur.toDays());*/

    }
}
