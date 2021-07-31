package com.xms.fr;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author dpc
 * @create 2021-06-28 上午 9:49
 * 方法引用案例1
 * 对象 :: 方法()
 */
public class Demo01 {
    @Test
//    对象::方法
    public void demo1() {
//        需求:打印输出1个字符串
        Consumer<String> con = s -> System.out.println(s);
        con.accept("hello");

        Consumer<String> con2 = System.out::println;
        con.accept("world");

    }

    @Test
//    类名::静态方法
    public void demo2() {
//    求一个数的绝对值
        Function<Integer, Integer> fun = a -> Math.abs(a);
        System.out.println(fun.apply(-10));

        Function<Integer, Integer> fun2 = Math::abs;
        System.out.println(fun.apply(-20));

//        获取比较器
        Comparator<Integer> com1 = (a, b) -> Integer.compare(a, b);
        Comparator<Integer> com2 = Integer::compareTo;

    }

    @Test
//    类名::实例方法
    public void demo3() {
//    比较两个字符串是否等
        BiPredicate<String, String> biPre = (s1, s2) -> s1.equals(s2);
        System.out.println(biPre.test("hello", "hello"));

        BiPredicate<String, String> biPre2 = String::equals;
        System.out.println(biPre.test("hello", "hello"));

//        获取字符串的哈希码值
        Function<String, Integer> fun1 = s -> s.hashCode();
        System.out.println(fun1.apply("hello"));

        Function<String, Integer> fun2 = String::hashCode;
        System.out.println(fun1.apply("hello"));
    }

}
