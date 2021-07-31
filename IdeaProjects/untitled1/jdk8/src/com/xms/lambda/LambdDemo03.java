package com.xms.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author dpc
 * @create 2021-06-25 下午 4:31
 * 参数,返回值类型为函数式接口类型
 */
public class LambdDemo03 {
    public static void main(String[] args) {
        startThread(() -> System.out.println("线程操作"));

        Integer[] arr = {3, 1, 5, 2, 4};
        Arrays.sort(arr, getComparater());
        System.out.println(Arrays.toString(arr));
    }

    //    返回值类型为函数值接口类型
    private static Comparator<Integer> getComparater() {
        return (a, b) -> b - a;
    }

    //    1)参数类型为函数式接口
    private static void startThread(Runnable target) {
        new Thread(target).start();
    }

}
