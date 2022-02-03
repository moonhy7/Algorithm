package com.algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//1번째 클래스 : node 클래스
class Node2 {
	//필드
	private int x;
	private int y;
	
	//생성자
	public Node2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//메서드
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}


//2번째 클래스 : bfs 함수와 main함수를 포함한 클래스
public class Real2_BFS_EscapeMaze {
	//입력값 담을 변수 정의
	public static int n, m;
	public static int[][] graph = new int[201][201];
	
	//상하좌우 방향 정의
	public static int dx[] = {-1, 1, 0, 0}; //상하
	public static int dy[] = {0, 0, -1, 1}; //좌우
	
	//bfs 함수
	public static int bfs(int x, int y) {
		//큐 구현
		Queue<Node2> q = new LinkedList<>();
		q.offer(new Node2(x, y));
		
		//반복문
		while(!q.isEmpty()) {
			Node2 node = q.poll(); 
			x = node.getX(); //x, y 값 받아오기
			y = node.getY();
			//현재 위치로부터 상하좌우 확인
			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				//case 1. 범위 벗어남
				if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
				//case 2. 괴물이 있는 경우
				if(graph[nx][ny] == 0) continue;
				//case 3. 처음 방문하는 경우
				if(graph[nx][ny] == 1) {
					graph[nx][ny] = graph[x][y] + 1;
					q.offer(new Node2(nx, ny));
				}
			}
		}
		
		return graph[n - 1][m - 1];
	}
	
	//main 메서드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//입력 받기
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		
		//맵 정보 받기
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for(int j = 0; j < m; j++) {
				graph[i][j] = str.charAt(j) - '0';
			}
		}
		
		//결과 출력
		System.out.println(bfs(0, 0));
	}
}