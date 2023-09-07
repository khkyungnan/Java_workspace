package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CaluculatorRun extends CaluculatorForMod {

	public static void main(String[] args) {
		CaluculatorForMod cal = new CaluculatorForMod();
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 숫자를 입력하세요.");
		int a = sc.nextInt();
		System.out.println("두 번째 숫자를 입력하세요.");
		int b = sc.nextInt();

		cal.num1 = a;
		cal.num2 = b;
		
		int result1 = cal.add();
		int result2 = cal.substruct();
		int result3 = cal.multiply();
		int result4 = cal.divide();
		int result5 = cal.mod(cal.num1, cal.num2);
		System.out.println("Add : " + result1);
		System.out.println("sub : " + result2);
		System.out.println("mul : " + result3);
		System.out.println("div : " + result4);
		System.out.println("mod : " + result5);
		
		
	}

}
