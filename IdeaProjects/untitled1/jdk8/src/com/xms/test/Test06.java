package com.xms.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author dpc
 * @create 2021-06-29 下午 2:07
 * 6)使用map和reduce方法获取流中处理元素的总数
 */
public class Test06 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Optional<Integer> count = list.stream().map(i -> 1).reduce((x, y) -> Integer.sum(x, y));
        System.out.println(count.get());
    }
}
