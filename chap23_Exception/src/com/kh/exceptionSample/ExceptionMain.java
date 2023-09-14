package com.kh.exceptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionMain exmain = new ExceptionMain();
		//exmain.ExceptionA();
		//exmain.ExceptionN();
		exmain.ExceptionF();
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

	public void ExceptionN() {
		try {
			String text = null;
			int length = text.length(); 
			//내용이 없는데 text로 부터 문자열의 길이를 얻기
			System.out.println("문자열 길이 : " + length);
		} catch (NullPointerException abc) {
			System.out.println("빈값입니당~~~ 번호는 쓰셔야죠^^?");
			//System.out.println(" !!!! 빈 값임 !!!! " + abc.getMessage());
		}
		
	}

	public void ExceptionF() {
			//050904
		try {
			String juminNumber = "공오공904";
			int number = Integer.parseInt(juminNumber);
			System.out.println("숫자 : " + number);
		} catch(NumberFormatException format) {
			System.out.println("숫자만 넣어주세요.");
			System.out.println("NumberFormatException 발생 : "+format.getMessage());
		}
	
		
	}
}
