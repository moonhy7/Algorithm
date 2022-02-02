package com.algo;

public class Ex5_Factorial { //n! ���ϱ�
	public static int factorialIterative(int n) { // �ݺ��Լ�
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	public static int factorialReculsive(int n) {// ����Լ�
		if(n <= 1) return 1; // n�� 1���ϸ� f(1) = 1! = 1
		return n * factorialIterative(n-1);
		// 5*f(4) = 5*4*f(3) = 5*4*3*f(2) = 5*4*3*2*f(1) = 5*4*3*2*1 = 120
	}
	
	public static void main(String[] args) {
		System.out.println("�ݺ������� ���� : " + factorialIterative(5));
		System.out.println("�ݺ������� ���� : " + factorialReculsive(5));
	}
}
