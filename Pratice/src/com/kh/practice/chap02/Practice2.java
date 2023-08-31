package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		/*
		 사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		 단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
		, 1 미만의 숫자가 입력됐다면 
		 “1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		 * */
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		
		while (isTrue) {//2. 조건 추가하기
		System.out.println("숫자를 입력하세요:");
		int num = sc.nextInt();
		//1. 조건 값 만들기 boolean 변수 = true or false;
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else { 
				for (int i = 1; i<= num; i++) {
					System.out.println(i);
				}
				//3. 조건 false 만들기
				isTrue = false;
				break;
			}
		}
	}
}
