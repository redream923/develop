package com.xms.oop.basic.day02;
/**
 * 实现两个变量交换
 * @author Administrator
 *
 */
public class Demo01 {
		public static void main(String[] args) {
			int a=1;
			int b=2;
			int temp;
			temp=a;
			a=b;
			b=temp;
			System.out.println(a);
			System.out.println(b);
		}
}
