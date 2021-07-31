package com.xms.day03;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author dpc
 * @create 2021-06-16 上午 10:42
 */
public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("001","张三");
//        ht.put(null,"李四");
//        ht.put("003",null);
//        ht.put(null,null);
        System.out.println(ht);

        HashMap<String, String> htm = new HashMap<>();
        htm.put("001","张三");
        htm.put(null,"李四");
        htm.put("003",null);
        htm.put(null,null);
        System.out.println(htm);
    }
}
