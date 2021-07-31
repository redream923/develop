package com.xms.newtime;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author dpc
 * @create 2021-06-29 下午 2:58
 * 旧的时间API存在的问题
 * 需求:10个线程执行解析字符串操作
 */
public class Demo01 {
    @Test
    public void old1() throws Exception {
//        线程池
        ExecutorService pool = Executors.newFixedThreadPool(10);
//        时间格式器
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        线程任务
        Callable<Date> callable = new Callable<Date>() {
            @Override
            public Date call() throws Exception {

                return sdf.parse("2020-12-12");

            }
        };
//        定义存储线程操作返回结果的集合
        List<Future<Date>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(pool.submit(callable));
        }
        for (Future<Date> date : list) {
            System.out.println(date);
        }

        pool.shutdown();
    }


    //    使用旧版时间API解决线程安全问题
    @Test
    public void old2() throws Exception {
//        线程池
        ExecutorService pool = Executors.newFixedThreadPool(10);

//        线程任务
        Callable<Date> callable = new Callable<Date>() {
            @Override
            public Date call() throws Exception {
                return DateFormatThreadLocal.parse("yyyy-MM-dd");
            }
        };
//        定义存储线程操作返回结果的集合
        List<Future<Date>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(pool.submit(callable));
        }
        for (Future<Date> date : list) {
            System.out.println(date);
        }
        pool.shutdown();
    }


    //    使用旧版时间API解决线程安全问题
    @Test
    public void new1() throws Exception {
//        日期格式器
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        ExecutorService pool = Executors.newFixedThreadPool(10);
        Callable<LocalDate> callable =new Callable<LocalDate>() {
            @Override
            public LocalDate call() throws Exception {
                return LocalDate.parse("2020-12-12",formatter) ;
            }
        };
        List<Future<LocalDate>> list =new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(pool.submit(callable));
        }

        for (Future<LocalDate> future : list) {
            System.out.println(future);
        }
        pool.shutdown();
    }
}
