package com.xms.oop.basic.Day06;

import java.util.Arrays;

/**
 * 创建一个char类型的26个元素的数组，分别 放置'A'-'Z'。
使用for循环访问所元素并打印出来。
 * @author Administrator
 *
 */
public class Test05 {
	public static void main(String[] args) {
		char[] chs=getcharAry(26);
		System.out.println(Arrays.toString(chs));
	}

	private static char[] getcharAry(int len) {
		char[] chs=new char[len];
		int index=0;
		for(char i='A';i<='Z';i++) {
				chs[index++] =  i;
		}
		return chs;
	}
}
