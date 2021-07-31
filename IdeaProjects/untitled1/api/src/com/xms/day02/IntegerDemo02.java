package com.xms.day02;

/**
 * @author dpc
 * @create 2021-06-09 上午 10:20
 */
public class IntegerDemo02 {
    public static void main(String[] args) {
//        自动装箱：基本类型可以默认转成包装类类型
        Integer it1 = 10;//Integer it1=Integer.valueOf(10);
        System.out.println(it1);

//        先自动拆箱，后自动装箱
//        自动拆箱：由包装类类型，自动转成对应的基本类型
        Integer it2=it1+20;
//        Integer it2=Integer.valueOf(it1.intValue()+20);
        System.out.println(it2);

    }
}
