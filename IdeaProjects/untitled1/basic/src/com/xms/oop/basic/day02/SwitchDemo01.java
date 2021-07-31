package com.xms.oop.basic.day02;

public class SwitchDemo01 {
	public static void main(String[] args) {
		int a=5;
		int b=2;
		switch(a/b) {
		case 1:
			System.out.println("a");
			break;
		case 1+1:
			System.out.println("b");
//			break;
//			switch没有结束，继续向下执行（不会执行判断操作，执行case内的语句。）
//			省略break会造成case穿透现象。
		case 3:
			System.out.println("c");
			break;
		default:
			System.out.println("d");
			break;
		}
	}
}
