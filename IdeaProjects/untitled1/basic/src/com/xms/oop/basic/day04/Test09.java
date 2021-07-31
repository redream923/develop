package com.xms.oop.basic.day04;

import java.util.Random;
import java.util.Scanner;

/**
 * 1)获取一个指定长度的int[]，里面的元素随机获取，取值范围1-100
 * （要求数组元素不重复）
 * 2)遍历数组，按照{元素1，元素2，元素3}格式输出
 * 3)获取数组中元素的最大值
 * 4)在数组元素末尾添加指定的值
 * 5)在数组指定下标处添加指定的值
 * 6)删除数组中指定的元素（只删除第一个出现的元素）
 * 7)删除指定下标处的元素
 * @author Administrator
 */
public class Test09 {
	public static void main(String[] args) {
		System.out.println("请输入一个数组的长度");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
//		获取数组(没有重复值)
		int[]ar=getArr(n);
		
////		打印数组
		printArr(ar);
//		
////		得到最大值
		getMax(ar);
//		
////		实现在末尾添加一个数
		int add;
		System.out.println("请输入添加在末尾的数：");
		add=sc.nextInt();
		ar=addLastVal(ar, add);
		printArr(ar);
		
//		实现在指定位置添加一个数：
		System.out.println("请输入添加的位置：");
		int po=0;
		po=sc.nextInt();
		System.out.println("请输入添加的数：");
		add=sc.nextInt();
		ar=addAppointVal(ar, add, po);
		printArr(ar);
//		
////		删除数组中指定的元素（只删除第一个出现的元素）
		System.out.println("请输入删除的数：");
		int del=sc.nextInt();
		ar=deVal(ar, del);
		printArr(ar);
		
//		删除指定下标处的元素
		System.out.println("请输入删除的下标：");
		po=sc.nextInt();
		ar=deAppointVal(ar, po);
		printArr(ar);
	}
	
// 	创建数组	
	public static int[] getArr(int n) {
		int[] ar=new int[n];
		Random r=new Random();
		for(int i=0;i<ar.length;i++) {
			ar[i]=r.nextInt(100)+1;
				for(int j=0;j<i;j++) {
					if(ar[i]==ar[j]) {
						i--;
						break;
					}
				}
		}
		return ar;
	}
	
//	遍历数组
	public static void printArr(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			if(i==0)
			System.out.print("{"+ar[i]+",");
			if(i!=0 && i!=ar.length-1) {
				System.out.print(ar[i]+",");
			}else if(i==ar.length-1)
				System.out.print(ar[i]+"}");
		}
		System.out.println();
	}
	
//	获取最大值
	public static int getMax(int[] ar) {
//	    假设第一个元素是最大值
		int max=ar[0];
		for(int i=1;i<ar.length;i++){	
//			如果其他元素>max
			if(ar[i]>ar[i-1]) {
				max=ar[i];//换掉最大值
			}
		}
		System.out.println("最大值是："+max);
		return max;
	}

//	在数组指数组末尾添加指定的值
	public static int[] addLastVal(int[] ar,int add) {
//		创建新数组，长度=指定数组长度+1
		int n=ar.length+1;
		int[] br=new int[n];
//		将原数组中所有元素放入新数组中
		for(int i=0;i<ar.length;i++) {
			br[i]=ar[i];
		}
//		在新数组添加指定元素
		br[br.length-1]=add;
		return br;
	}
	
//	在数组指定下标处添加指定的值
	public static int[] addAppointVal(int[] ar,int add,int index) {
		int n=ar.length+1;
		int[] b=new int[n];
		for(int i=0;i<ar.length;i++) {
			if(index==i+1) {
				for(int j=ar.length-1;j>=i;j--) {
					b[j+1]=ar[j];//疑问：观察++会不会影响操作
				}
				b[i]=add;
				for(int k=0;k<i;k++) {
					b[k]=ar[k];
				}
			}
		}
		return b;
	}
	
//	删除数组中指定的元素（只删除第一个出现的元素）
//	remove
	public static int[] deVal(int[] ar,int del) {
		int n=ar.length-1;
		int i=0;
		int[] br=new int[n]; 
		for( i=0;i<ar.length;i++) {
			if(ar[i]==del) {
				for(int j=i;j<ar.length-1;j++) {
					br[j]=ar[j+1];
				}
				break;
			}
		}
		for(int k=0;k<i;k++){
			br[k]=ar[k];
		}
		return br;
	}
	
//	删除指定下标处的元素
	public static int[] deAppointVal(int[] ar,int possition) {
		int n=ar.length-1;
		int i=0;
		int[] br=new int[n];
		for( i=0;i<ar.length;i++) {
			if( i+1 >= possition) {
				for(int j=i;j<n;j++) {
					br[j]=ar[j+1];
//					System.out.println(br[j]);
				}
				
			}else {				
				br[i]=ar[i];
			}
		}
		return br;
	}
	
	
	
	
	
}
