package com.kh.example.practice2.model.vo;
/*
- pName : String
- price : int
- brand : String
+ Product()
+ information() : void 
 * */
public class Product {
	//1. ������� ���� - pName : String - price : int - brand : String
	String pname;
	int    price;
	String brand;
	//2. ������ this�� Ȱ���ؼ� ��������
	//+ Product()
	public Product(String pname, int price, String brand) {
		this.pname = pname;
		this.price = 0;
		this.brand = brand;
	}
	//3. ���� ��� �޼ҵ� �����
	//+ information() : void 
	public void information() {
		//sysout + ctrl + space => �ڵ��ϼ�
		System.out.println("��ǰ�� : " + pname);
		System.out.println("����   : " + price + "��");
		System.out.println("�귣��  : " + brand);
	}
}