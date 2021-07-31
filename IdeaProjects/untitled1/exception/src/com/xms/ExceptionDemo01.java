package com.xms;

public class ExceptionDemo01 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		/*
		 * ArithmeticExecption算数异常
		 * JVM默认的异常处理方案
		 * 打印异常名，异常信息以及异常代码位置
		 * 
		 */
		System.out.println(a/b);
		
//		一旦发生异常后，该异常代码同一作用于内下面的代码都不会执行
		System.out.println("next");
		
		int[] arr= {1,2,3};
		System.out.println(arr[3]);

	}
	
}
