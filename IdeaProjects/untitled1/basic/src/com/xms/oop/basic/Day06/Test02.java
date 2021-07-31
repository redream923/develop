package com.xms.oop.basic.Day06;

import java.util.Scanner;

/**
 * 打印输出杨辉三角形
 * @author Administrator
 * 1
 * 1	1
 * 1	2	1
 * 1	3	3	1
 * 1	4	6	4	1
 * 1	5	10	10	5	1
 */
public class Test02 {
	public static void main(String[] args) {
//		int[][] arr =new int[7][];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=new int[i];
//			for(int j=0;j<arr[i].length;j++) {
//				if(i==0 || j==0 ||j==arr[i].length-1) {
//					arr[i][j]=1;
//				}else {
//					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
//				}
//				
//			}
//		}
//		printEle(arr);
		printYh(6);
	}
	
	
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

	public static void printYh(int line) {
		int[][] arr=new int [line][];
		for(int i=0;i<arr.length;i++) {
			arr[i]=new int[i+1];		
			for(int j=0;j<arr[i].length;j++) {
//				如果是第一行或最后一行
				if(j==0 ||j==arr[i].length-1) {
					arr[i][j]=1;
				}else {//其他行 = 同列上一值+上一行前一列值
					arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
				}
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}





}
