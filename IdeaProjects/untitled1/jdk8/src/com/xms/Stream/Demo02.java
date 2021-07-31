package com.xms.Stream;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author dpc
 * @create 2021-06-28 上午 11:41
 * Stream流的中间操作
 * 中间操作返回当前流对象
 * 只有当执行终止操作时,中间操作会一次性的全部执行.否则中间操作不执行.(惰性求值)
 */
public class Demo02 {
    List<String> list;

    @Before
    public void init() {
        list = Arrays.asList("Tom", "Jerry", "Tony", "Tomas");
    }

    //    筛选与切片
    @Test
    public void demo1() {
//   filter:获取所有"T"开头的元素
        list.stream().filter(s -> s.startsWith("T")).forEach(System.out::println);
        System.out.println("----------------------");

//   limit:获取前2个以'T'开头的元素
        list.stream().filter(s -> s.startsWith("T")).limit(2).forEach(System.out::println);
        System.out.println("------------------------");

//   limit:获取前以'T'开头的元素(去重)
        list.stream().filter(s -> s.startsWith("T")).distinct().forEach(System.out::println);
        System.out.println("-----------------------");

//        skip:获取所有"T"开头的元素(不要前2个)
        list.stream().filter(s -> s.startsWith("T")).skip(2).forEach(System.out::println);
        System.out.println("----------------------");
    }

//    2)映射
    @Test
    public void demo2(){
//        map:将集合所有元素转大写
        list.stream().map(String::toUpperCase).forEach(System.out::println);

//        map:输出集合中元素字符串的每个字符
        Stream<Stream<Character>> ss = list.stream().map(s -> new Demo02().toStream(s));
        ss.forEach(sm ->sm.forEach(System.out::println));

//        flatMap:输出集合中元素字符串的每个字符
//        <R> Stream<R> map(Function<? super T, ? extends R> mapper);
//         <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
        Stream<Character> stream = list.stream().flatMap(s -> new Demo02().toStream(s));
        stream.forEach(System.out::println);

    }

    public Stream<Character> toStream(String s){
        List<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        return list.stream();
    }
    //    2)排序
    @Test
    public void demo3(){
//        自然排序
        list.stream().sorted().forEach(System.out::println);
        System.out.println("-----------");
//        比较器排序(按照字典由大到小排序)
        list.stream().sorted((s1,s2) ->s2.compareTo(s1)).forEach(System.out::println);


    }
}
