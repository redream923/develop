package com.xms.day01.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dpc
 * @create 2021-06-11 下午 4:53
 */
public class GenericDemo05 {
    public static void main(String[] args) {
        List<Number> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        List<Object> list3=new ArrayList<>();

        demo1(list1);
        demo1(list2);
        demo1(list3);

        demo2(list1);
        demo2(list2);
//        demo2(list3);

        demo3(list1);
//        demo3(list2);
        demo3(list3);

    }

//    <？>：匹配任意对象
    private static void demo1(List<?> list) { }
//   <? extends Number>：匹配Number或Number的子类
    private static void demo2(List<? extends Number> list) { }
//   <? extends Number>：匹配Number或Number的父类
    private static void demo3(List<? super Number> list) { }

}
