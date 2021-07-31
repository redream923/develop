package com.xms;

//多个异常的处理方案（注意：多个异常不可能同时存在）
public class ExceptionDemo03 {
	public static void main(String[] args)  {
		demo1();
//		demo2();
	}

//	throws可以抛出多个异常名，异常名间用，隔开
	private static void demo2() throws Exception {
		int a = 10;
		int b = 3;
		int[] arr = { 1, 2, 3 };
//			如果可能存在多个异常，需要多次通过catch进行捕获
		System.out.println(a / b);
		System.out.println(arr[2]);

	}

	private static void demo1() {
		int a = 10;
		int b = 3;
		int[] arr = { 1, 2, 3 };
		try {
//			如果可能存在多个异常，需要多次通过catch进行捕获
			System.out.println(a / b);
			System.out.println(arr[2]);
			System.out.println("不知道的异常");

//			catch捕获异常的时候，小异常需要放在上面，大异常放在下面
		} catch (ArithmeticException ae) {
			System.out.println("除数不能为0");
		} catch (ArrayIndexOutOfBoundsException abs) {
			System.out.println("数组下标越界");
		} catch (Exception e) {
			System.out.println("不知道异常的处理方案");
		} finally {
//			finally里面的代码一定会执行（除非JVM退出）
//			一般finally里面执行的是释放资源代码
			System.out.println("over");
		}
	}
}
