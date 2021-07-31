package com.xms.oop.basic.Day06;

import java.util.Arrays;

/**
 * 
 * @author Administrator
 *
 */
public class Test08 {
	public static void main(String[] args) {
		int[] arr= {3,1,5,2,4};
//		获取最大元素和最小元素下标
		int maxIndex =getMaxIndex(arr);
		int minIndex=getMinIndex(arr);
//		交换
		int temp=arr[0];
		arr[0]=arr[maxIndex];
		arr[maxIndex] =temp;
		
		temp =arr[minIndex];
		arr[minIndex] =arr[arr.length-1];
		arr[arr.length-1]=temp;
		
		System.out.println(Arrays.toString(arr));
	}

	public static void change(int a,int b) {
		
	}
	
	private static int getMinIndex(int[] arr) {
		int min=arr[0];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min =arr[i];
				index=i;
			}
		}
		return index;
	}

	private static int getMaxIndex(int[] arr) {
		int max=arr[0];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max =arr[i];
				index=i;
			}
		}
		return index;
	
	}
}
