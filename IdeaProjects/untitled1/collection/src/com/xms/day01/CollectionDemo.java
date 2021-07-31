package com.xms.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author dpc
 * @create 2021-06-11 上午 9:57
 */
public class CollectionDemo {
    public static void main(String[] args) {
//        创建collection集合
        Collection c = new ArrayList();
//        1）添加元素（只能是对象，但可以是任意类型的对象）
        c.add("hello");
        c.add(100);

        Collection c2 = new ArrayList();
        c2.add("hello");
        c2.add("java");
//        2）添加集合元素(将c2中所有元素添加到c中)
        c.addAll(c2);//[hello, 100, hello, java]
//        将c2中作为一个元素添加到c中
        //c.add(c2);//[hello, 100,  [hello, java]]

//        3）删除元素(只会删除满足条件的第一个元素，如果没有返回false)
/*
        System.out.println(c.remove(100));
        System.out.println(c.remove("hello"));
        System.out.println(c.remove("world"));
*/
//        4）删除集合元素（删除c2中出现的所有元素）
//        c.removeAll(c2);//[100]

//        5）获取集合长度
        System.out.println(c.size());//4

//        6）判断集合是否为空
        System.out.println(c.isEmpty());//false

//        7）判断是否有指定元素
        System.out.println(c.contains(100));//true

//        8）判断是否有集合元素
        System.out.println(c.containsAll(c2));//true

//        9）集合转数组
        Object[] objects=c.toArray();
        System.out.println(Arrays.toString(objects));


        System.out.println(c);
    }
}
