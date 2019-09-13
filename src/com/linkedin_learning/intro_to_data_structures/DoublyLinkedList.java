package com.linkedin_learning.intro_to_data_structures;

public class DoublyLinkedList {

	private DoublyLinkedNode head;

	public void insertAtHead(int data) {

		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		newNode.setNextNode(this.head);
		if (this.head != null) {
			this.head.setPreviousNode(newNode);
		}
		this.head = newNode;
	}

	public int size() {
		if (this.head == null) {
			return 0;
		}
		int counter = 0;
		DoublyLinkedNode currentNode = this.head;
		while (currentNode != null) {
			counter++;
			currentNode = currentNode.getNextNode();
		}
		return counter;
	}

	public String toString() {
		StringBuilder result = new StringBuilder("{");
		DoublyLinkedNode currentNode = this.head;
		while (currentNode != null) {
			result.append(currentNode);
			result.append(", ");
			currentNode = currentNode.getNextNode();
		}
		result.append("}");
		return result.toString();
	}
}