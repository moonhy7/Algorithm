package com.algo;

import java.util.Scanner;

public class Real2_RoyalNight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String xy = sc.nextLine();
		
		//�Է¹��� �� -> ���� �����ͷ� ��ȯ
		int x = xy.charAt(1) - '0';
		int y = xy.charAt(0) - 'a' + 1;
		
		//���� ����
		int[] dx = {-2, -2, -1, 1, 2, 2, -1, 1};
		int[] dy = {-1, 1, 2, 2, 1, -1, -2, -2};
		
		//�̵��� �������� ���� Ȯ��
		int cnt = 0;
		for(int i = 0; i < 8; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			
			if(nextX >= 1 && nextX <= 8 && nextY >= 1 && nextY <= 8) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
}
