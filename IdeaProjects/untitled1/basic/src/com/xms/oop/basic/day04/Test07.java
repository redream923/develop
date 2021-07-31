package com.xms.oop.basic.day04;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 *3个整数，给出提示信息：
能否创建角形；两边之和大于第3边  3个条件都要写
如果能构建角形，提示是直角角形还是等边角形等腰角形还是普通角形；
最后输出三角形面积；
 */
public class Test07 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		
		
//		判断是否能够组成三角形
		if(a+b>c && b+c>a && a+c>b ) {
			System.out.println("可以组成三角形");
//		    把最大值给c
			if(a>b) {
				int temp=a;
				a=b;
				b=temp;
			}
			if(b>c) {
				int temp=b;
				b=c;
				c=temp;
			}
//			判断三角形
			if(a*a+b*b==c*c) {
				System.out.println("直角三角形");
			}else if(a==b && a==c) {
				System.out.println("等边三角形");
			}else if(a==b || b==c ||a==c) {
				System.out.println("等腰三角形");
			}else {
				System.out.println("普通三角形");
			}
			
//			计算面积
			double p=(a+b+c)/2;
			double area =Math.sqrt(p*(p-a)*(p-b)*(p-c));
			System.out.println("面积："+ area);	
		}else {
			System.out.println("不能组成三角形");
		}
	}
}
