package com.xms.day03;

import java.util.Date;

/**
 * @author dpc
 * @create 2021-06-10 下午 4:44
 */
class Student{
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public Student(String name) {
        this.name = name;

    }

    public Student() {
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("对象被回收了...！");
        super.finalize();
    }
}
public class SystemDemo {
    public static void main(String[] args) {
//        1）获取当前时间毫秒值
        Date date = new Date();
        System.out.println(System.currentTimeMillis());
        System.out.println(date.getTime());
/*        2）退出JVM
        System.exit(0);
*/
        Student s = new Student("zs");
        System.out.println(s);
//        3)调用垃圾回收处理机制
//        当调用该方法后，不会立刻回收垃圾：
//        有垃圾回收处理机制在不确定的时间进行垃圾回收
//        执行gc后，会调用垃圾对象的finalize（），进行垃圾对象的回收
        s=null;
        System.gc();

        System.out.println("next");
    }
}
