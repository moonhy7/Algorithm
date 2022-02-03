package com.algo;

import java.util.Scanner;

public class Real1_DFS_FreezeDrinks {
	//1.변수, 배열 선언
	public static int n, m;
	public static int[][] graph = new int[1000][1000];
	
	//2.dfs 함수 선언
	public static boolean dfs(int x, int y) {
		//범위 벗어나면 바로 종료!
		if(x<= -1 || x >= n || y <= -1 || y >= m) {
			return false;
		}
		//범위 벗어나지 않았고 -> 노드 방문안한경우에는
		if(graph[x][y] == 0) {
			//방문처리부터!!
			graph[x][y] = 1;
			//상하좌우 위치 모두를 재귀함수 호출
			dfs(x - 1, y);
			dfs(x + 1, y);
			dfs(x, y - 1);
			dfs(x, y + 1);
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		//3.N, M, 맵 정보 입력 받기
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine(); //한줄을 입력받고 str에 대입
			for(int j = 0; j < m; j++) {
				//str에서 0 ~ m-1번째 까지의 수를 차례대로 배열에 대입
				graph[i][j] = str.charAt(j) - '0'; 
			}
		}
		
		//4.음료수채우기
		int result = 0; //아이스크림 개수를 담을 변수
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(dfs(i, j)) {
					result++;
					System.out.println("i = " + i + ", j = " + j);
				}
			}
		}
		
		//5.정답출력
		System.out.println(result);
	}
}