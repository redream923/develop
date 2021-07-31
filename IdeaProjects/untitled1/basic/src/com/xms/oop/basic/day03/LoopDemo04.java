package com.xms.oop.basic.day03;
/**
 * 
 * @author Administrator
 * 死循环
 * 如果没有限制，循环操作会一直不停的执行
 */
public class LoopDemo04 {
	/*
	 * 需求：打印1到10
	 * 
	 */
	public static void main(String[] args) {
		int j=1;
		while(true) {
//			循环结束条件
			if(j==11) {
				break;
			}
			System.out.println(j);
			j++;
		}
		
		
		
		
		
		
		//		for(int i=0;i<10;i--) {
//			System.out.println("hello");
//		}
		
//		for(int i=0;;i++) {
//			System.out.println("java");
//		}
		
//		for(;;) {
//			System.out.println("world");
//		}
//		
//		建议使用while死循环
//		while(true) {
//		}
		
		
	}
}
