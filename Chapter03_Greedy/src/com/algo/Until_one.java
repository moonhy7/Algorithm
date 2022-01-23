package com.algo;

import java.util.Scanner;

public class Until_one {
	
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
		
		//교재 풀이
		//나의 풀이는 계속 1을 빼는 작업을 돌리는게 좀 비효율적임!
		//99,3일때 99/3=33이 되어 66을 빼는 작업에 66번을 돌리는게 좀 비효율적이라
		//아예 66이라는 수를 구해서 빼주도록 해보자! 
		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = 0;
		
		while(true) { // 19 5
			int target = (n / k) * k; // 15
			result += n - target; // 4
			n = target; // 15
			
			if(n < k) break; // 15 < 5 ? False
			
			//1더해주기
			result += 1;
			n /= k; // n = 15 / 5 = 3
		}
		
		result += (n - 1);
		System.out.println(result);

	}
}
