package com.xms.oop.basic.day02;
/**
 * 算数运算符
 * @author Administrator
 *
 */
public class OperatorDemo01 {
	/*
	 * 需求：求1个4位数的个数，十位，百位，千位数。
	 */
	public static void main(String[] args) {
		int n=1234;
		int ge=n%10;
		int shi=n/10%10;
		int bai=n/100%10;
		int qian=n/1000%10;
		
		System.out.println(ge);
		System.out.println(shi);
		System.out.println(bai);
		System.out.println(qian);
	}
}
