package com.kh.practice3.func;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		/*
	 	�Ʒ� ���ÿ� ���� �޴��� ����ϰ� �޴� ��ȣ�� ������ ��OO�޴��Դϴ١���,
		���� ��ȣ�� ������ �����α׷��� ����˴ϴ�.���� ����ϼ���.
		ex.
		1. �Է�
		2. ����
		3. ��ȸ
		4. ����
		7. ����
		�޴� ��ȣ�� �Է��ϼ��� : 3
		��ȸ �޴��Դϴ�.
	 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȣ�� �Է¹ٶ� // 1.�Է� 2.���� 3.��ȸ 4.���� 7.����");
		int choice = sc.nextInt(); //��ȣ �Է�
		
		/** 1.if�� **/
		if (choice == 1) {
			System.out.println("�Է�");
		} else if (choice == 2) { //3.��ȸ 4.���� 7.����");
			System.out.println("����");
		} else if (choice == 3) {
			System.out.println("��ȸ");
		} else if (choice == 4) {
			System.out.println("����");
		} else if (choice == 7) {//else�� �� ��� ������ ���� ���ϱ� ������ else if �� �����
			System.out.println("���α׷��� ����˴ϴ�.");
		} 

	}

}






