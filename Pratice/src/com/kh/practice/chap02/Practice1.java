package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice1 {
	/*
	1�� ���� 
	����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
	��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�. 
	�ƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���:");
		int num = sc.nextInt();
		
		if(num < 1) { //���� 1 �̸��� ���ڰ� �Է��� �ǰų� �Է��� ���� 1���� ũ�ų� ���ƾ� �Ѵ�. 
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		} else { //1 �̻��� ����
			for (int i = 1; i<= num; i++) {
				System.out.println(i);
			}
		}
	}
}




