package com.xms;

public class Teacher {
	public void check(int score) {
		if(score<0 || score>100) {
			throw new ScoreException("成绩只能是0-100");
		}else {
			System.out.println(score);
		}
	}
}
