package com.prasad;

public class HelloWorld {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void displayInfo() {
		System.out.println("Your Message :"+message);
	}
	
}
