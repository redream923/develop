package com.xms.test;

import java.util.function.Consumer;

/**
 * @author dpc
 * @create 2021-06-29 上午 11:30
 * * 2)现有字符串"迪丽热巴,女","古力娜扎,女","张三丰,男"
 * * 按照姓名:xx,性别xx格式将上面的字符串信息输出.
 */
public class Test02 {
    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女", "古力娜扎,女", "张三丰,男"};
        show(s -> System.out.print("姓名:" + s.split(",")[0]),
                s -> System.out.println(",性别:" + s.split(",")[1]), arr);
    }

    public static void show(Consumer<String> one, Consumer<String> two, String[] arr) {
        for (String s : arr) {
            one.andThen(two).accept(s);
        }
    }
}
