package com.xms.oop.basic.day04;
/**
 * 
 * @author Administrator
 *一个数如果恰好等于它的因子之和，这个数就称为"完数"。
 *（因子：除去这个数本身的约数
例如6=1＋2＋3.编程 找出1000以内的所完数
 */
public class Test05 {
	public static void main(String[] args) {
		
		for(int i=1;i<=1000;i++) {
//			获取当前数的所有因子
			int sum = 0 ;
			for (int j=1;j<i/2;j++) {//j:i的因数范围
//				判断当前j是否是i的因数
				if(i%j == 0) {
					sum+=j;
				}
			}
//			判断是否为完数
			if(sum==i) {
				System.out.println(i);
			}
		}
	}
}
