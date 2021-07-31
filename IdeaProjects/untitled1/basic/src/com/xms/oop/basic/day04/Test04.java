package com.xms.oop.basic.day04;
/**
 * 
 * @author Administrator
 *编写程序，打印100-200之间的素数
 */
public class Test04 {
	public static void main(String[] args) {
		for(int i=100;i<=200;i++) {
			boolean flag=true;//假设当前i是素数
//			判断当前i是否只能被1和本身整除
//			如果i能被除了1和本身之外的其他数整除，
//			证明这个数他不是素数
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=false;
					break;	
				}
			}
			if(flag) {
				System.out.println(i);
			}
		}
	}
}
