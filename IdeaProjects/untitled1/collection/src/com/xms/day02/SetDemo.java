package com.xms.day02;

import java.util.HashSet;
import java.util.Set;

/**
 * @author dpc
 * @create 2021-06-15 下午 2:20
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("tom");
        set.add("jerry");
        set.add("hello");

        for(String s:set){
            System.out.println(s);
        }
    }
}
