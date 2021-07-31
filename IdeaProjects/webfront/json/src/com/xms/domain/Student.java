package com.xms.domain;

import java.util.Date;

/**
 * @author dpc
 * @create 2021-07-26 上午 11:38
 */
public class Student {
    private String name;
    private int age;
    private char gender;
    private Date birDate;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", birDate=" + birDate +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getBirDate() {
        return birDate;
    }

    public void setBirDate(Date birDate) {
        this.birDate = birDate;
    }

    public Student() {
    }

    public Student(String name, int age, char gender, Date birDate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birDate = birDate;
    }
}
