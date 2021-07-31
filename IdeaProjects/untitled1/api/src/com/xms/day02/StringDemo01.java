package com.xms.day02;

/**
 * @author dpc
 * @create 2021-06-09 上午 11:25
 */
public class StringDemo01 {
    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
    }

    private static void demo3() {
//        下面2句代码不会同时存在
//        只在常量池中创建了一次对象
        String s1="hello";
//        现在常量池中创建了一次对象，然后又在堆中创建了1次对象。
        String s2=new String("hello");



    }

    //        构造
    private static void demo2() {
//        1)无参构造，创建空字符串
        String s1=new String();
        System.out.println(s1);//""

//        2)通过常量值创建字符串
        String s2=new String("hello");
        System.out.println(s2);//"hello"

//        3)通过字符数组常见字符串
        char[] chs={'a','b','c','d','e'};
        String s3=new String(chs);
        System.out.println(s3);//"abcde"

//        4)通过字符数组中的一部分创建字符串
        String s4=new String(chs,1,3);
        System.out.println(s4);//"bcd"

//        5)通过字节数组常见字符串
        byte[] bys={65,66,67,68,69};
        String s5=new String(bys);
        System.out.println(s5);//"ABCDE"

//        6)通过字节数组中的一部分创建字符串
        String s6=new String(bys,0,3);
        System.out.println(s6);//"ABC"

    }


    private static void demo1() {
//        字符串是常量，一下面为例。“abc”是常量，不可改变。
//        而不是说s,s只是字符串的引用，它不是常量，地址可变。
        String s="abc";
        s="bba";
        System.out.println(s);


    }
}
