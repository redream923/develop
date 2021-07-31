package com.xms.oop.basic.day01;

public class Demo03 {
	public static void main(String[] args) {
		int max =Integer.MAX_VALUE;//int最大值
		System.out.println(max);
//		java在数学运算的时候不检查范围；在超出范围的时候会发生溢出问题
		int a=max+1;
		System.out.println(a);
		
//		运算类型要一致，max+1结果为int类型，值溢出
		long b=max+1;
		System.out.println(b);
		
//		1是long类型，将max默认转成long类型，max+1结果为long类型
		long c=max +1L;
		System.out.println(c);
	
//		long
//		获取当前毫秒值（时间是从1970-01-01 00:00:00开始）
		long ct =System.currentTimeMillis();
		System.out.println(ct);
		
//		long类型变量初始化，建议添加L(表示值的类型为long类型)
//		整数常量值在定义的时候是没有类型的，在将该常量值用于运算的时候，需要考虑类型。（原则怎么方便怎么来）
		
		byte by=1;//1是byte类型
//		128int类型（整数默认int）
//		by=128
		System.out.println("---------------------------------------");
//		浮点型
//		小数的常量值默认是double,可以在值后面添加后缀F/f，类型就变为float
		float f=3.14548348748875786f;
		System.out.println(f);
//		double后缀D/d,一般不用添加。
		double d =3.14548348748875786;
		System.out.println(d);
		
//		科学计数法
		double d2=3.1415E2;//3.1415*10^2
		System.out.println(d2);
		
//		浮点运算会有较高概率精度损失
		double d3=3;//3是int类型
		double d4=2.9;
		System.out.println(d3-d4);//0.10000000000000009
		
		System.out.println("---------------------------------------");
//		布尔型
		boolean b1=true;
		b1=false;
		
	}
}









