package com.xms.day03;

import java.util.*;

/**
 * @author dpc
 * @create 2021-06-16 上午 9:52
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("C", "A", "B", "D", "B");
//        1)反转
        Collections.reverse(list);
//        2)随机排序
        Collections.shuffle(list);
//        3)自然排序
        Collections.sort(list);
//        4)比较器排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String s2) {
                return s2.compareTo(o1);
            }
        });
//        5)交换
        Collections.swap(list, 0, list.size() - 1);//第一个和最后一个交换
//        6）二分法查找
        Collections.sort(list);
        int index = Collections.binarySearch(list, "C");
        System.out.println(index);//3
//        7)最大值
        System.out.println(Collections.max(list));//"D"
//        8)通过比较器获取最大值
        String max = Collections.max(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(max);//"A"

//        9)获取指定元素在集合中出现的次数
        System.out.println(Collections.frequency(list,"B"));
//        10）集合复制
        List<String> dest = new ArrayList<>();
//        Collections.copy(dest,list);
        System.out.println(dest);
//        11）替换
        Collections.replaceAll(list,"B","b");



        System.out.println(list);
    }
}
