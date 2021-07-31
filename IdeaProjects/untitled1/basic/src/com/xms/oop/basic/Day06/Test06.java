package com.xms.oop.basic.Day06;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

/**
 * 任意一个人输入年龄，就可以判断出他是哪个年龄段的人？

/*
0-9   儿童
10-19 少年
20-29 青少年
30-39 青年
40-49 壮年
50-59 中年
60-69 中老年
70-79 老年
80-89 老老年
90-99 老老老年

 * @author Administrator
 *
 */
public class Test06 {
	public static void main(String[] args) {
		String[] ageInfos= {"儿童","少年","青少年","青年","壮年"};
		int gae=13;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入年龄");
		int age=sc.nextInt();
		System.out.println(ageInfos[age/10]);
		
		
		
		
		
	}
}
