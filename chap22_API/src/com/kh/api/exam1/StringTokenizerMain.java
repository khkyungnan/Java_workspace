package com.kh.api.exam1;

import java.util.StringTokenizer;

public class StringTokenizerMain {
/*
 StringTokenizer Ŭ���� : ���ڿ��� �и��ϴ� �� ���
 						�־��� ������(�⺻:����)�� ������� ���ڿ��� ��ū���� �и�
 * */
	public static void main(String[] args) {
		String text="apple orange banana";
		StringTokenizer tokenizer = new StringTokenizer(text);
		//tokenizer.
		//hasMoreTokens
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
		

	}

}
