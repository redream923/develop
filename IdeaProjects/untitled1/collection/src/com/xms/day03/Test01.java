package com.xms.day03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author dpc
 * @create 2021-06-16 上午 11:20
 * 现有字符串“abdbcaabc”统计每个字符出现的次数，输出“a{3}b{3}c{2}d{1}”
 */
public class Test01 {
    /*public static void main(String[] args) {
//        String s = "abdbcaabc";
//        showCount(s);
//    }
//
//    private static void showCount(String s) {
////        key&#xff1a;&#x5b57;&#x7b26; value:&#x5b57;&#x7b26;&#x51fa;&#x73b0;&#x6b21;&#x6570;
//        HashMap<Character, Integer> hm = new HashMap<>();
////        &#x904d;&#x5386;&#x5b57;&#x7b26;&#x4e32;
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
////            &#x5c06;&#x5b57;&#x7b26;&#x653e;&#x5165;map&#x4e2d;
//            if(!hm.containsKey(ch)){//map&#x4e2d;&#x6ca1;&#x6709;&#x5f53;&#x524d;&#x5b57;&#x7b26;
//                hm.put(ch,1);
//            }else{
//                hm.put(ch,hm.get(ch)+1);
//            }
//        }
////        System.out.println(hm);
////
//        StringBuilder sb = new StringBuilder();
//        Set<Map.Entry<Character,Integer>> entries = hm.entrySet();
//        for(Map.Entry<Character,Integer> entry:entries ){
//            sb.append(entry.getKey()).append("{").append(entry.getValue()).append("}");
//        }
//        String result = sb.toString();
//        System.out.println(result);
//    }
//
////    &#x904d;&#x5386;&#x96c6;&#x5408;*/

    public static void main(String[] args) {
        String s = "abdbcaabccc";
        HashMap<Character, Integer> hs = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!hs.containsKey(c)) {
                hs.put(c, 1);
            } else {
                hs.put(c, hs.get(c) + 1);
            }
        }
        System.out.println(hs);
        StringBuilder sb = new StringBuilder();
        Set<Map.Entry<Character, Integer>> smes = hs.entrySet();
        for (Map.Entry<Character, Integer> sme : smes) {
            sb.append(sme.getKey() + "{" + sme.getValue() + "}");
        }
        System.out.println(sb);
    }
}
