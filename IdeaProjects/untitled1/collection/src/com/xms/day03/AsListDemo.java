package com.xms.day03;

import java.util.Arrays;
import java.util.List;

/**
 * @author dpc
 * @create 2021-06-16 上午 9:53
 */
public class AsListDemo {
    public static void main(String[] args) {
//        将多个同类型参数转成一个list集合
        List<String> list = Arrays.asList("Tom", "Tony", "tomas");
        System.out.println(list);
//        如果使用asList方法获取的集合不可以改变长度
//        UnsupportedOperationException（不支持操作异常）
//        list.add("Jerry");
        System.out.println(list.get(0));
        list.set(0, "haha");
        System.out.println(list);

//        将数组转成List
        String[] arr = {"hello", "java", "wold"};
        Arrays.asList(arr);

//        如果参数为多个数组，转换集合中元素类型为数组类型
        String[] arr1 = {"A"};
        String[] arr2 = {"B", "C"};
        String[] arr3 = {"D", "E", "F"};
        List<String[]> list1 = Arrays.asList(arr1, arr2, arr3);

        for (String[] strs : list1) {
            for (String s : strs) {
                System.out.println(s);
            }
        }

    }
}
