package com.algo;

import java.util.Stack;

public class Ex1_stack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		
		//ª¿‘ : push   ªË¡¶ : pop
		
		//5 2 3 7 d 1 4 d
		s.push(5);
		s.push(2);
		s.push(3);
		s.push(7);
		s.pop();
		s.push(1);
		s.push(4);
		s.pop();
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}	
	}
}
