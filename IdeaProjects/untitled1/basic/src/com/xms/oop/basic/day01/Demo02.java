package com.xms.oop.basic.day01;

public class Demo02 {
/**
 * 变量
 */
	public static void main(String[] args) {
		int a;
//		变量只有声明且初始化之后才可以使用。
//		System.out.println(a);
//		变量初始化
		a=1;
		System.out.println(a);//1
//		变量的重新设值
		a=2;
		System.out.println(a);//2
		{
//		变量的声明且初始化
			int age = 18;
			System.out.println(age);
		}
		//变量只能在所在的作用域有效，超出作用域会自动销毁
		//作用域：变量所在的{}内。
//		System.out.println(age);
		int b = 1;
//		在同一作用域内，便令不可以多次声明。
//		int b = 2;
		
	}
	
}
