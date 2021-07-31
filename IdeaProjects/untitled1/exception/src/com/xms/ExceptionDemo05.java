package com.xms;

//抛出异常对象
public class ExceptionDemo05 {
	public static void main(String[] args) {
		try {
			demo();			
		}catch (ArithmeticException ae) {
			ae.printStackTrace();//JVM默认处理异常方案
		String message=ae.getMessage();
//		System.out.println(massage);
		}
	}

	private static void demo() {
		int a=10;
		int b=0;
		if(b==0) {
//			抛出异常对象
			throw new ArithmeticException("除数为0");
		}else {
			System.out.println(a/b);
		}
		
	}
}
