package com.xms.day02;

import java.util.Arrays;

/**
 * @author dpc
 * @create 2021-06-09 下午 5:23
 */
public class StringDemo04 {
    public static void main(String[] args) {
        demo01();
        demo02();

    }

    //        替换和比较
    private static void demo02() {
        String s = "hello";
//        1）替换字符：将l替换成L
        String s1 = s.replace('l', 'L');
        System.out.println(s1);//"heLLo"
//        2）替换字符串：将"ll"替换为11
        String s2 = s.replace("ll", "11");
        System.out.println(s2);//"he11o"


        String str1 = "cba";
        String str2 = "cbd";
        String str3 = "cbadb";
//        字符字典比较
//        比较规则：拿字符串中的每个字符，
//          从第一个字符开始，依次进行比较，如果相等，比较下一个字符；
//          如果不相等，返回字符差
//            如果两个字符之间存在一个字符以另一个字符开始的关系，那么这时候返回字符串的长度差
        System.out.println(str1.compareTo(str2));//-3
        System.out.println(str1.compareTo(str3));//-2


    }

    //    转换功能
    private static void demo01() {
        String s = "abcde";
//        1）转成字节数组
        byte[] bytes = s.getBytes();
        System.out.println(Arrays.toString(bytes));

//        2）转成字符数组
        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));

//        3）将其他类型转成String
        String s1 = String.valueOf(1);//int ---> String
        System.out.println(s1);//"1"
        String s2 = String.valueOf(1.23);//doube--->String
        System.out.println(s2);//"1.23"
        String s3 = String.valueOf(chars);//char[]--->String
        System.out.println(s3);
//        String s4=String.valueOf(new Cat());//sObject--->String
//        System.out.println(s4);//对象.toString()
//        4）转大写
        System.out.println("Hello".toUpperCase());//"HELLO"
//        5）转小写
        System.out.println("Hello".toLowerCase());//"hello"

//        6）连接
        System.out.println("hello".concat("world"));//"helloworld"

//        7)去除两边空格
        System.out.println("  adm in   ".trim());//"ad min"

    }
}
