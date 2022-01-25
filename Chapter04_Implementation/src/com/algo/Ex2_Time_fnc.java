package com.algo;

import java.util.Scanner;

public class Ex2_Time_fnc {
	//3이 포함되어있는지 여부 확인하는 메소드
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
		
		//완전탐색유형으로 모든 경우를 다 검사해보는 탐색 방법임
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
