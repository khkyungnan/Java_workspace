package com.kh.practice.chap02;

import java.util.Scanner;

public class Practice9 {
/*
 �����ڷκ��� �Է� ���� ������ �ܺ��� 9�ܱ��� ����ϼ���.
��, 9�� �ʰ��ϴ� ���ڰ� ������ ��9 ������ ���ڸ� �Է����ּ��䡱�� ����ϼ���.

 * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("���ڸ� �Է��ϼ���: ");
        int num = sc.nextInt();
        
        if (num <= 9) {
            for (int i = num; i <= 9; i++) {
                System.out.println(i + "��:");
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + " * " + j + " = " + (i * j));
                }
                System.out.println();
            }
        } else {
            System.out.println("9 ������ ���ڸ� �Է����ּ���.");
        }
        
        
    }
}
