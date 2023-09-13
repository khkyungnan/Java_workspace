package com.kh.api.exam1;

public class ReplaceMain {

	public static void main(String[] args) {
		//replace1();
	}
	
	public void replace1() {
		String input = "Hello, world!";
		String reInput = input.replace(" ", "-");
		System.out.println(reInput);
		String input2 = reInput.replace("-", "");
		System.out.println("input2 : "+input2);
	}
	
	public void replace2() {
		String input = "Hello World!";
		//World를 Java로 교체
	}

}
