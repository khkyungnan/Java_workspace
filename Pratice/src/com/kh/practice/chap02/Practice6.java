package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
        int num1 = sc.nextInt();
        
        System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
        int num2 = sc.nextInt();
        if(num1 < num2) {
        	for (int i = num1; i <= num2; i++) {
                System.out.print(i + " ");
            }
        } else {
        	for (int i = num1; i <= num2; i++) {
                System.out.print(i + " ");
            }
        }
        
    }
}
