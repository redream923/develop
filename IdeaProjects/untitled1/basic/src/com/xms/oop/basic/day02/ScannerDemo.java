package com.xms.oop.basic.day02;
import java.util.Scanner;

/**
 * Scanner :简单文本扫描器
 * 可以扫描控制台内的数据
 * nextInt();获取int类型的数据
 * @author Administrator
 *
 */

public class ScannerDemo {
	public static void main(String[] args) {
//		创建Scanner对象
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入1个整数，按Enter确认");
//		获取在控制台上录入的int数据
		int a =sc.nextInt();//阻塞方法
		System.out.println(a);
		
		
	}
}
