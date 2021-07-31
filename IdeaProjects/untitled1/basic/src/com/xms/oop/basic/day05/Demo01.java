package com.xms.oop.basic.day05;

import java.util.Arrays;

/**
 * 数组元素翻转{1,2,3,4,5}-->{5,4,3,2,1}
 */
public class Demo01 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5};
		reverse(arr);
//		查看数组内元素的字符串表示
		System.out.println(Arrays.toString(arr));
 	}
	
	public static void reverse(int[] arr) {
//		拿第一个元素和最后一个交换，那第二个和倒数第二个交换......
//		i:所有前面需要交换的元素的下标
//		len-1-i:i对应的后面交换元素的下标
//		i  len-1-i;
		for(int i=0;i<arr.length/2;i++) {
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}
}
