package com.xms.day03;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

/**
 * @author dpc
 * @create 2021-06-10 下午 5:44
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        double d1 = 3;
        double d2 = 2.9;
        System.out.println(d1 - d2);//0.10000000000000009

//        BigDecimal可以解决浮点型运算精度损失问题
        BigDecimal bd1 = new BigDecimal("3");
        BigDecimal bd2 = new BigDecimal("2.9");
        System.out.println(bd1.add(bd2));//5.9
        System.out.println(bd1.subtract(bd2));//0.1
        System.out.println(bd1.multiply(bd2));//8.7
//        这里的除法不是整除，结果为一个无限小数，结果无法表示，所以报错
//        System.out.println(bd1.divide(bd2));

//        如果除不尽，指定保留的位数和舍入模式
//        ROUND_HALF_UP:四舍五入
        System.out.println(bd1.divide(bd2,6,BigDecimal.ROUND_HALF_UP));//1.034483
//        HALF_UP:四舍五入
        System.out.println(bd1.divide(bd2,4, RoundingMode.HALF_UP));//1.0345

//        获取商和余数
        BigDecimal[] bds = bd1.divideAndRemainder(bd2);
        System.out.println(Arrays.toString(bds));
    }
}
