package com.kr.arraysample;

public class Array03 {
		public static void main(String[] args) {
			//1. �迭�� ���̸� ����
			int[] num = new int[10]; //���̰� 10�� �迭 ����
			// 1~ 10 ������ �ݺ����� �̿��ؼ�
			
			for(int i = 0; i<num.length;i++) {
				//������� �迭 �ε����� ���� ���� ��
				num[i] = i + 1;
				//System.out.println(num[i]);
			}
			// �� ���� ���
			for (int i = 1; i < num.length; i++) {
				System.out.println("num[" + i + "] = " + num[i]);
			//���̰� 10�� �迭�� ���� 1~10������ ���� �ݺ����� �̿��ؼ�
			//�������� �迭 �ε����� ���� �� �� ���� ����ϱ�
			// ��°� : 10 9 8 7 6 5 4 3 2 1
		}

	}

}
