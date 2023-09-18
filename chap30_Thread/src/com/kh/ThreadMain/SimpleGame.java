package com.kh.ThreadMain;

import java.io.IOException;
import java.util.Random;

public class SimpleGame {
	private static boolean isGameOver = false;
	public static void main(String[] args) {
		// ���� ���� ������ ����
		Thread gameThread = new Thread(new GameLoops());
		gameThread.start();
		
		// ���� ���� ���� : �÷��̾ Enter Ű�� ������ ���� ����
		try {
			//����ڰ� Ű����� �Է��� ����Ʈ�� ����
			//����ڰ� EnterŰ�� ���� �� ���� ���α׷� �Ͻ� ����
			System.in.read(); 
		
			isGameOver = true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	class GameLoops implements Runnable{
		
		@Override
		public void run() {
			while(!isGameOver) {
				//���� ���� ����
				int randomValue = new Random().nextInt(10);//������ ���� ����
				System.out.println("������ ���� : " + randomValue);
				
				//���� ���� ���� �ð�
				try {
					Thread.sleep(1000); //1�� ���
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("���� ����");	
			}
		}

	}
}
	
	
	
	
	
