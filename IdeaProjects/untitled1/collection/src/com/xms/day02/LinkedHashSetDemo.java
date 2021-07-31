package com.xms.day02;

import java.util.LinkedHashSet;

/**
 * @author dpc
 * @create 2021-06-15 下午 3:16
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
//        LinkedHashSet元素有序唯一

        LinkedHashSet<String> lh = new LinkedHashSet<>();
        lh.add("hello");
        lh.add("world");
        lh.add("java");
        lh.add("tom");
        lh.add("jerry");
        lh.add("hello");

        for(String s:lh){
            System.out.println(s);
        }
    }
}
