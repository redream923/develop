package com.xms;

public class ExceptionDemo04 {
	public static void main(String[] args) {
		int n=getValue();
		int n2=getValue1();//40
		System.out.println(n);//30
	}
	private static int getValue1() {
		int a=10;
		try {
			a=20;
			System.out.println(a/0);
		}catch (Exception e) {
			a=30;
			return a;//return 先于finally执行a的参数值已经确定了
		}finally {
			a=40;
			return a;
		}
	}
	
	
	private static int getValue() {
		int a=10;
		try {
			a=20;
			System.out.println(a/0);
		}catch (Exception e) {
			a=30;
			return a;//return 先于finally执行a的参数值已经确定了
		}finally {
			a=40;
		}
		return 0;
	}
}
