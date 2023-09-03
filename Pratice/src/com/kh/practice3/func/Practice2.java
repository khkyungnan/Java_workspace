package com.kh.practice3.func;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		/*
		 다음과 같은 실행 예제를 구현하세요.
			
			ex.
			정수 입력 : 5
			*****
			*   *
			*   *
			*   *
			*****
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("input");
		int n = sc.nextInt();
		String v = "";
		for(int i=0;i<n-2;i++) {
			v+=" ";
		}
		for(int j=0;j<n;j++) {
			System.out.print("*");
		}
		System.out.println();	
		for(int j=0;j<n-2;j++) {
			System.out.println("*"+v+"*");
		}
		for(int j=0;j<n;j++) {
			System.out.print("*");
		}
		System.out.println();
	}

}
