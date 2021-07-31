package com.xms.day02;

/**
 * @author dpc
 * @create 2021-06-09 下午 5:51
 * 校验QQ号码
 * 1）都是数字
 * 2）长度：5~10
 * 3）第一个数字不能是0
 * 0~48
 * 9~57
 */
public class Test03 {
    public static void main(String[] args) {
/*        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        System.out.println(test(s1));*/
        String qq = "0123456";
        boolean bl = check(qq);
        System.out.println(bl);
    }

    private static boolean check(String qq) {
//        假设qq号没有问题
        boolean flag = true;
//        查找不满足要求的条件
//        1）看长度
        if (qq.length() < 5 || qq.length() > 10) {
            flag = false;
        } else {
//            2）看首字符
            if (qq.charAt(0) == '0') {
                flag = false;
            } else {
                //3）看是否都为数字字符
                for (int i = 0; i < qq.length(); i++) {
                    if (!Character.isDigit(qq.charAt(i))) {
                        flag = false;
                    }
                }
            }
        }
        return flag;
    }

    private static boolean check2(String qq) {
//        假设qq号没有问题
//        查找不满足要求的条件
//        1）看长度
        if (qq.length() < 5 || qq.length() > 10) {
            return false;
        }
//        2）看首字符
        if (qq.charAt(0) == '0') {
                return false;
            }
//        3）看是否都为数字字符
        for (int i = 0; i < qq.length(); i++) {
            if (!Character.isDigit(qq.charAt(i))) {
                return false;
            }
        }

        return true;
    }



    private static boolean test(String s) {
        char[] arr = s.toCharArray();
        if (arr.length < 5 || arr.length > 10) {
            return false;
        }
        if (arr[0] == '0') {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < '0' || arr[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
