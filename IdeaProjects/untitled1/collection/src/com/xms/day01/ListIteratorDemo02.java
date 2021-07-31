package com.xms.day01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author dpc
 * @create 2021-06-11 下午 2:50
 */
public class ListIteratorDemo02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("java");
        list.add("world");
//        demo1(list);
        demo2(list);

    }

    //    逆向遍历（必须要正向遍历，随后才能逆向遍历）
    private static void demo2(List list) {
        ListIterator li = list.listIterator();
        while (li.hasNext()){
            li.next();
        }

        while (li.hasPrevious()){
            String s = (String) li.previous();
            System.out.println(s);
        }
    }

    //    正向遍历
    private static void demo1(List list) {
        ListIterator li = list.listIterator();
        while (li.hasNext()) {
            String s = (String) li.next();
            System.out.println(s);
        }
    }
}
