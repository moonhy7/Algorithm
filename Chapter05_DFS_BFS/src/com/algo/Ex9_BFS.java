package com.algo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Ex9_BFS {
	//1. 배열 선언
	public static boolean[] visited = new boolean[9];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	//bfs함수 정의
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		
		//현재 노드 방문처리
		visited[start] = true;
		//큐가 빌때까지 반복
		while(!q.isEmpty()) {
			//큐에서 하나의 원소를 뽑아 출력
			int x = q.poll();
			System.out.print(x + " ");
			//미방문 인접 노드를 큐에 삽입
			for(int i = 0; i < graph.get(x).size(); i++) {
				int y = graph.get(x).get(i);
				if(!visited[y]) {
					q.offer(y);
					visited[y] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		//초기화
		for(int i = 0; i < 9; i++) {
			graph.add(new ArrayList<Integer>());
		}
		

		//4.노드마다 정보 저장
		graph.get(1).add(2);
		graph.get(1).add(3);
		graph.get(1).add(8);
		
		graph.get(2).add(1);
		graph.get(2).add(7);
		
		graph.get(3).add(1);
		graph.get(3).add(4);
		graph.get(3).add(5);

		graph.get(4).add(3);
		graph.get(4).add(5);

		graph.get(5).add(3);
		graph.get(5).add(4);

		graph.get(6).add(7);

		graph.get(7).add(2);
		graph.get(7).add(6);
		graph.get(7).add(8);

		graph.get(8).add(1);
		graph.get(8).add(7);
		
		bfs(1);
	}
}