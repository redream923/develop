package com.xms.oop.basic.day02;
/***
 * 逻辑运算符
 * @author Administrator
 *
 */
public class OperatorDemo03 {
	public static void main(String[] args) {
//		单与
		System.out.println(10<5&10==10);
		System.out.println(10>5&10==10);

//		单或
		System.out.println(10>5|10!=10);
		System.out.println(10<5|10!=10);
		
		System.out.println(!(10!=10));
		
//		双与
		System.out.println(10<5 && 10==10);
		System.out.println(10>5 && 10==10);

//		双或
		System.out.println(10>5 || 10!=10);
		System.out.println(10<5 || 10!=10);
		
//		异或 t^t=f f^f=f f^t=t f^f=t
		System.out.println(10>5 ^ 10!=10);//t
		System.out.println(10<5 ^ 10!=10);//f
		
		
		
	}
}
