package com.xms.day02;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author dpc
 * @create 2021-06-15 下午 2:23
 */
class Cat {
    String name;
    int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Cat> hs=new HashSet<>();
//          add方法依赖于hasCode和equals方法（保证元素是唯一性）
        hs.add(new Cat("xh",1));
        hs.add(new Cat("xb",1));
        hs.add(new Cat("hh",2));
        hs.add(new Cat("db",3));
        hs.add(new Cat("xh",1));
        for (Cat c:hs){
            System.out.println(c);
        }
    }
}
