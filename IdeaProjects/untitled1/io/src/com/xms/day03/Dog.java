package com.xms.day03;

import java.io.Serializable;

/**
 * @author dpc
 * @create 2021-06-18 上午 11:18
 */
public class Dog implements Serializable {
//    UID :当反序列化的时候,会先匹配类的UID和流数据中的UID,如果不匹配,不可以进行序列化
    public static final long serialVersionUID = 1L;
    String name;
    int age;
//    不希望owner序列化
//    transient:临时的,别transient修饰是成员不可以序列化
    transient Student owner;
    Cat partner;
    char gender;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", owner=" + owner +
                ", partner=" + partner +
                '}';
    }
}
