package com.algo;

import java.util.Scanner;

public class Real3_NumberCardGame_min {
	
	public static void main(String[] args) {
		
		//N, M 입력 받기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int result = 0;
		
		//행렬의 원소들 입력받으면서 동시에 최소, 최대 구하기
		for(int i = 0; i < N; i++) {
			int min = 10001;
			for(int j = 0; j < M ; j++) {
				int x = sc.nextInt();
				min = Math.min(x, min);
			}
			result = Math.max(min, result);
		}
		System.out.println(result);
	}
}
