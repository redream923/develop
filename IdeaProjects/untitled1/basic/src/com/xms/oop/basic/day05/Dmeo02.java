package com.xms.oop.basic.day05;
/**
 * 在数组中查找指定元素第一次出现的索引值
 * @author Administrator
 *
 */
public class Dmeo02 {
	public static void main(String[] args) {
		int[] arr= {5,1,2,3,4};
		System.out.println(getIndex(arr,2));
		
		int[] arr2= {1,2,3,4,5,6,7,8,9,10};
		System.out.println(binarySearch(arr2, 7));
	}
	
//	线性查找：从前往后依次查找
	public static int getIndex(int[] arr,int ele) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				return i;
			}
		}
		return -1;//arr中没有ele
	}
	
//	二分法查找：查看中间值是否等于查找的值，如果不等缩减范围获取中间值
//	再次查看重甲支付否等于查找的值...
	public static int binarySearch(int[] arr,int ele) {
		int max=arr.length-1;
		int min=0;
		int mid=(min+max)/2;
		
		while(arr[mid]!= ele) {
			if(arr[mid]>ele) {
				max=mid-1;
			}else {
				min=mid+1;
			}
			mid=(min+max)/2;
			if(min>max) {//表示数组中不存在查找元素
				return -1;
			}
		}
		return mid;
	}
	
	
	
	
	
	
}
