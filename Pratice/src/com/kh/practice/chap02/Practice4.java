package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���:");
		int num = sc.nextInt();
		
		if(num < 1) { //���� 1 �̸��� ���ڰ� �Է��� �ǰų� �Է��� ���� 1���� ũ�ų� ���ƾ� �Ѵ�. 
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else { //1 �̻��� ����
			for ( ;  ; ) {//for�� �ȿ� �ϼ��ϱ�
				System.out.println("");
			}
		}
	}
}

