package com.xms.oop.basic.day05;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * 机选双色球号码
 * 1）在01-33颗红球中随机选中不重复的6棵红球
 * 2）在01-16颗蓝球中随机选取1颗蓝球
 * 3）6颗红球需要按照由小到大顺序排列
 * 4）球号=6颗红球+1颗蓝球
 * @author Administrator
 *
 */
public class Demo05 {
	public static void main(String[] args) {
//		获取红球池
		String[] redPool= getRedPool(33);
//		创建奖池
		String[] pool=new String[6];
		
//		获取6个不重复红球，放入奖池
		Random r=new Random();
		for(int i=0;i<pool.length;i++) {
//			获取红球池随机下标0-32
			int index=r.nextInt(redPool.length);
			String redBall=redPool[index];//随机红球
//			判断当前奖池中是否存在当前随机获取的红球
			if(!contains(pool,redBall)) {
				pool[i] = redBall;//奖池没有该红球，放入奖池
			}else {
				i--;//奖池有该红球，在当前位置继续获取随机红球
			}
		}
		System.out.println(Arrays.toString(pool));
	
//		对奖池中所有红球进行排序
		Arrays.sort(pool);
//		奖池扩容
		pool=Arrays.copyOf(pool, pool.length+1);
//		获取一个随机蓝球
		String blueBall=redPool[r.nextInt(16)];
//		将蓝球放入奖池中
		pool[pool.length-1]=blueBall;
		
		System.out.println(Arrays.toString(pool));
		
	}
private static boolean contains(String[] pool,String redBall) {
	for(int i=0;i<pool.length;i++) {
//		equals:比较2个对象是否相等
		if(redBall.equals(pool[i]));
		return true;
	}
	return false;
	}
//	获取红球池
	public static String[] getRedPool(int length) {
		String[] redPool=new String[length];
		for(int i=0;i<redPool.length;i++) {
//			如果是前面9颗球
			if(i<=8) {
				redPool[i] ="0"+(i+1);
			}else {
//				valueOf:将int转成字符串类型
				redPool[i]=String.valueOf(i+1);
			}
		}
		
		
		return redPool;
	}
	
	
}
