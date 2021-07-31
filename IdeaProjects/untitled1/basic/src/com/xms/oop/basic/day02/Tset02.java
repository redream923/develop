package com.xms.oop.basic.day02;

import java.util.Scanner;

public class Tset02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in );
		System.out.println("请输入第一个整数");
		int first =sc.nextInt();
		System.out.println("请输入第二个整数");
		int second=sc.nextInt();
		System.out.println("请输入第三个整数");
		int third=sc.nextInt();
		
		if(first<=second) {
			if(second<=third)
				System.out.println("最大数是："+third);
			else
				System.out.println("最大数是："+second);

		}
		else {
			
	
			if(first<=third)
				System.out.println("最大数是："+third);
			else
				System.out.println("最大数是："+first);
		}	
	}
}
