package com.pratik.CustomException;

public class CommonException extends Exception 
{
	private String message;

	
	public CommonException() {
		super();
	}


	public CommonException(String message) {
		super();
		this.message = message;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
