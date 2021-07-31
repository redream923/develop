package com.xms.day02;

import java.util.TreeSet;

/**
 * @author dpc
 * @create 2021-06-15 下午 3:53
 */
public class TreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet<Integer> ts =new TreeSet<>();
        ts.add(3);
        ts.add(1);
        ts.add(5);
        ts.add(2);
        ts.add(4);
        ts.add(3);
        for(Integer i:ts){
            System.out.println(i);
        }

    }
}
