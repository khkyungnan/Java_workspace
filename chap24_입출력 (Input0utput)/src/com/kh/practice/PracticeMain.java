package com.kh.practice;

import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void practice1() { //��μ����ؼ� ���� �����
		try {
			FileWriter w = new FileWriter("(����߰�)FileName.txt");
			//���� ����
			//���� �ݱ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
