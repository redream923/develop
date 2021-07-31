package com.xms.oop.basic.day04;
/**
 * 
 * @author Administrator
 * 异常
 */
public class ArrayDemo02 {
	public static void main(String[] args) {
		int[] arr= new int[]{1,2,3};
//		简写注意：简写只适用于初始化
//		arr2= {4,5,6}
		int[] arr2= {1,2,3};
		arr2 =new int[] {4,5,6};
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
//		ArrayIndexOutOfBoundsException(数组下标越界异常)
//		System.out.println(arr2[3]);
		
//		null:空值，表示什么都没有，不存在。
		arr=null;
		System.out.println(arr);//null
//		NullPointerException（空指针异常）
//		开发中，一般当对象没有值的时候，使用对象会出先该异常
		System.out.println(arr[0]);
		
		
		
		
	}
}
