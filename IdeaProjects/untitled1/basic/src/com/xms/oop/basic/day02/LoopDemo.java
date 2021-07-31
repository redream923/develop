package com.xms.oop.basic.day02;
/**
 * 循环组成
 * 初始化（定义循环变量初值）
 * 循环条件（定义循环变量范围）
 * 步进语句（控制循环变量的取值）
 * 
 * 循环体（循环操作）
 * @author Administrator
 *
 */
public class LoopDemo {
	public static void main(String[] args) {
		/*
		 * 需求：打印输出十次Helloword;
		 * 1.for(初始化；循环条件；步进语句){
		 * 循环体；
		 * }
		 */
		for(int i=1;i<=10;i++){
			System.out.println("HellowWorld");
		}
		
//		 * 2.while
//		 * 初始化；
//		 * while(循环条件){
//		 * 循环体；
//		 * 步进语句；
//		 * }
		
		int j=1;
		while(j<=10) {
			System.out.println("Hello");
			j++;
		}
		
		
//		3、do....while
//		初始化；==
//		do {
//			循环体；
//			步进语句；
//		}while（循环条件）;
//		k=1,3,5,7,9...19
		int k=1;
		do {
			System.out.println("java");
			k+=2;
		}while(k<20);
		
	}
}
