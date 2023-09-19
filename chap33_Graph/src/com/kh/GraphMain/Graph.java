package com.kh.GraphMain;

import java.util.LinkedList;
/**/
public class Graph {
	private int V; //그래프의 노드 수
	private LinkedList<Integer>[] adjList; //인접 리스트 배열
	
	//그래프 생성자
	public Graph(int ver) {
		V = ver;
		adjList = new LinkedList[ver];
		for(int i = 0; i < ver; i++) {
			adjList[i] = new LinkedList<>();
		}
	}
	
	//노드를 그래프에 추가
	public void addEdge(int source, int des) {
		adjList[source].add(des);
	}
	
	//그래프 탐색(깊이 우선 탐색)
	public void DFS(int startNode) {
		boolean[] visited = new boolean[v];
		
	}
}





