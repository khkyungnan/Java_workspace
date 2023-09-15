package com.kh.collection.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PracticeCollection {

	public static void main(String[] args) {
		PracticeCollection pc = new PracticeCollection();
		pc.practiceList();
		pc.practiceSet();
	}
	public void practiceList() {
		List<String> pList = new ArrayList<>();
		//String add 해보고 포문 출력 중복된 값 add 해야함
		pList.add("가");
		pList.add("나");
		pList.add("다");
		pList.add("가");
		
		for(String a : pList) {
			System.out.println(a);
		}
	}
	public void practiceSet() {
		Set<String> pSet = new HashSet<>();
		//String add 해보고 포문 출력 중복된 값 add 해야함
		pSet.add("a");
		pSet.add("b");
		pSet.add("c");
		pSet.add("a");
		for(String s : pSet) {
			System.out.println(s);
		}
	}

}
