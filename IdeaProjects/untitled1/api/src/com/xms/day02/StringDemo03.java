package com.xms.day02;

/**
 * @author dpc
 * @create 2021-06-09 下午 2:11
 */
public class StringDemo03 {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    //    获取
    private static void demo02() {
        String s = "HelloWorld";
//        获取长度
        System.out.println(s.length());//10
//        获取指定索引处的元素
        System.out.println(s.charAt(0));//'H'
        System.out.println(s.charAt(s.length() - 1));
//        获取第一次索引值
//        1）获取指定字符索引值
        System.out.println(s.indexOf('l'));//2
//        2）获取指定字符从指定位置开始第一次索引值
        System.out.println(s.indexOf('l', 5));//8
//        3）获取指定字符串第一次索引值
        System.out.println(s.indexOf("lo"));//3
//        4）获取指定字符串从指定位置开始第一次出现的索引值
        System.out.println(s.indexOf("o", 4));//4

//        获取最后一次索引值(逆向遍历)
//        获取指定字符最后一次索引值
        System.out.println(s.lastIndexOf('o'));//6
//        5）获取指定字符串从指定位置开始最后一次出现的索引值
        System.out.println(s.lastIndexOf("l", 4));//3

//        截取字符串（注意：返回一个新字符串，原有字符串不可以改变）
//        1）从指定位置截取到末尾
        String s1 = s.substring(5);//World
        System.out.println(s1);
//        2）截取start~end-1范围内的字符串
        String s2 = s.substring(3, 6);//"loW"
        System.out.println(s2);

    }

    private static void demo01() {
        String s = "Hello";
//        2个字符串进行比较
        System.out.println(s.equals("hello"));//f
//        忽略大小写比较
        System.out.println(s.equalsIgnoreCase("hello"));//t
//        是否包含指定字符
        System.out.println(s.contains("ell"));//t
//        是否已制定字符串开始
        System.out.println(s.startsWith("he"));//f
//        指定索引处，是否以指定字符串开始
        System.out.println(s.startsWith("el", 1));//t
//        是否已指定字符串结尾
        System.out.println(s.endsWith("Hello"));//t
        System.out.println(s.endsWith("o"));//t
//        是否为空
        System.out.println(s.isEmpty());//f
    }

}
