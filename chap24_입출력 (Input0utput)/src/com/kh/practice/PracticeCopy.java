package com.kh.practice;

public class PracticeCopy {

	public static void main(String[] args) {
		
	}
	public void practice1() {
		String inputFile ="C:\\Users\\user1\\Desktop\\love.png";
		String outputFile = "C:\\Users\\user1\\Desktop\\RealLove.jpg";
		
	}
	public void practice2() {
		//�̹������� jpg �Ǵ� png ������ ����ȭ�鿡 ������ �� 
		// ����ȭ�鿡�ٰ� ������ ����
		//���� �ȿ� ������ �̹��� �����ϱ�
		String inputFile ="C:\\Users\\user1\\Desktop\\cute.png";
		String newFolder = "C:\\Users\\user1\\Desktop\\img";
		newFolder.mkdir();
		String outputFile =newFolder+"\\"+"cute1.jpg";
	}
}
