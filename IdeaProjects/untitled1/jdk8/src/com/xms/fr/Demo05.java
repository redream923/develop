package com.xms.fr;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @author dpc
 * @create 2021-06-28 上午 10:44
 * 数组引用
 * 数据类型::new
 */
public class Demo05 {
    public static void main(String[] args) {
//        创建1个长度10的String[]
        Function<Integer, String[]> fun1 = len -> new String[len];
        String[] arr1 = fun1.apply(10);
        System.out.println(Arrays.toString(arr1));

        Function<Integer, String[]> fun2 = String[]::new;
        String[] arr2 = fun2.apply(10);
        System.out.println(Arrays.toString(arr2));
    }
}
