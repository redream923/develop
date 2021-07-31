package com.xms.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author dpc
 * @create 2021-06-28 上午 11:16
 * 实例化Stream方式
 * 1)集合获取
 * 通过Collection中的默认方法stream():获取串行流
 * 通过Collection中的默认方法parallelStream():获取并行流
 * 比如
 * list.stream();
 * map.keySet().stream()
 * map.values().stream()
 * map.entrySet().stream()
 * 2)数组获取
 * Arrays.stream():获取执行数组的流对象
 * 3)通过多个同类型数据获取
 * Stream.of:通过多个同类型参数获取流对象
 * 特殊流:
 * 1)获取无穷流
 * static<T> Stream<T> iterate(final T seed,final UnaryOperator<T> f)
 * 2)
 */


public class Demo01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Tom", "Jerry", "Tomas");
//        方式1
        Stream<String> stream1 = list.stream();
        System.out.println(stream1);

//        方式2
        int[] arr = {1, 2, 3};
        IntStream stream2 = Arrays.stream(arr);
        System.out.println(stream2);

//        方式3
        Stream<String> stream3 = Stream.of("Tom", "Jerry", "Tomas");
        System.out.println(stream3);

//        获取特殊流
//        1)获取无穷有序流
        Stream<Integer> s1 = Stream.iterate(1, x -> x + 2);
        s1.limit(10).forEach(System.out::println);

//        2)获取无穷无序流
        Stream<Integer> s2 =Stream.generate( new Random()::nextInt);
        s2.limit(10).forEach(System.out::println);
    }
}
