package com.algo;

import java.util.Scanner;

public class NumberCardGame {
	
	public static void main(String[] args) {
		
		//입력 받기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] arr = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		//각 행의 최솟값이 들어있는 배열 생성
		int[] minArr = new int[N];
		
		for(int i = 0; i < N; i++) {
			minArr[i] = arr[i][0];
			for(int j = 0; j < M; j++) {
				if(minArr[i] > arr[i][j]) {
					minArr[i] = arr[i][j];
				}
			}
		}
		
		//minArr에서 가장 큰 수 찾기
		int max = minArr[0];
		for(int i = 0; i < N; i++) {
			if(max < minArr[i]) {
				max = minArr[i];
			}
		}
		
		System.out.println(max);

	}
}
