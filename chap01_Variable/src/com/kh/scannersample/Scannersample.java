package com.kh.scannersample;
import java.util.Scanner;

public class Scannersample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt(); //정수만 받는 next
		System.out.println("내 나이는 " + age + " 입니다.");
		
		String name;
		int phoneNumber;
		
		System.out.print("당신의 이름을 입력하세요. : ");
		name = sc.next();
		System.out.print("당신의 번호를 입력하세요. : ");
		phoneNumber =sc.nextInt(); //-넣지않기
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신의 전화번호는 " +phoneNumber + "입니다.");
		
		
		
	}
}
