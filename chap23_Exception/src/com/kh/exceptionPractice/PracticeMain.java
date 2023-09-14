package com.kh.exceptionPractice;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void ArithException() {
		// int dividend / divisor 나누었을 때 예외처리 
		int dividend = 100;
		int divisor = 0;
		
	}

	public void NPException() {
		String text = "Hello World";
		String subText = null;
		
		try {
			int length = text.indexOf(subText);
		} catch() {
			
		}
	}
	public void NumFormatException() {
		String text = "123.45";
		int number = Integer.parseInt(text);
		System.out.println(number);
	}
}
