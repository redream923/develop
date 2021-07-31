package com.xms.day03;

import java.io.Serializable;

/**
 * @author dpc
 * @create 2021-06-18 上午 11:18
 */
public class Student implements Serializable {
    public static final long serialVersionUID = 1L;
    String name;

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
