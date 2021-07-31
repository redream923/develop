package com.xms.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author dpc
 * @create 2021-0|6-29 上午 11:37
 *  * 3)现有一数组,其中还有多个"姓名+性别信息"(比如迪丽热巴,女","古力娜扎,女","张三丰,男","赵敏")
 *  * 将符合下面要求的姓名放入到ArrayList中
 *  * 1)必须为女生  2)名字必须4个字
 */
public class Test03 {
    public static void main(String[] args) {
        String[] arr ={"迪丽热巴,女","古力娜扎,女","张三丰,男","赵敏,女"};
        List<String> list = getNames(arr, s -> s.split(",")[1].equals("女"),
                s -> s.split(",")[0].length() == 4);
        System.out.println(list);
    }
    public static List<String> getNames(String[] arr, Predicate<String> one,Predicate<String> two){
        List<String> list =new ArrayList<>();
        for(String s :arr){
//            判断
            if(one.and(two).test(s)){
                list.add(s.split(",")[0]);
            }
        }
        return list;
    }
}
