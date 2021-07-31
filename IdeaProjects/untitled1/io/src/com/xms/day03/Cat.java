package com.xms.day03;

import java.io.Serializable;

/**
 * @author dpc
 * @create 2021-06-18 上午 11:18
 */
public class Cat implements Serializable {
    public static final long serialVersionUID = 1L;
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
