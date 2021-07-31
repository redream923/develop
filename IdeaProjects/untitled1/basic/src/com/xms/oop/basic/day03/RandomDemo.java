package com.xms.oop.basic.day03;
/**
 * 
 * @author Administrator
 *
 */
public class RandomDemo {
	public static void main(String[] args) {
//		生成一个[0.0,1)的随机小数
		double d=Math.random();
		System.out.println(d);
		
//		生成一个1~100的随机整数。
		int n =(int )(Math.random()*100+1);
		System.out.println(n);
		
//		生成一个10~99的随机数
//		10~99-->(0~89)+10 --(int)([0.0,1.0)*90)+10
		
		
		
	}
}
