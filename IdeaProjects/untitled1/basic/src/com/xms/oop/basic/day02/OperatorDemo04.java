package com.xms.oop.basic.day02;
/**
 * 赋值运算符
 * @author Administrator
 * 重点：+=中的数据类型问题。
 */

public class OperatorDemo04 {
	public static void main(String[] args) {
		int a=3;//将常量1赋值给int类型变量a
		
		a += 2;// a = a+2;
		a -= 3;
//		System.out.println(a);
		a *= 4;
//		System.out.println(a);
		a /= 5;
		System.out.println(a);
		
		short s=2;
		s += 3;//等价于s=(s)(s+3);
		System.out.println(s);//5
		
		
		s=2;
		s = (short)(s+3);//short类型参与运算，会自动变为int类型。
		System.out.println(s);
		
		
	}
}
