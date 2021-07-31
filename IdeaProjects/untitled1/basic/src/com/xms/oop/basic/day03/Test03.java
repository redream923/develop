package com.xms.oop.basic.day03;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Administrator
 *猜数字
 */
public class Test03 {
	public static void main(String[] args) {

//		生成系统答案
		Random r=new Random();
		int answer=r.nextInt(100)+1;//1-100
//		用户录入答案
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入猜测的数字，范围1-100");
		int input =sc.nextInt();
		int count=1;
		while(answer!=input) {
//			提示信息
			if(input>answer) {
				System.out.println("猜大了，请继续猜");
			}else {
				System.out.println("猜小了，请继续猜");
			}
			input =sc.nextInt();
			count++;
		}
		System.out.println("恭喜你，猜对了!你一共猜了"+count+"次");
		
	}
}
