package com.xms.oop.basic.day04;
/**
 * 
 * @author Administrator
 * 数组
 * 	存储相同数据类型的容器
 * 
 * 初始化
 * 1）动态初始化
 * 指定数组元素个数
 * 数组类型[] 数组名 = new 数据类型[数组长度];
 * 2）静态初始化
 * 指定数组元素的初始值
 * 数组类型[] 数组名 =new 数据类型[]{元素1,元素2....};
 */
public class ArrayDemo01 {
	public static void main(String[] args) {
//		动态初始化
		int[] arr=new int[3];//将数组的地址值赋值给了arr
//		除了char[]数组，打印其余数组名结果都为数组的地址信息
		System.out.println(arr.toString());//[I@506e6d5e
		
//		静态初始化
		char[] chs=new char[] {'a','b','c'};
		System.out.println(chs);//abc
//		打印char类型的数组名，结果为元素连接成一个字符串
		
		
//		访问数组元素通过数组下标访问，下标从0开始，依次+1
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(chs[0]);
		System.out.println(chs[1]);
		System.out.println(chs[2]);		
		
//		通过循环优化数组元素访问(数组遍历)
		for(int i=0;i<chs.length;i++) {
			System.out.println(chs[i]);
		}
//		获取数组长度
		System.out.println(chs.length);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
