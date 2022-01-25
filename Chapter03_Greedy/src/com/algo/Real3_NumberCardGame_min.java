package com.algo;

import java.util.Scanner;

public class Real3_NumberCardGame_min {
	
	public static void main(String[] args) {
		
		//N, M �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int result = 0;
		
		//����� ���ҵ� �Է¹����鼭 ���ÿ� �ּ�, �ִ� ���ϱ�
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
