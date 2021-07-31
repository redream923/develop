package com.xms.oop.basic.Day06;
/**
 * 
 * f(n)=1+2+3....+n;
 * @author Administrator
 *
 */
public class Test07 {
	public static void main(String[] args) {
		System.out.println(f(3));
		System.out.println(f(10));
		
	}
	
	public static int f(int n) {
		int sum=0;
		if(n==1) {//递归方法一定要有结束条件
			return 1;
		}else {
			return f(n-1)+n;
		}
		
	}
}
