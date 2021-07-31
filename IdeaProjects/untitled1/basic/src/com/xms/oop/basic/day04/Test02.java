package com.xms.oop.basic.day04;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 *输入两个正整数m和n，求其最大公约数和最小公倍数
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入m,n");
		int m=sc.nextInt();
		int n=sc.nextInt();
//		求m,n中的最小值
		int min=m<n?m:n;
//		最大公约数(取值范围1~min)
		for(int i=min;i>=1;i--) {
//			判断当前i是否能同时被m和n除尽
			if(m%i==0 && n%i==0) {
				System.out.println("最大公约数为："+i);
				break;
			}
		}
//		求m,n中的最小值
		int max=m>n?m:n;
		for(int j=max;j<=m*n;j++) {
//			判断j是否是m,n的倍数
			if(j%m==0 && j%n==0) {
				System.out.println("最小公倍数为："+j);
				break;
			}
			
		}
		
		
	}
}
