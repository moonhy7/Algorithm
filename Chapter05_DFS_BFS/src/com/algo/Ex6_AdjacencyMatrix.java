package com.algo;

public class Ex6_AdjacencyMatrix { 
	// 무한의 비용 설정(연결되어 있지 않는 노드끼리)
	public static final int INF = 999999999;
	
	//2차원리스트를 이용해 인접행렬 표현
	public static int[][] graph = {
		{0, 7, 5},
		{7, 0, INF},
		{5, INF, 0}
	};
	
	public static void main(String[] args) {
		//출력
		for(int i = 0; i < graph.length; i++) {
			for(int j = 0; j < graph[i].length; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
	}
}
