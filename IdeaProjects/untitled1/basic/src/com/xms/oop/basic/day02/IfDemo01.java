package com.xms.oop.basic.day02;
/**
 * 
 * @author Administrator
 *
 */

public class IfDemo01 {
		public static void main(String[] args) {
//			格式一
			int age=21;	
			if(age<18) {
				System.out.println("不可以上网吧");
			}
			System.out.println("----------------------");
//			格式二
			if(age>23) {
				System.out.println("晚婚");
			}
			else {
				System.out.println("早婚");
			}
			System.out.println("------------------------");
//			格式三
			if(age>=0 && age<=3) {
				System.out.println("在家玩");
			}else if(age>=4 && age<=6) {
				System.out.println("上幼儿园");
			}else if(age>=6 && age<=22) {
				System.out.println("上学");
			}else if(age>=23 && age<=65) {
				System.out.println("上班");
			}else if(age>=66 && age<= 120)
				System.out.println("退休");
			else 
				System.out.println("年龄有误");
//			优化：
//			一般开发中，会先进行数据合法性校验
			if(age<0 || age>120) {
				System.out.println("年龄有误!");
			}else {
				if(age<=3) {
					System.out.println("在家玩");
				}else if(age<=6) {
					System.out.println("上幼儿园");
				}else if(age<=22) {
					System.out.println("上学");
				}else if(age<=65) {
					System.out.println("上班");
				}else 
					System.out.println("退休");
			}
			
			
		}
}
