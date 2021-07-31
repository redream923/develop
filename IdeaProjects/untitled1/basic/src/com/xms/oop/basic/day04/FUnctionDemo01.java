package com.xms.oop.basic.day04;

public class FUnctionDemo01 {
	public static void main(String[] args) {
//		调用无参无返回值方法。
		printHello();
		
//		调用有参无返回值方法。
		int n=5;
//		这里的n称为实际参数，定义参数的具体值
//		当调用方法的时候，实参的值会传递给形参，除此之外，他们之间没有任何关系。
		printWorld(n);
		
//		调用无参有返回值方法。		
		int max=getMax();
		System.out.println(max);
		
//		
		max=getMax(5,8);
		System.out.println(max);
		
	}
	
//	1)无参无返回值
//	需求:打印输出10次"Hello"
	public static void printHello() {
		for(int i=0;i<10;i++) {
			System.out.println("Hello");
		}
	}
	
//	2)有参无返回值
//	需求:打印输出n次"World"	
//	这边的n称为形式参数，只规定数据的类型和个数
	public static void printWorld(int n) {
		for(int i=0;i<n;i++) {
			System.out.println("World");
		}
	}
	
//	3)无参有返回值
//	需求：求3,4之间的最大值
	public static int getMax() {
		return 3>4?3:4;
	}
	
	
//	4)有参有返回值
//	需求：求两个整数之间的最大值
	public static int getMax(int a,int b) {
		return a>b?a:b;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
