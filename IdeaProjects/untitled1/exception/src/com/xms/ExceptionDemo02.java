package com.xms;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo02 {
	public static void main(String[] args) {
//		demo1();
		try {
			demo2();			
		}catch (ArithmeticException e) {
			System.out.println("除数不能为0");
		}
	}
	
//	方式2
//	当前方法不对该异常进行处理，通过throws抛出异常，抛给方法调用者
private static void demo2() throws ArithmeticException {
		int a=10;
		int b=0;
		System.out.println(a/b);
	}






	//	方式一
	private static void demo1() {
		DateFormat df = new SimpleDateFormat();
		String time = "2012-11-11";
		try {
//			try里面存储的是可能发成异常的代码
			Date date = df.parse(time);
			System.out.println(date);
		} catch (ParseException e) {
//			catch里面是针对异常的处理方案
			e.printStackTrace();//JVM默认处理方案
		}

	}
}
