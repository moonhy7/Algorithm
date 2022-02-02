package com.algo;

import java.util.ArrayList;

public class Ex8_DFS { 	
	//1.�湮���� Boolean �迭 ����, ArrayList �׷��� ����
	
	//2.DFS �Լ� ����
	
	//3.main - �׷��� �ʱ�ȭ
	
	//4.��帶�� ���� ����
	
	//5.�Լ� ȣ��
	
	
	
	//1.�湮���� Boolean �迭 ����, ArrayList �׷��� ����
	public static boolean[] visited = new boolean[9];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();	
	
	//2.DFS �Լ� ����
	public static void dfs(int x) {
		//���� ��� �湮ó��
		visited[x] = true;
		System.out.print(x + " ");
		//����Լ� ȣ��
		for(int i = 0; i < graph.get(x).size(); i++) {
			//��� x�� ����Ǿ��ִ� ������ ���������� y�� ����
			int y = graph.get(x).get(i);
			//false�̸� ���� �̹湮�̹Ƿ� dfs�Լ�ó��!
			if(!visited[y]) dfs(y); 
		}
	}
	
	//3.main - �׷��� �ʱ�ȭ
	public static void main(String[] args) {
		for(int i = 0; i < 9; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		//4.��帶�� ���� ����
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
		
		//5.�Լ� ȣ��
		dfs(1);
	}

}