package com.algo;

import java.util.Scanner;

public class Ex1_Up_Down_Left_Right {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine(); //버퍼 비우기
		String[] plans = sc.nextLine().split(" "); //정해지지 않은 개수만큼 입력을 받을 때 사용
		int x = 1, y = 1; //초기 좌표
		
		//배열 선언
		int[] dx = {0, 0, -1, 1}; // 연산할 칸 수를 배열에 담기
		int[] dy = {-1, 1, 0, 0};
		char[] movetypes = {'L', 'R', 'U', 'D'};// 방향 키워드도배열에 담아두기
		//방향 배열과 칸 배열은 서로 같은 인덱스일 때 같은 의미여야함
		
		
		//이동
		for(int i = 0; i < plans.length; i++) { // 입력받은 방향키 개수 만큼 돈다.
			char plan = plans[i].charAt(0); // char 타입으로 변형
			int nx = 1, ny = 1;
			
			for(int j = 0; j < 4; j++) { // 방향키가 뭔지에 따라 연산을 진행
				if(plan == movetypes[j]) { 
					nx = x + dx[j];
					ny = y + dy[j];
				}
			}
			
			//지도를 벗어나면 무시하도록 조건 코드 생성
			//continue는 다시 for문으로 들어감
			if(nx < 1 || nx > N || ny < 1 || ny > N) continue;
			
			x = nx;
			y = ny;
		}
		
		System.out.println(x + " " + y);
	}
	
}
