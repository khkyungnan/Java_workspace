package com.kh.GraphMain;

import java.util.LinkedList;

public class Graph {
	private int V; //�׷����� ��� ��
	private LinkedList<Integer>[] adjList; //���� ����Ʈ �迭
	
	//�׷��� ������
	public Graph(int ver) {
		V = ver;
		adjList = new LinkedList[ver];
		for(int i = 0; i < ver; i++) {
			adjList[i] = new LinkedList<>();
		}
	}
	
	//��带 �׷����� �߰�
	public void addEdge(int source, int des)
}





