package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice3 {
/*
 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
단, 입력한 수는 1보다 크거나 같아야 합니다.

 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자로 입력하세요.");
		int num = sc.nextInt();
		for (int i = num ;i >= num ; i--) {
			System.out.println(i);
		}
		if(num < 1 ) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		} else {
		// 		 int i = 1; i <= num; i++
			for (int i = num ;i >= 1 ; i--) {
				System.out.println(i);
			}
			
		}
	}
}










