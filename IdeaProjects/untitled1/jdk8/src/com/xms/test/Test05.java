package com.xms.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author dpc
 * @create 2021-06-29 上午 11:59
 * 5)给定1个数组列表,返回一个由每个数字的平方构成的列表
 * * 比如[1,2,3,4,5]返回[1,4,9,16,25]
 */
public class Test05 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.stream(arr).map(i -> (int) Math.pow(i, 2)).collect(Collectors.toList());
        Object[] narr = list.toArray();
        System.out.println(Arrays.toString(narr));

    }
}
