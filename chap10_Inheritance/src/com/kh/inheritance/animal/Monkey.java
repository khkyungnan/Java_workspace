package com.kh.inheritance.animal;

public class Monkey extends Animal {
	public Monkey (String name) {
		super(name);//���� Ŭ����(Animal)�� ����� �����ϴ� �� ���
	}
	
	public void speak() {
		System.out.println(getName() + "  (����)");
	}
	@Override
	public void sleep() {
		System.out.println(getName() + " �Ųٷ� �ڴ� ������ ���� ");
	}
	public void eat() {
		System.out.println(getName() + " ���̸��̸���.");
	}
	
}
