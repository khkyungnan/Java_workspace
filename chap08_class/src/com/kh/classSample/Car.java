package com.kh.classSample;

public class Car {
	//1. ���� �ʵ� �������
	String brand;     //�귣��
	String model;     //��
	int speed;        //�ӵ�
	boolean engineOn; //���� ����
	
/* ==========================================
 * ������� �ؿ��� ��� �޼���� ����
 * */
	
	//2. �����ڴ� �޼����� �Ѱ��� ����
	// ���� �� �� �ʼ��� ���� �Ķ���ʹ� �귣��� ��
	public Car(String b, String m) {
		System.out.println("Car ����");
		this.brand = brand;
		this.model = model;
		this.speed = 0;
		this.engineOn = false;
		
	}
	
	public void startEngine() { //
		System.out.println("������ �õ��� �غ� �� �ֽ��ϴ�!");
		//���࿡ ������ true ���� �õ�
		/*
		if(engineOn) {
			System.out.println("������ �õ��մϴ�.");//��� �޼ҵ� �ۼ�
		} else {//������ false �̹� ������ �����ִ�.
			System.out.println("�̹� ������ ���� �ֽ��ϴ�.");
		}
		*/
	}
	
	//���� �޼���
	public void acclerate(int amount) { 
		if(engineOn) {
			//������ true�� ���� �ӵ��� �󸶴�.
			System.out.println("�ӵ� ���Դϴ�.");
		} else {
			System.out.println("�ӵ��� �� �� ����");
		}
		
		
		
	}
}







