package com.algo;

import java.util.Scanner;

public class Real3_GameDevelopment {
	public static int n, m, x, y, direction;
	
	//0���� �ʱ�ȭ
	public static int[][] d = new int[50][50];
	
	//��ü �� ����
	public static int[][] arr = new int[50][50];
	
	//�ϵ����� ���� ��
	public static int dx[] = {-1, 0, 1, 0};
	public static int dy[] = {0, 1, 0, -1};
	
	//�������� ȸ��
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
		d[x][y] = 1; //�湮ó��
		
		//��ü �� ���� �Է� �ޱ�
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//�ùķ��̼� ����
		int cnt = 1;
		int turnTime = 0;
		while(true) {
			//�������� ȸ��
			turn_left();
			int nx = x + dx[direction];
			int ny = y + dx[direction];
		
			//ȸ���� ���� ���鿡 ���������� ĭ �����ϴ� ���
			if(d[nx][ny] == 0 && arr[nx][ny] == 0) {
				d[nx][ny] = 1;
				x = nx;
				y = ny; 
				cnt++;
				turnTime = 0;
				continue;
			}
			
			//ȸ���� ���� ���������� ĭ ���ų� �ٴ�
			else turnTime++;
			
			if(turnTime == 4) {
				nx = x - dx[direction];
				ny = y - dy[direction];
				
				//�ڷ� �̵�
				if(arr[nx][ny] == 0) {
					x = nx;
					y = ny;
				}
				
				//�ڰ� �ٴ�
				else break;
				turnTime = 0;
			}
		}
		
		System.out.println(cnt);
		
	}
}
