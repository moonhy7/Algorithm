package com.algo;

public class Ex4_RecursiveFnc2 {
	
	//continue문 : 해당 루프내의 그 조건만 지나치고 다음 조건식 진행 (가장 작은 범주?)
	//break문 : 해당 루프 자체를 빠져나감
	//return문 : 해당루프를 감싸고 있는 메서드까지 종료됨
	
	public static void recursiveFunction(int i) {
		if (i == 4) return; //i가 100이면 종료
		System.out.println(i + "번째 재귀함수에서 " + (i + 1) + "를 호출합니다.");
		recursiveFunction(i+1);
		System.out.println(i + "번째 재귀함수를 종료합니다.");
	}
	
	public static void main(String[] args) {
		recursiveFunction(1);
	}
}
