package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		/*
		 ����ڷκ��� �Է� ���� �ϳ��� ���� �Ҽ����� �Ǻ��ϴ� ���α׷��� �����ϼ���.
		 ��, �Է��� ���� 2���� ���� ��� ���߸� �Է��ϼ̽��ϴ�.���� ����ϼ���.
		, 1 �̸��� ���ڰ� �Էµƴٸ� 
		 ��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		 * */
		Scanner sc = new Scanner(System.in);
		boolean isTrue = true;
		
		while (isTrue) {//2. ���� �߰��ϱ�
		System.out.println("���ڸ� �Է��ϼ���:");
		int num = sc.nextInt();
		//1. ���� �� ����� boolean ���� = true or false;
			if(num < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			} else { 
				for (int i = 1; i<= num; i++) {
					System.out.println(i);
				}
				//3. ���� false �����
				isTrue = false;
				break;
			}
		}
	}
}
