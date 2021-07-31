package com.xms.oop.basic.day02;
/**\
 * 1)求1~100所有偶数和
 * 2)求5！=5*4*3*2*1；
 * 3)获取输出所有的水仙花数
 * 	水仙花数：是一个3位数，且个位数^3+十位数^3+百位数^3==这个数本身。
 * 
 * @author Administrator
 *
 */
public class Test05 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=2;i<100;i+=2) {
			sum+=i;
		}
		System.out.println(sum);

		sum=0;
		int i=2;
		while(i<100) {
			sum+=i;
			i+=2;
		}
		System.out.println(sum);
		
		sum=0;
		i=2;
		do {
			sum+=i;
			i+=2;
		}while(i<100);
		System.out.println(sum);
		
//		求5！=5*4*3*2*1；
		
		int FIVE=5;
		int num=5;
		for(int j=4; j>0;j--) {
			num*=j;
		}
		System.out.println(num);
	
		num=5;
		int j=4;
		while(j>0) {
			num*=j;
			j--;
		}
		System.out.println(num);
	
		num=5;
		j=4;
		do {
			num*=j;
			j--;
		}while(j>0);
		System.out.println(num);
		
		
//		3)获取输出所有的水仙花数
//		 * 	水仙花数：是一个3位数，且个位数^3+十位数^3+百位数^3==这个数本身。
		for(int a=100;a<999;a++) {
			int b=a/100;
			int c=a%100/10;
			int d=a%100%10;
//			ge=k%10
//			shi=l/10%10
//			bai=k/100%10
			if(a==b*b*b+c*c*c+d*d*d) {
				System.out.println(a+"是水仙花数");
			}
			
		}
		System.out.println();
		
		
		
		
		    int a=100;
		while(a<999) {
			int b=a/100;
			int c=a%100/10;
			int d=a%100%10;
			if(a==b*b*b+c*c*c+d*d*d) {
				System.out.println(a+"是水仙花数");
			}
			a++;
		}
		System.out.println();
		
		
		
	     a=100;
	      do{
		int b=a/100;
		int c=a%100/10;
		int d=a%100%10;
		if(a==b*b*b+c*c*c+d*d*d) {
			System.out.println(a+"是水仙花数");
		}
		a++;
	}while(a<999);
		
	}
	
	
}
