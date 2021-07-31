package com.xms.day03;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author dpc
 * @create 2021-06-10 下午 5:36
 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("5");
        BigInteger bi2 = new BigInteger("2");
        System.out.println(bi1.add(bi2));//7
        System.out.println(bi1.subtract(bi2));//3
        System.out.println(bi1.multiply(bi2));//10
        System.out.println(bi1.divide(bi2));//2

        BigInteger[] bis = bi1.divideAndRemainder(bi2);
        System.out.println(Arrays.toString(bis));//[2,1]

//        5!
        int jc = 1;
        for (int i = 5; i >= 1; i--) {
            jc *= i;
        }
        System.out.println(jc);

//        100!
       BigInteger jc_big=new BigInteger("1");
        for (int i = 100; i >= 1; i--) {
            jc_big=jc_big.multiply(BigInteger.valueOf(i));
        }
        System.out.println(jc_big);
    }
}
