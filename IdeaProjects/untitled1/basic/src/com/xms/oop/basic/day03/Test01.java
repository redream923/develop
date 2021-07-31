package com.xms.oop.basic.day03;
/**
 * 1）打印如下图形
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 *  ******
 * @author Administrator
 * 2）打印99乘法口诀表
 * 1*1=1
 * 1*2=2 2*2=4
 */
public class Test01 {
	public static void main(String[] args) {
		for (int i=1;i<4;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i=1;i<10;i++) {
			for (int j=1;j<=i;j++) {
			System.out.print(j+"*"+i+"="+j*i+"\t");	
			}
			System.out.println();
		}
	}
}
