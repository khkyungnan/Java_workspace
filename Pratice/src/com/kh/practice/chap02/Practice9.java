package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice9 {
/*
 사사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.

 * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();
        
        if (num <= 9) {
            for (int i = num; i <= 9; i++) {
                System.out.println(i + "단:");
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + " * " + j + " = " + (i * j));
                }
                System.out.println();
            }
        } else {
            System.out.println("9 이하의 숫자만 입력해주세요.");
        }
        
        
    }
}
