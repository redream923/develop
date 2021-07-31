package com.xms.oop.basic.day04;
/**
 * 
 * @author Administrator
 *求调和级数中从第多少项开始值大于10
调和级数的第n项形式为：1+1/2+1/3+…+1/n
 */
public class Test03 {
	public static void main(String[] args) {
		int n=1;
		double sum=0;//调和级数值
		while(sum<=10) {
			sum+=(1.0/n);
			n++;
		}
		System.out.println(n);
	}
}
