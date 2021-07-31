package com.xms.oop.basic.day03;
/**
 * 循环控制
 * break：    结束单层循环
 * continue： 结束当前循环操作，继续下次循环操作
 * return     结束方法
 */

public class LoopDemo01 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
//				break;
//				continue;
				return;
			}
			System.out.println(i);
		}
		System.out.println("next");
	}
}
