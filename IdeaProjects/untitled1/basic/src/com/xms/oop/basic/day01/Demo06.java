package com.xms.oop.basic.day01;
/**
 *算数运算符
 * @author Administrator
 *
 */
public class Demo06 {
	public static void main(String[] args) {
//		+用于连接符
//		连接符：将字符串和其他类型的数据连接，组成一个新的字符串
//		只有当+左边或右边存在字符串的时候，+才会用作连接符。
		System.out.println("1"+2);//"12"
		System.out.println("1"+2+3);//"123"
		System.out.println('1'+2+"3");//"513"
		System.out.println(1+'2'+"3");//"513"
		System.out.println(1+"2"+3);//"123"
		
//		整除（只有当被除数和除数都是整数的时候，才是真的整除）
//		作为整除的时候结果为上
		System.out.println(5/2);//2
		System.out.println(-5/2);//-2
		System.out.println(5/-2);//-2
		System.out.println(-5/-2);//2
		
//		下面不是整除
		System.out.println(5.0/2);//2.5
		System.out.println(5/2.0);
		System.out.println(5.0/2.0);
		
//		%取模（余数）
		
		System.out.println(5%2);//1
		System.out.println(-5%2);//-1
		System.out.println(5%-2);//1
		System.out.println(-5%-2);//-1
		
		System.out.println("---------------------------------");
		
		
//		++(自增+1)
		int a=3;
		a++;
		System.out.println(a);//a=4
//		1）++、--可以放在变量的前面，也可以放在变量的后面
//		2）如果++单独运算，++在前在后无所谓
		++a;
		System.out.println(a);
//		3)如果++参与了其他操作
//		在前：先执行++操作，后执行其他操作
//		在后：先执行其他操作，后执行++操作
		int b=2;
		System.out.println(++b);//3
		b=2;
		System.out.println(b++);//2
		System.out.println(b);
		 
		
		int i=3;
		int j=i++ +2;
		System.out.println("i="+i+",j="+j);
		i=3;
		j=++i +2;
		System.out.println("i="+i+",j="+j);
		
//		注意:下面情况只会执行第一个赋值操作。
		int k =5;
		k=k++;
		System.out.println(k);
		
		k =5;
		k=++k;
		System.out.println(k);
		
		System.out.println("----------------------------");
		
		int l=5;
		int w=l++ + ++l;
//		   12   5     7     8
		System.out.println("l="+l+",w="+w);//l=7 w
		
		l=5;
		l=l++ + ++l;
//		12  5    7 
		System.out.println("l="+l);
		
		System.out.println("-------------------------");
		int m=3;
		int n=m++ - --m + ++m + m-- + --m - m++ + --m -m++ + ++m;
		//12   3  -   3 +  4   + 4  +  2  -  2  +  2  - 2  +  4
		// m   4      3    4     3     2     3     2    3     4
		System.out.println("m="+m+",n="+n);
	}
}
