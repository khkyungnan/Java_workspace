package com.kh.exceptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionMain exmain = new ExceptionMain();
		//exmain.ExceptionA();
		//exmain.ExceptionN();
		exmain.ExceptionF();
	}
	public void ExceptionA() {
		try {
			int result = 10 / 0 ; //0���� ������ �õ�
			System.out.println("Result : " + result);

		} catch (ArithmeticException e) {
			/*
			 ArithmeticException �������� ��� �������� �߻��ϴ� ����
			 ArithmeticException e : e�� �츮�� ������ ������
			 e�� ������ ������ �޼����� getMessage() �� ���޹޴´�.
			 
			 Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.kh.exceptionSample.ExceptionMain.main(ExceptionMain.java:6)

			 * */
			System.out.println("��� �������� ���� �߻��� ����!! "+e.getMessage());
		}
	}

	public void ExceptionN() {
		try {
			String text = null;
			int length = text.length(); 
			//������ ���µ� text�� ���� ���ڿ��� ���̸� ���
			System.out.println("���ڿ� ���� : " + length);
		} catch (NullPointerException abc) {
			System.out.println("���Դϴ�~~~ ��ȣ�� ���ž���^^?");
			//System.out.println(" !!!! �� ���� !!!! " + abc.getMessage());
		}
		
	}

	public void ExceptionF() {
			//050904
		try {
			String juminNumber = "������904";
			int number = Integer.parseInt(juminNumber);
			System.out.println("���� : " + number);
		} catch(NumberFormatException format) {
			System.out.println("���ڸ� �־��ּ���.");
			System.out.println("NumberFormatException �߻� : "+format.getMessage());
		}
	
		
	}
}
