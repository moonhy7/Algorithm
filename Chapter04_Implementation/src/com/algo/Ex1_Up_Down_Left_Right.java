package com.algo;

import java.util.Scanner;

public class Ex1_Up_Down_Left_Right {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine(); //���� ����
		String[] plans = sc.nextLine().split(" "); //�������� ���� ������ŭ �Է��� ���� �� ���
		int x = 1, y = 1; //�ʱ� ��ǥ
		
		//�迭 ����
		int[] dx = {0, 0, -1, 1}; // ������ ĭ ���� �迭�� ���
		int[] dy = {-1, 1, 0, 0};
		char[] movetypes = {'L', 'R', 'U', 'D'};// ���� Ű���嵵�迭�� ��Ƶα�
		//���� �迭�� ĭ �迭�� ���� ���� �ε����� �� ���� �ǹ̿�����
		
		
		//�̵�
		for(int i = 0; i < plans.length; i++) { // �Է¹��� ����Ű ���� ��ŭ ����.
			char plan = plans[i].charAt(0); // char Ÿ������ ����
			int nx = 1, ny = 1;
			
			for(int j = 0; j < 4; j++) { // ����Ű�� ������ ���� ������ ����
				if(plan == movetypes[j]) { 
					nx = x + dx[j];
					ny = y + dy[j];
				}
			}
			
			//������ ����� �����ϵ��� ���� �ڵ� ����
			//continue�� �ٽ� for������ ��
			if(nx < 1 || nx > N || ny < 1 || ny > N) continue;
			
			x = nx;
			y = ny;
		}
		
		System.out.println(x + " " + y);
	}
	
}
