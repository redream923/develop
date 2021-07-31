package com.xms.day03;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author dpc
 * @create 2021-06-10 下午 4:22
 * 判断指定年份2月份的天数
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar c =Calendar.getInstance();
        c.set(sc.nextInt(),2,1);
        c.add(Calendar.DATE,-1);
        System.out.println(c.get(Calendar.DATE));
    }
}
