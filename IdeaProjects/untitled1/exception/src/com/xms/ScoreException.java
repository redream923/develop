package com.xms;

//自定义异常
public class ScoreException extends RuntimeException {

	private static final long serialVersionUID = 5249784587916242257L;

	public ScoreException(String message) {
		super(message);
	}

}
