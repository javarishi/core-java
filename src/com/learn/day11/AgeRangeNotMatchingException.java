package com.learn.day11;

public class AgeRangeNotMatchingException extends Exception {

	public AgeRangeNotMatchingException() {
		// TODO Auto-generated constructor stub
	}

	public AgeRangeNotMatchingException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public AgeRangeNotMatchingException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public AgeRangeNotMatchingException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public AgeRangeNotMatchingException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	
	public void sendEmailToDoctor(String message){
		System.out.println("Email is sent to Doctor about this");
	}

}
