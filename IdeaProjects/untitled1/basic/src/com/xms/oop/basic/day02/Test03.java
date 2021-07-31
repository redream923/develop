package com.xms.oop.basic.day02;

import java.util.Scanner;

public class Test03 {
	/*
	 * 控制台输入成绩（0-100），输出相应等级
	 * 90-100       A
	 * 80-89        B
	 * 60-79        C
	 * 0-59         D
	 * 使用if语句和switch语句分别完成上述案例
	 * 
	 */
	public static void main(String[] args) {
		int score;
		Scanner scanner=new Scanner(System.in);
		score = scanner.nextInt();
		if(score>=90 && score <100) {
			System.out.println("A");
		}else if(score<90 && score>=80) {
			System.out.println("B");
		}else if(score<80 && score>=60) {
			System.out.println("C");
		}else if(score<60 && score>=0)
			System.out.println("D");
	}
}
