package com.algo;

import java.util.ArrayList;

public class Ex7_AdjacencyList { 	
	//���� 3���� ���� ����Ʈ ����
	public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
	
	public static void main(String[] args) {
		//�׷��� �ʱ�ȭ
		for(int i = 0; i < 3; i++) {
			graph.add(new ArrayList<Node>());
		}
			//��� 0�� ����� ���� 
			graph.get(0).add(new Node(1, 7));
			graph.get(0).add(new Node(2, 5));
			
			//��� 1�� ����� ����
			graph.get(1).add(new Node(0, 7));
			
			//��� 2�� ����� ����
			graph.get(2).add(new Node(0, 5));
		
			//���
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < graph.get(i).size(); j++) {
					graph.get(i).get(j).show(); //��¸޼��� ȣ��
				}
				System.out.println();
			}
	}
}

//Node Ŭ���� ����
class Node {
	
	//�ʵ�
	//���° ���, �Ÿ� ���� ����
	private int index;
	private int distance;
	
	//������
	public Node(int index, int distance) {
		this.index = index;
		this.distance = distance;
	}
	
	//�޼���
	public void show() {
		System.out.print("(" + this.index + ", " + this.distance + ") ");
	}
}