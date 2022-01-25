package com.algo;

import java.util.Scanner;

public class Ex2_Time {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i <= N; i++) {
			for(int j = 0; j <= 59; j++) {
				for(int k = 0; k <= 59; k++) {
					if(i % 10 == 3 || j % 10 == 3 || (j >= 30 && j <= 39) || k % 10 == 3 || (k >= 30 && k <= 39)) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
