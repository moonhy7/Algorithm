package com.algo;

import java.util.Scanner;

public class Ex2_Time_fnc {
	//3�� ���ԵǾ��ִ��� ���� Ȯ���ϴ� �޼ҵ�
	public static boolean check(int h, int m, int s) {
		if(h % 10 == 3 || m % 10 == 3 || m / 10 == 3 || s % 10 == 3 || s / 10 == 3) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		
		//����Ž���������� ��� ��츦 �� �˻��غ��� Ž�� �����
		for(int i = 0; i <= N; i++) {
			for(int j = 0; j <= 59; j++) {
				for(int k = 0; k <= 59; k++) {
					if(check(i, j, k)) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
