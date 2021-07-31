package com.xms.day01;

import java.util.LinkedList;

/**
 * @author dpc
 * @create 2021-06-11 上午 11:48
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("hello");
        ll.add("java");
//        添加一个元素
        ll.addFirst("first");
//        添加最后一个元素
        ll.addLast("last");

//        获取第一个元素
        System.out.println(ll.getFirst());//first
//        获取最后一个元素
        System.out.println(ll.getLast());//last

//        删除第一个元素
        ll.removeFirst();
//        删除随后一个元素
        ll.removeLast();

        System.out.println(ll);

    }
}
