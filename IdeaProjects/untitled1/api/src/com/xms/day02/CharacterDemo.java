package com.xms.day02;

/**
 * @author dpc
 * @create 2021-06-09 上午 11:19
 */
public class CharacterDemo {
    public static void main(String[] args) {
        System.out.println("aa");
//        判断是否为大写字符
        System.out.println(Character.isUpperCase('a'));//f
//        判断是否为小写字符
        System.out.println(Character.isLowerCase('a'));//t

//        判断是否为数字字符
        System.out.println(Character.isDefined('1'));//t

//        转成大写字符
        System.out.println(Character.toUpperCase('a'));//'A'
//        转成小写字符
        System.out.println(Character.toLowerCase('A'));//'a'


    }
}
