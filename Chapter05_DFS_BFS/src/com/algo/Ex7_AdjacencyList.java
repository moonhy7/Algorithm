package com.algo;

import java.util.ArrayList;

public class Ex7_AdjacencyList { 	
	//행이 3개인 인접 리스트 구현
	public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
	
	public static void main(String[] args) {
		//그래프 초기화
		for(int i = 0; i < 3; i++) {
			graph.add(new ArrayList<Node>());
		}
			//노드 0에 연결된 노드들 
			graph.get(0).add(new Node(1, 7));
			graph.get(0).add(new Node(2, 5));
			
			//노드 1에 연결된 노드들
			graph.get(1).add(new Node(0, 7));
			
			//노드 2에 연결된 노드들
			graph.get(2).add(new Node(0, 5));
		
			//출력
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < graph.get(i).size(); j++) {
					graph.get(i).get(j).show(); //출력메서드 호출
				}
				System.out.println();
			}
	}
}

//Node 클래스 생성
class Node {
	
	//필드
	//몇번째 노드, 거리 변수 선언
	private int index;
	private int distance;
	
	//생성자
	public Node(int index, int distance) {
		this.index = index;
		this.distance = distance;
	}
	
	//메서드
	public void show() {
		System.out.print("(" + this.index + ", " + this.distance + ") ");
	}
}