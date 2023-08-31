package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세요:");
		int num = sc.nextInt();
		
		if(num < 1) { //만일 1 미만의 숫자가 입력이 되거나 입력한 수는 1보다 크거나 같아야 한다. 
			System.out.println("1 이상의 숫자를 입력해주세요.");
		} else { //1 이상인 숫자
			 for (int i = num; num >=1; i--) {
		            System.out.print(i + " ");
		        }
		}
	}
}


/*
		hint
        for (int i = number; 범위 변경 해보기; i--) {
            System.out.print(i + " ");
        }

        
 * */
