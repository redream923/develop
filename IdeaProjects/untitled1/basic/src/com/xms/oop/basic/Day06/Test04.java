package com.xms.oop.basic.Day06;

import java.util.Arrays;

/**创建一个char类型的36个元素的数组，前26个元素放置'A'-'Z',   后10个元素放置'0'-'9'。
使用for循环访问所元素并打印出来。
提示：char类型数据运算 'A'+1 -> 'B'，'0'+1 -> '1'
 * 
 * @author Administrator
 *
 */
public class Test04 {
	public static void main(String[] args) {
		char[] chs=getcharAry(36);
		System.out.println(Arrays.toString(chs));
	}

	private static char[] getcharAry(int len) {
		char[] chs=new char[len];
		int j=0;
		for(int i=0;i<chs.length;i++) {
//			前26个元素放置'A'-'Z'
			if(i<26) {
				chs[i] = (char) ('A'+i);
			}else {
				chs[i]=(char) ('0'+j++);
			}
		}
		return chs;
	}
	
}
