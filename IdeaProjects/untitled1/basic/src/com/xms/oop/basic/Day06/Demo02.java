package com.xms.oop.basic.Day06;
/**
 * 用数组求出斐波那契数列的第n项值
 * @author Administrator
 * 1 1 2 3 5 8 
 */
public class Demo02 {
	public static void main(String[] args) {
		System.out.println(getValue1(20));
		System.out.println(getValue2(20));
		System.out.println(f(20));
	}
	
//	方式1
	public static int getValue1(int n) {
		if(n<1) {
			System.out.println("n值非法");
			return -1;
		}
		
//		求出斐波那契数列的第n项值
		if(n==1||n==2) {
			return 1;
		}else {
			int m1=1;//前第一个值
			int m2=1;//前第二个值
			int sum=0;//前2个值的和
			for(int i=3;i<=n;i++) {
				sum=m1+m2;
				m1=m2;
				m2=sum;
			}
			return sum;
		}
	}
	
	
//	方式2
	public static int getValue2(int n) {
		if(n<1) {
			System.out.println("n值非法");
			return -1;
		}

		if(n==1 || n==2) {
			return 1;
		}else {
			int[] arr=new int[n];
			arr[0]=1;
			arr[1]=1;
			for(int i=2;i<arr.length;i++) {
				arr[i] =arr[i-2]+arr[i-1];
			}
			return arr[arr.length-1];
		}
		
	}
	
//	方式3：方法递归
//	在方法内部调用方法本身的现象
	public static int f(int n) {
		if(n<1) {
			System.out.println("n值非法");
			return -1;
		}
		if(n==1 ||n==2) {
			return 1;
		}else {
			return f(n-2)+f(n-1);
		}
	}
	
	
}
