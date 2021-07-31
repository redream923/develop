package com.xms.oop.basic.day04;

import java.util.Scanner;

/**
 * 
 * @author Administrator
 *Ean-13码规则：第十三位数字是前十二位数字经过计算得到的校验码。
例如：690123456789
计算其校验码的过程为：
① 前十二位的奇数位和6+0+2+4+6+8=26
② 前十二位的偶数位和9+1+3+5+7+9=34
③ 将奇数和与偶数和的3倍相加26+34*3=128
④ 取结果的个位数：128的个位数为8
⑤ 用10减去这个个位数10-8=2
所以校验码为2
（注：如果取结果的个位数为0，那么校验码不是为10（10-0=10，而是0
实现上述代码的功能，计算验证码，输入12位条码，返回带验证码的条码。
例：输入：692223361219输出：6922233612192

 */
public class Test01 {
	public static void main(String[] args) {
//		输入12位条形码
		Scanner sc=new Scanner(System.in);
		System.out.println("输入12位条形码");
		long code =sc.nextLong();
//		获取条形码每位上的数
		int last;
		int oddSum=0;//基数位和
		int evenSum=0;//欧位数和
		int i=1;
		long num=code;
		while(num!=0) {
			last=(int)(num%10);
			num/=10;
//			%2==1
			if(i%2==1) {
				evenSum+=last;
			}else {
				oddSum+=last;
			}
		}
//		③ 将奇数和与偶数和的3倍相加
		int sum=oddSum+3*evenSum;
//		取结果个位数
		int ge=sum%10;
//		用10-这个个位数
		int sesult =10-(ge==0?10:ge);
		code=code*10+sesult;
		System.out.println(code);
	}
}
