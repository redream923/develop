package com.xms;

/**
 * @author dpc
 * @create 2021-06-23 下午 4:46
 */
public class Student {
    private String name;
    int age;
    public char gender;

    private Student() {
    }

    Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("show");
    }


    @MyAnno
    private void show(String s) throws ArithmeticException,NullPointerException {
        System.out.println("hello" + s);
    }

    String getS(int a) {
        return "hello" + a;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}
