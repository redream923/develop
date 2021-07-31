package com.xms.oop.basic.day03;
/**
 * 结束外层循环
 * @author Administrator
 *
 */
public class LoopDemo03 {
	/*
	 * 需求：打印五行三列
	 */
	public static void main(String[] args) {
		bf:for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j==3)
					break bf;//结束bf标签标记的循环。
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
