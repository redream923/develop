package com.xms.oop.basic.day02;
/**
 * 
 * @author Administrator
 *
 */

public class IfDemo02 {
	public static void main(String[] args) {
		/*
		 * 一旦某个条件成立，会立刻执行里面的分支操作，
		 * 分支操作执行完毕，if语句结束。
		 */
		int age=12;
		
		if(age>5 && age<15) {
			System.out.println("aaaa");
		}else if(age > 10 && age<20) {
			System.out.println("bbbb");
		}else {
			System.out.println("cccc");
		}
		
//		如果if-else结构中的执行语句内只一行时，对应的一对{}可以省略的。但是，不建议大家省略。
		if(age>18) 
			System.out.println("可以上网吧");
		else
			System.out.println("不可以上网吧");
		
		
		System.out.println("-----------------------");
		age=19;
		if(age>18)  
			if(age>22) 
			System.out.println("hello");
		else 
			if(age>5) 
				System.out.println("word");
			else
				System.out.println("java");
			
		
	}
}
