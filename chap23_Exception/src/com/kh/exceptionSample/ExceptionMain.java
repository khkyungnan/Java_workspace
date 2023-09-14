package com.kh.exceptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionMain exmain = new ExceptionMain();
		exmain.ExceptionA();
	}
	public void ExceptionA() {
		try {
			int result = 10 / 0 ; //0으로 나누는 시도
			System.out.println("Result : " + result);

		} catch (ArithmeticException e) {
			/*
			 ArithmeticException 수학적인 계산 과정에서 발생하는 오류
			 ArithmeticException e : e는 우리가 지정한 변수명
			 e로 지정한 변수로 메세지를 getMessage() 로 전달받는다.
			 
			 Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.kh.exceptionSample.ExceptionMain.main(ExceptionMain.java:6)

			 * */
			System.out.println("산술 연산으로 인해 발생한 에러!! "+e.getMessage());
		}
	}
}
