package com.kh.InterfaceSample;

public class InterFaceMain {

	public static void main(String[] args) {
		/*
		MyInterface myin ;
		myin = new MyInterface();
	    MyInterface ������ = new MyInterface(); 
	                         ��ü�� �ƴϱ� ������ ������ �� ����
		*/
		MyInterface myin = new MyClass();
		myin.doMyInterFace();

	}

}
