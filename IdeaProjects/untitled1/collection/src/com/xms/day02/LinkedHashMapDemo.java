package com.xms.day02;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @author dpc
 * @create 2021-06-15 下午 5:48
 * LinkedHashMap
 * 键有序
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("zs", 90);
        lhm.put("ls", 70);
        lhm.put("ww", 50);
        lhm.put("zl", 80);
        lhm.put("tq", 60);

        Set<String> keys = lhm.keySet();
        for (String key : keys) {
            System.out.println("name=" + key + ",score=" + lhm.get(key));
        }
    }
}
