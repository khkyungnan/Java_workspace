package com.kh.api.exam1;

public class ReplaceMain {

	public static void main(String[] args) {
		//replace1();
		ReplaceMain rm = new ReplaceMain();
		rm.replace2();
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
		//World�� Java�� ��ü
		String reInput = input.replace("World", "Java");
		System.out.println(reInput);
	}
	
	public void replace3() {
		String originName = "Hello world";
		// o�� �����ִ� ���ڿ��� x�� �����ϱ�
	}
	public void replace4() {
		String originString = "The quick brown fox jumps over the lazy dog";
		// fox -> cat
	}
	public void replace5() {
		String originString = "The quick brown fox jumps over the lazy dog";
		// ��� ���� �����ϱ�
	}
	
	public void replaceAll() {
		String originString = "Hello World";
		// replace ��� replaceAll �� �̿��ؼ� ��ҹ��� ���о��� ���ڿ� ġȯ�ϱ�
		String reAllstr = originString.replaceAll("(?i)world", )
	}
}
