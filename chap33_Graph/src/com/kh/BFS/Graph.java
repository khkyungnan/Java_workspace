package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;
/*
 Graph
 * */
public class Graph {
	private int V; //그래프의 정점 수
	private LinkedList<Integer>[] adj; //인접 리스트
	
	//그래프 초기화
	public Graph(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i) {
			adj[i] = new LinkedList();
		}
	}
	
	//그래프 간선 추가
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	public void BFS(int start) {
		boolean[] vistied = new boolean[V]; //방문 여부를 표시하기 위한 배열
		Queue<Integer> queue = new LinkedList<>();
		
		vistied[start] = true;
		queue.add(start);
		
		while(!queue.isEmpty()) {
			start = queue.poll();
			System.out.println(start + " ");
			
			for(Integer neighbor : adj[start]) {
				if(!vistied[neighbor]) {
					vistied[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
	}
}




