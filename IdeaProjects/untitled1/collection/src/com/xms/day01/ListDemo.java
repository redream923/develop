package com.xms.day01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author dpc
 * @create 2021-06-11 上午 11:20
 */
public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");

//        在指定索引位置添加指定元素
        list.add(1, "javase");
//        删除指定索引处的元素
        list.remove(1);
//        修改指定索引处的元素
        list.set(list.size() - 1, "javase");
//        获取指定索引处的元素
        System.out.println(list.get(0));


        showList1(list);
        showList2(list);

        System.out.println(list);
    }
//            普通for遍历
    private static void showList2(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

//            迭代器遍历
    private static void showList1(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
