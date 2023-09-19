package com.kh.sync;
/*
synchronized 
	다중 스레드 환경에서 동시 접근으로부터 데이터의 일관성을
	보호하기 위해 사용되는 키워드
	하나의 스레드가 특정 블록 또는 메서드를 실행하는 동안 
	다른 스레드가 동일한 블록 또는 메서드에 동시에 접근하지 못하도록 함
	스레드 간 경쟁 조건과 데이터 불일치 문제를 방지하는데 도움
	
	메서드 동기화 : 메서드 전체를 동기화 하는 경우 해당 메서드의 실행 중에는
				 다른 스레드가 해당 메서드에 접근할 수 없음
	 ex) public synchronized void syncMethod(){
	 				//동기화된 메서드 내용
	 	 }
	블록 동기화 : 특정 블록을 동기화하는 경우 블록 내부의 코드만 가능
	 ex) public void someMethod(){
	 		//비동기코드		 
	 		 synchronized () {
	 		 //동기화된 블록 내용
	 		 }
	 		//비동기코드
		}
 * */







public class syncMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
