package com.xms.day03;

/**
 * @author dpc
 * @create 2021-06-10 上午 11:24
 */
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        demo1();
        demo2();
    }

//    成员方法
    private static void demo2() {
        StringBuilder sb = new StringBuilder("hello");
//        1）追加（可以追加任意类型）
//        链式编程：调用方法后返回一个对象继续调用方法
        sb.append(1).append('W').append("word");
//        2）在指定索引处插入指定元素(hello后插入java)
        sb.insert(5,"java");

//        3）删除指定索引处的元素(删除1)
        sb.deleteCharAt(9);
//        4）删除指定范围内的元素（删除Wword）
        sb.delete(9, sb.length());

//        5）修改j为J
         sb.setCharAt(5,'J');
//        6）将Java替换成World
         sb.replace(5,9,"World");

//        7）获取指定索引处的元素（获取最后一个元素）
        System.out.println(sb.charAt(sb.length()-1));
//        8）获取容量
        System.out.println(sb.capacity());//21
//        9）获取长度
        System.out.println(sb.length());//10

//        10）翻转功能
        System.out.println(sb.reverse());//dlroWolleh
        sb.reverse();
//        11）截取功能，返回一个新的字符串，原有的StringBuilder不会变
//        从指定位置一直截取到末尾
        String s1=sb.substring(5);
        System.out.println(s1);//"World"

        String s2 = sb.substring(2, 5);
        System.out.println(s2);//"llo"


        System.out.println(sb.toString());

    }

    //    构造
    private static void demo1() {
//        以默认容量(16)创建空的字符串缓冲区对象
        StringBuilder sb1 = new StringBuilder();

//        以指定容量创建空StringBuilder对象
        StringBuilder sb2 = new StringBuilder(20);

//        以指定字符串创建StringBuilder对象
        StringBuilder sb3 = new StringBuilder("abc");

    }

}
