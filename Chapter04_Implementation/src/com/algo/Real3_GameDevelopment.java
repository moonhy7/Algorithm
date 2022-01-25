package com.algo;

import java.util.Scanner;

public class Real3_GameDevelopment {
	public static int n, m, x, y, direction;
	
	//0으로 초기화
	public static int[][] d = new int[50][50];
	
	//전체 맵 정보
	public static int[][] arr = new int[50][50];
	
	//북동남서 방향 순
	public static int dx[] = {-1, 0, 1, 0};
	public static int dy[] = {0, 1, 0, -1};
	
	//왼쪽으로 회전
	public static void turn_left() {
		direction -= 1;
		if(direction == -1) {
			direction = 3;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
	
		x = sc.nextInt();
		y = sc.nextInt();
		direction = sc.nextInt();
		d[x][y] = 1; //방문처리
		
		//전체 맵 정보 입력 받기
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//시뮬레이션 시작
		int cnt = 1;
		int turnTime = 0;
		while(true) {
			//왼쪽으로 회전
			turn_left();
			int nx = x + dx[direction];
			int ny = y + dx[direction];
		
			//회전한 이후 정면에 가보지않은 칸 존재하는 경우
			if(d[nx][ny] == 0 && arr[nx][ny] == 0) {
				d[nx][ny] = 1;
				x = nx;
				y = ny; 
				cnt++;
				turnTime = 0;
				continue;
			}
			
			//회전한 이후 가보지않은 칸 없거나 바다
			else turnTime++;
			
			if(turnTime == 4) {
				nx = x - dx[direction];
				ny = y - dy[direction];
				
				//뒤로 이동
				if(arr[nx][ny] == 0) {
					x = nx;
					y = ny;
				}
				
				//뒤가 바다
				else break;
				turnTime = 0;
			}
		}
		
		System.out.println(cnt);
		
	}
}
