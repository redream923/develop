package com.xms.oop.basic.Day06;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

/**
 * 1)获取1个长度指定的2维数组，里面的元素通过控制台录入（可以重复）
 * 
 * 2）获取2维数组中每个一维数组内元素的最大值，求出所有最大值和
 * @author Administrator
 * 
 */
public class Test01 {
	public static void main(String[] args) {
//		System.out.println("请输入指定的2维数组的长度");
//		Scanner sc=new Scanner(System.in);
//		int[][] arr=new int[sc.nextInt()][];
//		add(arr);
//		System.out.println("最大值和是："+addReturnNum(arr));
		
		int[][] arr=getArray(3, 3);
		printEle(arr);
		
		int sum=getMaxSum(arr);
		System.out.println(sum);
	}
	
	public static int[][] add(int[][] arr){
		for(int i=0;i<arr.length;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入第"+(i+1)+"组一维数组的长度");
			arr[i] =new int[sc.nextInt()];
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i].length+"  "+j);
				System.out.println("请输入数组的元素");
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	
	public static int addReturnNum(int[][] arr) {
		int addmax=0;
		int max=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(max<arr[i][j]) {
					max=arr[i][j];
				}
			}
			addmax+=max;
			System.out.print(max);
		}
		
		return addmax;
 	}
//	 * 1)获取1个长度指定的2维数组，里面的元素通过控制台录入（可以重复）
	public static int[][] getArray(int len1,int len2){
		int[][] arr=new int[len1][len2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(
						"请输入"+(i+1)+"1维数组内的第"+(j+1)+"个元素");
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
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
	
//	 * 2）获取2维数组中每个一维数组内元素的最大值，求出所有最大值和
	public static int getMaxSum(int[][] arr) {
		int sum=0;//累加和
		for(int i=0;i<arr.length;i++) {
			int max=getMax(arr[i]);
			sum+=max;
		}
		return sum;
	}
	
	private static int getMax(int[] arr) {
	int max=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	return max;
}
	
	
	
}
