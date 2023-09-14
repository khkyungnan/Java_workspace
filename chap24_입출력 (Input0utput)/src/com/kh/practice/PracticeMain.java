package com.kh.practice;

import java.io.FileWriter;
import java.io.IOException;

public class PracticeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void practice1() { //경로설정해서 파일 만들기
		try {
			FileWriter w = new FileWriter("(경로추가)FileName.txt");
			//파일 쓰기
			//파일 닫기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
