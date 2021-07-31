package com.xms.day02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author dpc
 * @create 2021-06-15 下午 4:50
 * Map的遍历
 */
public class MapDemo02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
//        添加元素（键值对）
        map.put("zhangsan", "张三");
        map.put("lisi", "李四");
        map.put("wangwu", "王五");
        map.put("zhaoliu", "赵六");
        map.put("tianqi", "田七");
        show1(map);
    }

    //    遍历方式1：先获取所有键的集合，遍历获取键，最后通过建获取值
    private static void show1(Map<String, String> map) {
//        获取所有键的集合
        Set<String> keys = map.keySet();
        for (String key : keys) {
//            通过建获取值
            String value = map.get(key);
            System.out.println("键=" + key + ",值=" + value);
        }
    }


    //    遍历方式2：先获取所有键值对集合，遍历键值对集合，获取键和值
    private static void show2(Map<String, String> map) {
//        先获取所有键值对集合
        Set<Map.Entry<String,String>> entries = map.entrySet();
//        遍历键值对集合
        for(Map.Entry<String,String> entry:entries){
//            获取键和值
            String key=entry.getKey();
            String value =entry.getValue();
            System.out.println("键=" + key + ",值=" + value);
        }

    }

}
