package com.algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//1��° Ŭ���� : node Ŭ����
class Node2 {
	//�ʵ�
	private int x;
	private int y;
	
	//������
	public Node2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//�޼���
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}


//2��° Ŭ���� : bfs �Լ��� main�Լ��� ������ Ŭ����
public class Real2_BFS_EscapeMaze {
	//�Է°� ���� ���� ����
	public static int n, m;
	public static int[][] graph = new int[201][201];
	
	//�����¿� ���� ����
	public static int dx[] = {-1, 1, 0, 0}; //����
	public static int dy[] = {0, 0, -1, 1}; //�¿�
	
	//bfs �Լ�
	public static int bfs(int x, int y) {
		//ť ����
		Queue<Node2> q = new LinkedList<>();
		q.offer(new Node2(x, y));
		
		//�ݺ���
		while(!q.isEmpty()) {
			Node2 node = q.poll(); 
			x = node.getX(); //x, y �� �޾ƿ���
			y = node.getY();
			//���� ��ġ�κ��� �����¿� Ȯ��
			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				//case 1. ���� ���
				if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
				//case 2. ������ �ִ� ���
				if(graph[nx][ny] == 0) continue;
				//case 3. ó�� �湮�ϴ� ���
				if(graph[nx][ny] == 1) {
					graph[nx][ny] = graph[x][y] + 1;
					q.offer(new Node2(nx, ny));
				}
			}
		}
		
		return graph[n - 1][m - 1];
	}
	
	//main �޼���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�Է� �ޱ�
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		
		//�� ���� �ޱ�
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for(int j = 0; j < m; j++) {
				graph[i][j] = str.charAt(j) - '0';
			}
		}
		
		//��� ���
		System.out.println(bfs(0, 0));
	}
}