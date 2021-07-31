package com.xms.day01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author dpc
 * @create 2021-06-11 上午 10:16
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
//        demo1();
        demo2();
    }

    //        迭代器
    private static void demo1() {
        Collection c = new ArrayList();
        c.add("hello");
        c.add("java");
        c.add("world");

//        获取集合的迭代器
        Iterator it = c.iterator();

//        遍历集合
        while (it.hasNext()) {//判断是否有下一个元素
            String s = (String) it.next();//获取下一个元素
            System.out.println(s);
        }


    }

//         交集
    private static void demo2() {
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        Collection c2 = new ArrayList();
        c2.add("a");
        c2.add("b");
        c2.add("d");

//        交集:retainAll（）返回c1是否发生改变,如果发成改变，返回true，否者返回false
        boolean b1 = c1.retainAll(c2);
        System.out.println(b1);
        System.out.println(c1);//（交集给了c1）
        System.out.println(c2);
    }
}
