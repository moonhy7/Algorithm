package com.algo;

public class Ex4_RecursiveFnc2 {
	
	//continue�� : �ش� �������� �� ���Ǹ� ����ġ�� ���� ���ǽ� ���� (���� ���� ����?)
	//break�� : �ش� ���� ��ü�� ��������
	//return�� : �ش������ ���ΰ� �ִ� �޼������ �����
	
	public static void recursiveFunction(int i) {
		if (i == 4) return; //i�� 100�̸� ����
		System.out.println(i + "��° ����Լ����� " + (i + 1) + "�� ȣ���մϴ�.");
		recursiveFunction(i+1);
		System.out.println(i + "��° ����Լ��� �����մϴ�.");
	}
	
	public static void main(String[] args) {
		recursiveFunction(1);
	}
}
