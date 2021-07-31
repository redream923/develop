package com.xms.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
Predicate<T>
    boolean test(T t)

    and(Predicate pre):与
    or(Predicate pre):或
    negate(Predicate pre):非


 */
public class PredicateDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Tom","Jerry","Tony","TNT");
        //需求：获取所有"T"开头的元素
        List<String> nl = filter(list, s -> s.startsWith("T"));
        System.out.println(nl);

        //需求：获取所有以"T"开头且第二个字符为'o'的所有元素
        List<String> nl2 = andFun(s -> s.startsWith("T"), s -> s.charAt(1) == 'o', list);
        System.out.println(nl2);

        //需求，判断指定字符串中是否包含h或长度是否>5
        System.out.println(orFun(s->s.contains("h"),s->s.length()>5,"hello"));

        //需求：对指定条件进行否定操作
        System.out.println(negateFun(s->s.length()>5,"hellojava"));//f
    }

    public static List<String> filter(List<String> list, Predicate<String> pre) {
        List<String> nl = new ArrayList<>();
        for (String s : list) {
            if(pre.test(s)){
                nl.add(s);
            }
        }
        return nl;
    }

    public static List<String> andFun(Predicate<String> one, Predicate<String> two,List<String> list){
        List<String> nl = new ArrayList<>();
        for (String s : list) {
            if(one.and(two).test(s)){
                nl.add(s);
            }
        }
        return nl;
    }

    public static boolean orFun(Predicate<String> one, Predicate<String> two,String s){
        return one.or(two).test(s);
    }

    public static boolean negateFun(Predicate<String> one,String s){
        return one.negate().test(s);
    }



}
