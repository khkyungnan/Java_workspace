package com.kh.inheritance.calculator;

import java.util.Scanner;

public class CaluculatorRun extends CaluculatorForMod {

	public static void main(String[] args) {
		//CaluculatorForMod cal = new CaluculatorForMod();
	//	System.out.println("add = " + cal.add());
		//System.out.println("mul =  " + cal.multiply());
	//	System.out.println("mod = " + cal.mod(num1,num2));
		
		/* scanner �̿��ؼ� �ڵ� �����ϱ� */

		CaluculatorForMod cal = new CaluculatorForMod();
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ���ڸ� �Է��ϼ���.");
		int num1 = sc.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
		int num2 = sc.nextInt();
		int result1 = cal.add();
		int result2 = cal.substruct();
		int result3 = cal.multiply();
		int result4 = cal.divide();
		int result5 = cal.mod();
		System.out.println("Add : " + result1);
		System.out.println("sub : " + result2);
		System.out.println("mul : " + result3);
		System.out.println("div : " + result4);
		System.out.println("div : " + result5);
		
		
	}

}
