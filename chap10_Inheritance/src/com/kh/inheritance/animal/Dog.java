package com.kh.inheritance.animal;

public class Dog extends Animal {
	public Dog(String name, int age) {
		super(name, age);//���� Ŭ����(Animal)�� ����� �����ϴ� �� ���
		/*@Override
		public void makeSound() {
			System.out.println(super.name + "�۸�!!! ¢���ϴ�." );
		}
		*/
	}
}
