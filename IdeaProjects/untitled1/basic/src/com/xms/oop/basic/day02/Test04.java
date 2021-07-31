package com.xms.oop.basic.day02;

import java.util.Scanner;

/*
 * 控制台输入成绩（0-100），输出相应等级
 * 90-100       A
 * 80-89        B
 * 60-79        C
 * 0-59         D
 * 使用if语句和switch语句分别完成上述案例
 * 
 */
public class Test04 {
	public static void main(String[] args) {
		int score;
		Scanner scanner=new Scanner(System.in);
		score = scanner.nextInt();
		switch(score/10) {
		case 10:
		case 9 :System.out.println("A"); break;
		case 8 :System.out.println("B"); break;
		case 7 :
		case 6 :System.out.println("C"); break;
		default :System.out.println("D");
		
	}
	}
}
