package com.xms.day02;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author dpc
 * @create 2021-06-15 下午 4:17
 * 比较器排序
 * 让集合具有比较性
 */
public class TreeSetDemo03 {
    public static void main(String[] args) {
//        通过比较器创建TreeSet
        TreeSet<Dog> ts = new TreeSet<>(new Comparator<Dog>() {
//            d1在前面：有小到大；d2在前面：由大到小
            @Override
            public int compare(Dog d1, Dog d2) {
//                年龄有效到大排序
                int n = d1.age - d2.age;
//                年龄相同，按照姓名有大到小排序
                return n==0?d2.name.compareTo(d1.name):n;
            }
        });
        ts.add(new Dog("xiaohei", 2));
        ts.add(new Dog("dahuang", 5));
        ts.add(new Dog("wangcai", 3));
        ts.add(new Dog("xiaobai", 1));
        ts.add(new Dog("dazhuang", 4));
        ts.add(new Dog("xiaohei", 2));

        for (Dog d : ts) {
            System.out.println(d);
        }


    }
}
