package com.xms.day01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author dpc
 * @create 2021-06-11 下午 2:19
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        list.add("java");
        list.add("world");
//        demo1(list);
//        demo2(list);
//        demo3(list);//[hello, java, world, javaee]
        demo4(list);  //[hello, java, javaee, world]
        System.out.println(list);

    }

    //    解决方案2：迭代期间，让迭代器添加元素：
    private static void demo4(List list) {
        ListIterator li = list.listIterator();
        while (li.hasNext()){
//            ConcurrentModificationException并发修改异常
            String s=(String)li.next();
            if("java".equals(s)){
                li.add("javaee");
            }
        }
    }

//    解决方案1：集合添加元素后，不再进行迭代操作
    private static void demo3(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()){
//            ConcurrentModificationException并发修改异常
            String s=(String)it.next();
            if("java".equals(s)){
                list.add("javaee");
                break;
            }
        }
    }

    //    判断集合中是否存在”java“，如果存在就在集合中添加javaee，不允许使用contains方法
    private static void demo2(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()){
//            ConcurrentModificationException并发修改异常
            String s=(String)it.next();
            if("java".equals(s)){
                list.add("javaee");

            }
        }
    }

    private static void demo1(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()){
            it.next();
            it.remove();//删除当前迭代器通过next方法获取的元素
        }
        System.out.println(list);
    }
}
