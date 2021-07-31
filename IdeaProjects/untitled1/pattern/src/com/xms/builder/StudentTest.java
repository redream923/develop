package com.xms.builder;

/**
 * @author dpc
 * @create 2021-06-23 上午 11:42
 * 构建器设计模式
 */
class Student {
    private String name;
    private int age;

    public Student() {
    }

//    set返回当前对象(好处:可以使用链式编程)
    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("張三");
        s.setAge(11);
        System.out.println(s);

        Student s2 = new Student().setName("李四").setAge(12);
        System.out.println(s2);
    }
}
