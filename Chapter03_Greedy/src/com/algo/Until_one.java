package com.algo;

import java.util.Scanner;

public class Until_one {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�� Ǯ��...
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
		
		//���� Ǯ��
		//���� Ǯ�̴� ��� 1�� ���� �۾��� �����°� �� ��ȿ������!
		//99,3�϶� 99/3=33�� �Ǿ� 66�� ���� �۾��� 66���� �����°� �� ��ȿ�����̶�
		//�ƿ� 66�̶�� ���� ���ؼ� ���ֵ��� �غ���! 
		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = 0;
		
		while(true) { // 19 5
			int target = (n / k) * k; // 15
			result += n - target; // 4
			n = target; // 15
			
			if(n < k) break; // 15 < 5 ? False
			
			//1�����ֱ�
			result += 1;
			n /= k; // n = 15 / 5 = 3
		}
		
		result += (n - 1);
		System.out.println(result);

	}
}
