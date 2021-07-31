package com.xms.fr;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author dpc
 * @create 2021-06-28 上午 10:32
 * 构造器引用
 * 类名::new
 */
class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Demo04 {
    public static void main(String[] args) {
//        1)调用无参构造
        Supplier<Student> sup = () -> new Student();
        System.out.println(sup.get());

        Supplier<Student> sup2 = Student::new;
        System.out.println(sup.get());

//        2)调用1个参数
        Function<String, Student> fun1 = s -> new Student(s);
        System.out.println(fun1.apply("张三"));

        Function<String, Student> fun2 = Student::new;
        System.out.println(fun1.apply("张三"));

//        调用2个参数构造
        BiFunction<String, Integer, Student> biFun1 = (name, age) -> new Student(name, age);
        System.out.println(biFun1.apply("张无忌", 11));
        BiFunction<String, Integer, Student> biFun2 = Student::new;
        System.out.println(biFun1.apply("周芷若", 10));
    }
}
