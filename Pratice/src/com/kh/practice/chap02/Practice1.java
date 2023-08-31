package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice1 {
	/*
	1번 문제 
	사용자로부터 입력 받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
	단, 입력한 수가 2보다 작은 경우 “잘못 입력하셨습니다.”를 출력하세요.
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요:");
		int num = sc.nextInt();
		
		if(num < 1) { //만일 1 미만의 숫자가 입력이 되거나 입력한 수는 1보다 크거나 같아야 한다. 
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else { //1 이상인 숫자
			for (int i = 1; i<= num; i++) {
				System.out.println(i);
			}
		}
	}
}




