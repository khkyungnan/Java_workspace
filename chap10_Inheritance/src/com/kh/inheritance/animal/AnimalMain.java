package com.kh.inheritance.animal;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog("大大捞");
		myDog.info();
		myDog.speak();
		myDog.eat();
		
		Cat mycat = new Cat("绊具固");
		mycat.run();
		mycat.eat();
		
		
		Monkey myMonkey = new Monkey("根根");
		myMonkey.speak();
		myMonkey.eat();
		myMonkey.sleep();
	}

}
