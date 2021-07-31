package com.xms.oop.basic.day03;
/**
 * 
 * @author Administrator
 *输出水仙花数
 *不允许直接算出每位上的数，必须要通过循环获取每位上的数
 */
public class Test02 {
	public static void main(String[] args) {
		for(int i=100;i<10000;i++) {
//			获取当前i的每一位上的数
			int last = 0,/*每位上的数*/sum = 0 ;//每位上的数的立方和
			int n = i;//当前数
			while(n!=0) {//m:第一次是当前数，之后都是商
			last = n%10;
			n /= 10;
			sum+=last*last*last;
			}
			if(sum==i)
				System.out.println(i);
		}
	}
}
