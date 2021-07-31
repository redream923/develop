package com.xms.day02;

import java.util.*;

/**
 * @author dpc
 * @create 2021-06-15 下午 5:54
 * 创建1个TreeMap<Dog2,String>
 * 1）先按照狗的年龄有大到小进行排序
 * 2）如果年龄相同，按照姓名字典顺序进行排序
 * 提供自然排序和比较其排序2个版本
 * 最后对集合进行遍历（2个版本）
 * <p>
 * tips:
 * 值：表示狗的品种do
 */
class Dog2 /*implements Comparable<Dog2>*/ {

    String name;
    int age;


    public Dog2(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Dog2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog2 dog2 = (Dog2) o;
        return age == dog2.age &&
                Objects.equals(name, dog2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


/*    @Override
    public int compareTo(Dog2 o) {
        int n = this.age - o.age;
        return (n==0)?this.name.compareTo(o.name):n;
    }*/
}

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Dog2, String> tm = new TreeMap<>(new Comparator<Dog2>() {
            @Override
//            由大到小排序，后面减前面的
            public int compare(Dog2 d1, Dog2 d2) {
                int n = d2.age - d1.age;
                return n == 0 ? d1.name.compareTo(d2.name) : n;
            }
        });
        tm.put(new Dog2("dh", 4), "中华田园犬");
        tm.put(new Dog2("xb", 1), "博美");
        tm.put(new Dog2("xh", 2), "黑背");
        tm.put(new Dog2("wc", 3), "哈士奇");
        tm.put(new Dog2("dz", 4), "中华田园犬");

/*        Set<Dog2> keys = tm.keySet();
        for (Dog2 key : keys) {
            String value = tm.get(key);
            System.out.println("键=" + key + ",值=" + value);
        }*/

        Set<Map.Entry<Dog2, String>> entries = tm.entrySet();
        for (Map.Entry<Dog2, String> entries1 : entries) {
            System.out.println("键=" + entries1.getKey() + ",值=" + entries1.getValue());
        }


    }
}
