package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
/*
 StringTokenizer 클래스 : 문자열을 분리하는 데 사용
 						주어진 구분자(기본:공백)를 기분으로 문자열을 토큰으로 분리
 * */
	public static void main(String[] args) {
		StringTokenizerMain stm = new StringTokenizerMain();
		//stm.STExam();
		stm.stExam2();
	}
	public void STExam() {
		String text="apple orange banana";
		StringTokenizer tokenizer = new StringTokenizer(text);
		//tokenizer.
		//hasMoreTokens
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
	}

	public void stExam2() {
		String text = "apple,banana,grape,orange";
		StringTokenizer tokenizer = new StringTokenizer(text, ",");
		
		while(tokenizer.hasMoreTokens()) {
			String fruit = tokenizer.nextToken();
			System.out.println(fruit);
		}
	}
}





