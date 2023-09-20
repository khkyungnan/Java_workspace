package com.kh.BFS;

import java.util.LinkedList;
import java.util.Queue;
/*
 Graph
 * */
public class Graph {
	private int V; //�׷����� ���� ��
	private LinkedList<Integer>[] adj; //���� ����Ʈ
	
	//�׷��� �ʱ�ȭ
	public Graph(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i) {
			adj[i] = new LinkedList();
		}
	}
	
	//�׷��� ���� �߰�
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	public void BFS(int start) {
		boolean[] vistied = new boolean[V]; //�湮 ���θ� ǥ���ϱ� ���� �迭
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




