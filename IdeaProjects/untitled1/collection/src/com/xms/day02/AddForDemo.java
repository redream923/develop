package com.xms.day02;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dpc
 * @create 2021-06-15 上午 11:08
 * 增强for
 *     简化数组或集合的遍历
 * for(元素类型  元素名：数组名/集合名)
 */

public class AddForDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int i:arr){
//            数组遍历
            System.out.println(i);
        }
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        for(String s:list){
            System.out.println(s);
        }

//        遍历集合：

    }
}
