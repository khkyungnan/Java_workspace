package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CaluculatorRun extends CaluculatorForMod {

	public static void main(String[] args) {
		
		CaluculatorForMod cal = new CaluculatorForMod();
		System.out.println("add = " + cal.add());
		System.out.println("mul =  " + cal.multiply());
		System.out.println("mod = " + cal.mod());
		
		/* scanner 이용해서 코드 변경하기 */
		/*
		Calculator cal = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 숫자를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int num2 = sc.nextInt();
		int result1 = cal.add();
		int result2 = cal.substruct();
		int result3 = cal.multiply();
		int result4 = cal.divide();
		System.out.println("Add : " + result1);
		System.out.println("sub : " + result2);
		System.out.println("mul : " + result3);
		System.out.println("div : " + result4);
		*/
	}

}
