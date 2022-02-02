package com.algo;

public class Ex6_AdjacencyMatrix { 
	// ������ ��� ����(����Ǿ� ���� �ʴ� ��峢��)
	public static final int INF = 999999999;
	
	//2��������Ʈ�� �̿��� ������� ǥ��
	public static int[][] graph = {
		{0, 7, 5},
		{7, 0, INF},
		{5, INF, 0}
	};
	
	public static void main(String[] args) {
		//���
		for(int i = 0; i < graph.length; i++) {
			for(int j = 0; j < graph[i].length; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
	}
}
