package com.xms.oop.basic.Day06;

import java.util.Arrays;

/**
 * 形参类型问题
 * 1）基本类型:
 * 形参改变，实参不会跟着变
 * 2）引用类型：
 * 形参改变，实参会跟这变（注意：String不符合）
 * @author Administrator
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		System.out.println("change前：a="+a+"b="+b);
		change(a,b);
		System.out.println("change后：a="+a+"b="+b);
		
		int[] arr= {1,2,3};
		System.out.println("change前：arr="+Arrays.toString(arr));
		change(arr);
		System.out.println("change后：arr="+Arrays.toString(arr));
	}

	private static void change(int[] arr) {
		arr[0]+=2;
		
	}

	private static void change(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
		
	}
}
