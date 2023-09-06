package com.kh.inheritance.animal;

public class Cat extends Animal {
	public Cat(String name, int age) {
		super(name, age);//상위 클래스(Animal)의 멤버에 접근하는 데 사용
	}
}
