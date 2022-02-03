package com.algo;

import java.util.Scanner;

public class Real1_DFS_FreezeDrinks {
	//1.����, �迭 ����
	public static int n, m;
	public static int[][] graph = new int[1000][1000];
	
	//2.dfs �Լ� ����
	public static boolean dfs(int x, int y) {
		//���� ����� �ٷ� ����!
		if(x<= -1 || x >= n || y <= -1 || y >= m) {
			return false;
		}
		//���� ����� �ʾҰ� -> ��� �湮���Ѱ�쿡��
		if(graph[x][y] == 0) {
			//�湮ó������!!
			graph[x][y] = 1;
			//�����¿� ��ġ ��θ� ����Լ� ȣ��
			dfs(x - 1, y);
			dfs(x + 1, y);
			dfs(x, y - 1);
			dfs(x, y + 1);
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		//3.N, M, �� ���� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine(); //������ �Է¹ް� str�� ����
			for(int j = 0; j < m; j++) {
				//str���� 0 ~ m-1��° ������ ���� ���ʴ�� �迭�� ����
				graph[i][j] = str.charAt(j) - '0'; 
			}
		}
		
		//4.�����ä���
		int result = 0; //���̽�ũ�� ������ ���� ����
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(dfs(i, j)) {
					result++;
					System.out.println("i = " + i + ", j = " + j);
				}
			}
		}
		
		//5.�������
		System.out.println(result);
	}
}