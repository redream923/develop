package com.xms.day03;

/**
 * @author dpc
 * @create 2021-06-10 上午 10:03
 *  * 校验QQ号码(使用正则表达式)
 *  * 1）都是数字
 *  * 2）长度：5~10
 *  * 3）第一个数字不能是0
 */
public class StringDemo01 {
    public static void main(String[] args) {
        String qq = "123456";
        boolean bl = check(qq);
        System.out.println(bl);
    }

    private static boolean check(String qq) {
        return qq.matches("[1-9]\\d{4,9}");
    }
}
