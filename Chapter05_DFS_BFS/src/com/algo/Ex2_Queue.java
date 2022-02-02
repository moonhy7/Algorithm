package com.algo;

import java.util.LinkedList;
import java.util.Queue;

public class Ex2_Queue {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		//ª¿‘ : offer   ªË¡¶ : poll
		
		//5 2 3 7 d 1 4 d
		q.offer(5);
		q.offer(2);
		q.offer(3);
		q.offer(7);
		q.poll();
		q.offer(1);
		q.offer(4);
		q.poll();
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}	
	}
}
