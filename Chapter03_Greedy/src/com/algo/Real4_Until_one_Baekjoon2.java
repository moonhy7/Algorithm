package com.algo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Real4_Until_one_Baekjoon2 {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		//내 풀이...
		int X = sc.nextInt();
		list.add(X);
		
		int cnt = 0;
		while(X>1) {
			if(X % 3 == 0) {
				X /= 3;
				list.add(X);
				cnt++;
			} else if(X % 2 == 0) {
				X/= 2;
				list.add(X);
				cnt++;
			} else {
				X -= 1;
				list.add(X);
			}
		}
		
		System.out.println(cnt);
		
		//모범 답안
		String str = "";
		for(int num : list) {
			str += num + " ";
		}
		System.out.println(str);
		
	}
}
