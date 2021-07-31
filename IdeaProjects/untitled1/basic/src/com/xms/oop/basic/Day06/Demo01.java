package com.xms.oop.basic.Day06;
/**
 * 二维数组
 * 里面元素是一维数组的数组
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		/*
		 * 动态初始化
		 */
//		方式一：所有一维数组元素个数一致
//		二维数组之内有3个一维数组 ，每个1维数组内有两个元素
		int[][] arr1=new int[3][2];//1,2  3,4  5,6
		
		
//		方式二：所有一维数组元素个数不确定
//		二维数组之内有3个一维数组 ，每个1维数组内元素不确定
		int[][] arr2=new int[3][];
		
//		静态初始化
		char[][] chs1=new char[][]{{'a','b','c'},{'1','2','3'}};
//		简写
		char[][] chs2= {{'A'},{'B','C'},{'D','E','F'}};
		
		System.out.println("--------------");
//		数组元素赋值
//		方式1：1维数组长度固定
		int n=1;
		for(int i=0;i<arr1.length;i++) {
//			arr[i]:arr1中的1维数组
			for(int j=0;j<arr1[i].length;j++) {
//			arr1[i][j]：1维数组中的元素	   
				arr1[i][j] = n++;
			}
		}
		printEle(arr1);
		
//		方式2:1维数组长度不固定
//		arr2 1  2,3  4,5,6
		for(int i=0;i<arr2.length;i++) {
//			创建1维数组
			arr2[i]=new int[i+1];
//			给1维数组复制
			for(int j=0;j<arr2[i].length;j++) {
				arr2[i][j]= n++ ;
			}
		}
		printEle(arr2);
		
		
		
	}
//	二维数组遍历
	public static void printEle(int[][] arr) {
//		遍历2维数组，获取1维数组
		for(int i=0;i<arr.length;i++) {
//			遍历1维数组，获取元素
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ "  ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
	
	
	
	
	
}
