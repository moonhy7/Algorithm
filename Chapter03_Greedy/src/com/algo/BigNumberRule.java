package com.algo;

import java.util.Arrays;
import java.util.Scanner;

public class BigNumberRule {
	
	public static void main(String[] args) {
		
		//�Է°� �ޱ�
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		//�迭 ����
		Arrays.sort(arr);
		
		//���� ū ���� �������� ����
		int firstMax = (M / (K + 1)) * K;
		firstMax += M % (K + 1);
		
		//���� ���ϱ�
		int sum = arr[N-1] * firstMax + arr[N-2] * (M - firstMax);
		
		System.out.println(sum);
	}
}
