package com.xms.day01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author dpc
 * @create 2021-06-11 下午 4:40
 * 对于集合而言泛型的好处
 */
public class GenecricList {
    public static void main(String[] args) {
//        3）优化程序设计，解决黄色警告
        List<String> list = new ArrayList();
        list.add("hello");
        list.add("java");
        list.add("world");
//        list.add(100);1)将运行期间的问题提前到了编译期间

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
//            2)避免了向下转型
            String s = it.next();
            System.out.println(s);
        }
    }
}
