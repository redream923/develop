package com.xms.oop.basic.day01;
/**
 * 基本类型转换
 * @author Administrator
 *
 */
public class Demo05 {
	public static void main(String[] args) {
//		默认转换：小类型转大类型
		byte b=10;
		int a = b;//默认转换 现将b默认转成int，在执行赋值造作.
//		强制转化：大类型转成小类型
		int m =10;
		byte n=(byte)m ; //强制转换（需要手动进行转换）
		System.out.println(a);
		System.out.println(n);
//		注意：在进行强转的时候，可能会发生数据损失
//		在强转是,需要保证强转值在强转类型范围内;否则不应该强转。
		m=10000;
		n=(byte)m;
		System.out.println(n);
		
//		byte,short,char在参与运算的时候，会默认转成int
		
		short s =1;
		s=(short)(s+2);//s+2是int类型，需要强转。
		System.out.println(s);
	
//		short和char之间要进行相互转换
		
		short sh =97;
		char c =(char)sh;
		System.out.println(c);//'a'
		
		char c2='A';
		short sh2 =(short)c2;
		System.out.println(sh2);//65
		
//		不涉及常量的运算，只针对含变量的运算
		byte b2=1+2;
//		byte b2=(byte)(127+2);  如果是常量值进行运算，会先运算计算结果，然后看结果
//		是否超出变量范围，以整数常量为例
//		如果没有超出，直接赋值，
//		如果超出范围，结果为int 类型，需要强转
		int i=1;
		byte b4=(byte)(i+2);
		
		
		
		
	}
}
