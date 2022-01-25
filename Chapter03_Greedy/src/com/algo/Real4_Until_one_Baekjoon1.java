package com.algo;

import java.util.Scanner;

public class Real4_Until_one_Baekjoon1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//내 풀이...
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int cnt = 0;
		while(N>1) {
			if(N % K == 0) {
				N /= K;
				cnt++;
			} else {
				N -= 1;
				cnt++;
			}
		}
		System.out.println(cnt);
		
		//모범 답안
		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = 0;
		
	}
}
