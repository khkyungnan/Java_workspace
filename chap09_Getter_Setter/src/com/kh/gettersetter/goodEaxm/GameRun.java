package com.kh.gettersetter.goodEaxm;

public class GameRun {

	public static void main(String[] args) {
		// 플레이 생성자 만들기
		GoodPlayer player1 = new GoodPlayer();
		
		
		player1.setName("KH");
		//문제점 : 0-10 = -10
		
		
		player1.setHealth(-10);
		player1.isValidHealth();
		
		
		
		player1.setAttackPower(-20);
		
		player1.displayInfo();
		/*
		GoodPlayer player2 = new GoodPlayer();
		player2.setName("ㅎㅎㅎ");
		player2.setHealth(80);
		player2.setAttackPower(10);
		
		player2.displayInfo();
		
		System.out.println("attack!!!! 후");
		
		*/
	}

}
