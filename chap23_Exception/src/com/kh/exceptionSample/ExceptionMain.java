package com.kh.exceptionSample;

public class ExceptionMain {

	public static void main(String[] args) {
		ExceptionMain exmain = new ExceptionMain();
		exmain.ExceptionA();
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
}
