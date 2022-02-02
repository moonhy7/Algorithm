package com.algo;

import java.util.ArrayList;

public class Ex8_DFS { 	
	//1.방문여부 Boolean 배열 정의, ArrayList 그래프 정의
	
	//2.DFS 함수 정의
	
	//3.main - 그래프 초기화
	
	//4.노드마다 정보 저장
	
	//5.함수 호출
	
	
	
	//1.방문여부 Boolean 배열 정의, ArrayList 그래프 정의
	public static boolean[] visited = new boolean[9];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();	
	
	//2.DFS 함수 정의
	public static void dfs(int x) {
		//현재 노드 방문처리
		visited[x] = true;
		System.out.print(x + " ");
		//재귀함수 호출
		for(int i = 0; i < graph.get(x).size(); i++) {
			//노드 x에 연결되어있는 노드들을 순차적으로 y에 담음
			int y = graph.get(x).get(i);
			//false이면 아직 미방문이므로 dfs함수처리!
			if(!visited[y]) dfs(y); 
		}
	}
	
	//3.main - 그래프 초기화
	public static void main(String[] args) {
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
		
		//5.함수 호출
		dfs(1);
	}

}