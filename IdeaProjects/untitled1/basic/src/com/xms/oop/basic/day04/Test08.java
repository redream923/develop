package com.xms.oop.basic.day04;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 1)求1-n累加和
 * 2)求n!
 * @author Administrator
 *
 */
public class Test08 {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int result=sc.nextInt();
		sum=getSum(result);
		System.out.println(sum);
		
		int last=0;
		last=getJc(result);
		System.out.println(getJc2(result));
	}
	
	public static int getSum(int result) {
		int sum=0;
		for(int i=0;i<=result;i++) {
			sum+=i;
		}
		return sum;
		
	}
	
	public static int getJc(int result) {
		int last=1;
		for(int i=1;i<=result;i++) {
			last *= i;
		}
		return last;
	}
	
	public static BigInteger getJc2(int n) {
		BigInteger jc=new BigInteger("1");
		for(int i=n;i>=1;i--) {
			jc=jc.multiply(new BigInteger(i+""));
		}
		return jc;
	}
}
