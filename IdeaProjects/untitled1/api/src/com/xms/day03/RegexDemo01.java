package com.xms.day03;

import java.util.Arrays;

/**
 * @author dpc
 * @create 2021-06-10 上午 10:15
 */
public class RegexDemo01 {
    public static void main(String[] args) {
        demo1();
        demo2();
    }

//    替换
    private static void demo2() {
        String s = "ab1cd345ef27gh";
//        将每一组数字字符串替换成NUM
        String s1 = s.replaceAll("\\d+", "NUM");
        System.out.println(s1);

//        将第一组数字字符替换成NUM
        String s2 = s.replaceFirst("\\d+", "NUM");
        System.out.println(s2);

    }

    private static void demo1() {
        String s = "ab1cd345ef27gh";

//        通过数组字符对字符串进行分割
        String[] strs1 = s.split("\\d+");
        //[ab, cd, ef, gh]
        System.out.println(Arrays.toString(strs1));

//      通过数组字符对字符串进行分割，限制元素个数
        String[] strs2 = s.split("\\d+",3);
//      [ab, cd, ef27gh]
        System.out.println(Arrays.toString(strs2));
    }
}
