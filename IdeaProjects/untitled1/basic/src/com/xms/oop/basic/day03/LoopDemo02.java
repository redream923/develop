package com.xms.oop.basic.day03;
/**
 * 循环的嵌套
 * @author Administrator
 */
public class LoopDemo02 {
	/*
	 * 需求
	 * 打印如下图形：
	 * *****
	 * *****
	 * *****
	 * *****
	 */
	public static void main(String[] args) {
//		打印4行，i行数
		for(int i=0 ;i<4;i++) {
//			打印当前行的*，j列数			
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			
		}			
	}
}
