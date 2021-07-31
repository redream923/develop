package com.xms.day02;

/**
 * @author dpc
 * @create 2021-06-09 上午 11:53
 * 1）常量与常量的拼接结果在常量池。且常量池中不会存在相同内容的常量。
 * 2）只要其中一个是变量，结果就在堆中。
 * 3）如果拼接的结果调用intern()方法，返回值就在常量池中
 */
public class StringDemo02 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "java";
        String s3 = "hellojava";
//                            堆  常量池
        System.out.println(s1 + s2 == s3);//f
        System.out.println((s1 + s2).equals(s3));//t

        System.out.println("hello" + "java" == s3);//t
        System.out.println(("hello" + "java").equals(s3));//t


        System.out.println((s1 + s2).intern() == s3);//t
    }

}
