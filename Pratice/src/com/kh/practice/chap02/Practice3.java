package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����:");
		int num = sc.nextInt();
		
		if(num < 1) { //���� 1 �̸��� ���ڰ� �Է��� �ǰų� �Է��� ���� 1���� ũ�ų� ���ƾ� �Ѵ�. 
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else { //1 �̻��� ����
			 for (int i = num; num >=1; i--) {
		            System.out.print(i + " ");
		        }
		}
	}
}


/*
		hint
        for (int i = number; ���� ���� �غ���; i--) {
            System.out.print(i + " ");
        }

        
 * */
