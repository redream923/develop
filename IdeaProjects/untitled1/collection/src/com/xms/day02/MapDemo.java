package com.xms.day02;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author dpc
 * @create 2021-06-15 下午 4:35
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
//        添加元素（键值对）
        map.put("zhangsan", "张三");
        map.put("lisi", "李四");
        map.put("wangwu", "王五");
        map.put("zhaoliu", "赵六");
        map.put("tianqi", "田七");
//        键不可以重复，如果键重复，当前值会对原来是值进行覆盖
        map.put("zangsan", "张三2");

//        清空
//        map.clear();
//        通过指定键返回对应的值
//        String name = map.remove("zhangsan");
//        System.out.println(name);

//        判断是否包含指定键
        System.out.println(map.containsKey("zhangsan"));//t
//        判断是否包含指定值
        System.out.println(map.containsValue("zhangsan"));//f
//        判断是否为空
        System.out.println(map.isEmpty());//f

//        通过指定键获取对应值
        System.out.println(map.get("zhangsan"));//张三2
        System.out.println(map.get("zhangsan2"));//null

//        获取集合长度
        System.out.println(map.size());

//        获取所有值的集合
        Collection<String> values = map.values();
        for(String value:values){
            System.out.println(value);
        }

        System.out.println(map);


    }
}
