package com.xms.oop.basic.day05;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Arrays常用方法
 * @author Administrator
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		int[] arr= {5,1,3,2,4};
//		toString(arr)：获取数组的字符串表示
		System.out.println(Arrays.toString(arr));
		
//		sort():自然排序(有小到大顺序排序)
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
			
//		二分法查找
		System.out.println(Arrays.binarySearch(arr, 2));
		
//		判断两个数组是否相等
		char[] chs1={'a','b','c'};
		char[] chs2={'a','b','c'};
		char[] chs3={'c','b','a'};
		System.out.println(Arrays.equals(chs1, chs2));
		System.out.println(Arrays.equals(chs1, chs3));
//	数组复制
//		弊端：只能从第一个元素开始进行复制
		int[] src= {1,2,3};
//	1）整体复制
		int[] desct1=Arrays.copyOf(src, src.length);
		
//	2）数组扩容
		int[] dest2=Arrays.copyOf(src, src.length+1);
		System.out.println(Arrays.toString(dest2));
		
//	3）数组减容
		int[] dest3 = Arrays.copyOf(src, src.length-1);
		System.out.println(Arrays.toString(dest3));
		
		src=new int[] {1,2,3,4,5};
		int[] dest =new int[3];
		
//		参数说明：
//		参数1：复制源  参数2：复制起始位置
//		参数3：目的端   参数4：接受起始位置	参数5：复制元素的个数
		System.arraycopy(src, 1, dest, 0, 3);
		System.out.println(Arrays.toString(dest));
		
//		数组填充
		String[] sarr= {"hello","world","java"};
		Arrays.fill(sarr,"javase");
		System.out.println(Arrays.deepToString(sarr));
		
		
	}
	
	
	
	
	
	
}
