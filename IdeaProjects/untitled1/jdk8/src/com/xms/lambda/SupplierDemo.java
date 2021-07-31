package com.xms.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 Supplier<T>
    T get()
 */
public class SupplierDemo {
    public static void main(String[] args) {
        //需求：获取10个0~99的随机数
        List<Integer> list = getList(()->new Random().nextInt(100));
        System.out.println(list);
    }

    private static List<Integer> getList(Supplier<Integer> sup) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(sup.get());
        }
        return list;
    }
}
