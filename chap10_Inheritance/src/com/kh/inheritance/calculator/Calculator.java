package com.kh.inheritance.calculator;

public class Calculator {
	//계산기
	int num1,num2;
	
	//1. 더하기
	public int add() {//파라미터 = 매개변수 숫자 2개 넣어주기
		return num1 + num2;
	}
	
	//2. 빼기
	public int substruct() {
		return num1 - num2;
	}
	
	//3. 곱하기
	public int multiply() {
		return num1 * num2;
	}
	
	//4. 나누기
	public int divide() {
		return num1 / num2;
	}
	/*나누기에서 몫 이외에 나머지를 보고 싶습니다!!*/
}





