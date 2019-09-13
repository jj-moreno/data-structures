package com.linkedin_learning.intro_to_data_structures;

public class DoublyEndedList {

	private Node head;
	private Node tail;

	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}

	public void insertAtTail(int data) {

		Node newNode = new Node(data);
		if (this.head == null) {
			this.head = newNode;
		}
		if(this.tail != null) {
			this.tail.setNextNode(newNode);
		}
		this.tail = newNode;
	}

	public String toString() {
		String result = "{";
		Node currentNode = this.head;
		while (currentNode != null) {
			result += currentNode.getData() + ", ";
			currentNode = currentNode.getNextNode();
		}
		result += "}";
		return result;
	}
}