package com.kh.inheritance.animal;

public class Animal { //동물 클래스 정의
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void info() {
		System.out.println("이름 " + name + " 나이 " + age);
	}
	public void eat() {
		System.out.println(name + " 먹이를 먹습니다.");
	}
	public void sleep() {
		System.out.println(name + "이 잠을 잡니다.");
	}
}



