package com.xms.oop.basic.Day06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 1、从键盘输入本组学员的成绩，放到数组中
2、用for循环显示所学员的成绩
3、排序：从低到高
4、查找是否正好60分的，如果返回位置
5、复制成绩最低三名构成新数组
6、用工具类打印成绩最低三名成绩
 * @author Administrator
 *
 */
public class Test03 {
	public static void main(String[] args) {
		int[] scores=getScores(5);
		System.out.println(Arrays.toString(scores));
		Arrays.sort(scores);
		System.out.println(Arrays.binarySearch(scores, 60));
		int[] ns=Arrays.copyOf(scores, 3);
		System.out.println(Arrays.toString(ns));
	}
//	获取所有学员成绩
	private static int[] getScores(int len) {
		int[] scores=new int[len];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<scores.length;i++) {
			System.out.println("请输入第"+(i+1)+"各学员的成绩");
			scores[i]=sc.nextInt();
		}
		return scores;
	}
}
