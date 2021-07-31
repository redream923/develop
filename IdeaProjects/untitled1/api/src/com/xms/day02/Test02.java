package com.xms.day02;

/**
 * @author dpc
 * @create 2021-06-09 下午 4:19
 * 查找指定大串中指定小串出现的次数
 * 大串："woaixuexiaigongzuoaijiaaidangaishehui"
 * 小串："ai"
 */
public class Test02 {
    public static void main(String[] args) {
        String s1 = "woaixuexiaigongzuoaijiaaidangaishehui";
        String s2 = "ai";
/*        int p = 0;
        int count=0;
        while (p != s1.lastIndexOf(s2)) {
            p = s1.indexOf(s2);
            s1 = s1.substring(p+s2.length());
            if(p== s1.lastIndexOf(s2))
                break;
            count ++;
        }
        System.out.println(count);
*/
        int count = getCount(s1, s2);
        System.out.println(count);
    }

    private static int getCount(String s1, String s2) {
        if (s1.length() < s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        int start = 0;//从start位置查找查找小串在大串中第1次出现索引值
        int index = -1;//第一次出现索引值
        int count = 0;//小串出现的次数
        while ((index = s1.indexOf(s2, start)) != -1) {
            start = index + s2.length();
            count++;
        }

        return count;
    }
}
