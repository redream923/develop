package com.xms.oop.basic.day04;
/**
 * 
 * @author Administrator
 * 数组内存结构图
 */
public class ArrayDemo03 {
	public static void main(String[] args) {
		int[] arr1= {1,2,3};
		int[] arr2= {4,5};
		int[] arr3= arr1;//arr1和arr3引用同一个数组
		System.out.println(arr1[0]);//1
		System.out.println(arr1[1]);//2
		System.out.println(arr1[2]);//3
		
		
		arr3[0]=11;
		arr3[1]=22;
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);		
		
		
		
		
		
	}
}
