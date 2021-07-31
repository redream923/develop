package com.xms.oop.basic.day04;

import java.util.Scanner;

/**
 *  * @author Administrator
 *开发一款软件，根据公式（身高-108*2)=体重，
 *可以10斤左右的浮动。
 *来观察测试者体重是否合适。
 */
public class Test06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入身高");
		int height =sc.nextInt();
//		通过身高计算标准体重
		int weight=(height-108)*2;
		
		System.out.println("输入体重");
		int weight_user = sc.nextInt();
		
//		判断用户体重
		if(weight_user-weight<=10 && weight-weight_user<10) {
			System.out.println("正常体重");
		}else {
			System.out.println("不正常体重");
		}
		
	}
}
