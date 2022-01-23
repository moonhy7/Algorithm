package com.algo;

import java.util.Arrays;
import java.util.Scanner;

public class BigNumberRule {
	
	public static void main(String[] args) {
		
		//입력값 받기
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		//배열 정렬
		Arrays.sort(arr);
		
		//가장 큰 수가 더해지는 개수
		int firstMax = (M / (K + 1)) * K;
		firstMax += M % (K + 1);
		
		//총합 구하기
		int sum = arr[N-1] * firstMax + arr[N-2] * (M - firstMax);
		
		System.out.println(sum);
	}
}
