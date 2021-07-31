package com.xms.oop.basic.day02;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in );
		System.out.println("输入第一个整数");
		int first =sc.nextInt();
		System.out.println("请输入第二个整数");
		int second=sc.nextInt();
		int third=sc.nextInt();
		int temp=first>second?first:second;
//		方式1
		int max=temp>third? temp:third;
		System.out.println("最大数是："+max);
//		方式2
		max=first>second?(first>third?first:third):(second>third?second:third);

	}
}
