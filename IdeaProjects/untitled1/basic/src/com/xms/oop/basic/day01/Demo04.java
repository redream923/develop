package com.xms.oop.basic.day01;
/**
 * 基本类型2
 * @author Administrator
 *
 */
public class Demo04 {
	/*
	 *字符：单个文字或符号，用''括起来
	 */
	public static void main(String[] args) {
		char c='a';
		c='1';
		c='中';
		c='x';
		System.out.println(c);	
//		字符：本质上是一个整数
//		ASCII码（键盘上所有符号的编码表）
//		'0'     48
//		'A'     65
//		'a'     97
//		其他所有编码表都兼容ASCII码，Java使用Unicode编码
		char c2='a';
		System.out.println(c2);//'a'
		System.out.println(c2+1);//98
		
		int a='A';
		
		System.out.println(a);//65
		
//		String(字符串),使用""括起来，里面可以存放0,1或多个字符
		String s1="";//空串
		s1="a";
		s1="abc";
		System.out.println("----------------------------------");
		
//		特殊字符
		System.out.print("aaa");
		System.out.print('\n');//换行符
		System.out.print("bbb");
		System.out.print('\r');//回车符
		System.out.println("ccc");
		System.out.print('\t');//制表符
		System.out.print("ddd");
		System.out.println('\\');// \
		System.out.println('\'');// '
		System.out.println('\"');// "
//		通过unicode查询16进制1234对应的字符
		System.out.println('\u1234');
		System.out.println('\ua2b4');
		
	}
}
