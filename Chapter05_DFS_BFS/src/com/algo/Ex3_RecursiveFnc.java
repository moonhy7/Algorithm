package com.algo;

public class Ex3_RecursiveFnc {
	public static void recursiveFunction() {
		System.out.println("재귀함수를 호출합니다.");
		recursiveFunction();
	}
	
	public static void main(String[] args) {
		recursiveFunction();
	}
}
