package com.linkedin_learning.intro_to_data_structures;

public class Node {

	private int data;
	private Node nextNode;
	
	public Node(int data) {
		this.data = data;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public Node getNextNode() {
		return nextNode;
	}
	
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	public String toString() {
		return Integer.toString(this.data);
	}
}
