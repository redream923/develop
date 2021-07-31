package com.xms.oop.basic.day05;

import java.util.Random;

/*
 * 1）获取一个指定长度的int[]，里面的元素随机获取，取值范围0~100
 * （要求数组元素不重复）
 * 2）遍历数组，按照{元素1, 元素2, 元素3}格式输出
 * 3）获取数组中元素的最大值
 * 4）在数组元素末尾添加指定的值
 * 5）在数组指定下标处添加指定的值
 * 6）删除数组中指定的元素（只删除第一次出现的元素）
 * 7）删除指定下标处的元素
 */
public class Test09 {
	public static void main(String[] args) {
		int[] arr = getIntArray(5);
		printArrayEle(arr);
		//System.out.println(getMax(arr));
		//int[] narr = add(arr,8);
		//int[] narr = add(arr,2,8);
		int[] narr = remove(arr, 8);
		
		printArrayEle(narr);
	}
	//1
	public static int[] getIntArray(int length) {
		int[] arr = new int[length];
		//填充数组元素
		Random r = new Random();
		for(int i=0;i<arr.length;i++) {
			int rn = r.nextInt(10);
			//判断数组中是否存在当前的随机数
			//if(!contains(arr,rn)) {
			if(!contains(arr,i,rn)) {
				arr[i] = rn;
			}else {
				i--;
			}
		}
		return arr;
	}
	
	
	//判断指定数组中是否包含指定元素
	private static boolean contains(int[] arr, int ele) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				return true;
			}
		}
		return false;
	}
	
	//判断指定数组中从[0,index)范围内是否包含指定元素
	private static boolean contains(int[] arr, int index,int ele) {
		for(int i=0;i<index;i++) {
			if(arr[i]==ele) {
				return true;
			}
		}
		return false;
	}
	//2
	public static void printArrayEle(int[] arr) {
		System.out.print("{");
		for(int i=0;i<arr.length;i++) {
			//判断是否为最后一个元素
			if(i==arr.length-1) {
				System.out.print(arr[i]+"}");
			}else {
				System.out.print(arr[i]+", ");
			}
		}
		System.out.println();
	}
	
	//3
	public static int getMax(int[] arr) {
		int max = arr[0];//假设第一个元素为最大值
		//拿其它元素和最大值进行比较
		for(int i=1;i<arr.length;i++) {
			//如果其它元素>max
			if(arr[i]>max) {
				max = arr[i];//换掉最大值
			}
		}
		return max;
	}
	
	//4
	public static int[] add(int[] arr,int ele) {
		//创建新数组，长度=指定数组长度+1
		int[] narr = new int[arr.length+1];
		//将原数组中所有元素放入新数组中
		for(int i=0;i<arr.length;i++) {
			narr[i] = arr[i];
		}
		//在新数组添加指定元素
		narr[narr.length-1] = ele;
		return narr;
	}
	
	//5 在指定arr数组的指定index处，添加指定的ele值
	public static int[] add(int[] arr,int index,int ele) {
		//创建新数组，长度=指定数组长度+1
		int[] narr = new int[arr.length+1];
		//1）将原数组中index位置前的所有元素放入新数组中
		for(int i=0;i<index;i++) {
			narr[i] = arr[i];
		}
		//2）添加指定index处元素
		narr[index] = ele;
		//3）将原数组中index及其位置后的所有元素放入新数组中
		for(int i=index;i<arr.length;i++) {
			narr[i+1] = arr[i];
		}
		//在新数组添加指定元素
		narr[narr.length-1] = ele;
		return narr;
	}
	
	//6
	public static int[] remove(int[] arr,int ele) {
		//获取删除元素在数组中的下标
		int index = getRemoveIndex(arr,ele);
		return removeForIndex(arr, index);
	}
	
	private static int getRemoveIndex(int[] arr, int ele) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				return i;
			}
		}
		return -1;//ele不在数组中
	}

	
	//7
	public static int[] removeForIndex(int[] arr,int index) {
		//获取删除元素在数组中的下标
		if(index<0||index>=arr.length) {
			System.out.println("指定元素不在数组中");
			return arr;
		}else {
			//创建1个新数组
			int[] narr = new int[arr.length-1];
	
			for(int i=0;i<index;i++) {
				narr[i] = arr[i];
			}
			for(int i=index+1;i<arr.length;i++) {
				narr[i-1] = arr[i];
			}
			return narr;
		}
	}
}
