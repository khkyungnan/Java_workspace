package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();
        if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.println(i);
			}
		} else if(num2 < num1) {
        	for (int i = num2; i <= num2; i++) {
                System.out.print(i);
            }
        }
        
    }
}
