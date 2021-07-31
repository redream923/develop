package com.xms.day02;

import java.util.TreeSet;

/**
 * @author dpc
 * @create 2021-06-15 下午 3:57
 * 自然排序
 * 让元素具有比较性
 */
class Dog implements Comparable<Dog> {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int compareTo(Dog d) {
//        排序规则：
//        1）按照年龄有小到大顺序排序
//        2）如果年龄相同，按照姓名的字典顺序进行排序
//        当前对象放在前面，有小到大排序；当前对象放在后面，由大到小排序
        int n = this.age - d.age;
        return n == 0 ? this.name.compareTo(d.name) : n;
    }
}

public class TreeSetDemo02 {
    public static void main(String[] args) {
        TreeSet<Dog> ts = new TreeSet<>();
        ts.add(new Dog("xiaohei", 2));
        ts.add(new Dog("dahuang", 5));
        ts.add(new Dog("wangcai", 3));
        ts.add(new Dog("xiaobai", 1));
        ts.add(new Dog("dazhuang", 4));
//        ts.add(new Dog("xiaohei", 2));

        for (Dog d : ts) {
            System.out.println(d);
        }
    }
}
