package com.linkedin_learning.intro_to_data_structures;

public class DoublyLinkedList {

	private DoublyLinkedNode head;

	public void insertAtHead(int data) {

		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		if (this.head != null) {
			this.head.setPreviousNode(newNode);
			newNode.setNextNode(this.head);
		}
		this.head = newNode;
	}

	public int length() {
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

	public void insertLikeNormal(int data) {
		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		DoublyLinkedNode currentNode = this.head;
		DoublyLinkedNode nextNode = null;

		if (currentNode == null) {
			this.head = newNode;
		} else {
			nextNode = currentNode.getNextNode();
			while (nextNode != null) {
				currentNode = nextNode;
				nextNode = nextNode.getNextNode();
			}
			currentNode.setNextNode(newNode);
			newNode.setPreviousNode(currentNode);
		}
	}

	public void insertForSortedList(int data) {
		DoublyLinkedNode newNode = new DoublyLinkedNode(data);
		DoublyLinkedNode currentNode = this.head;
		DoublyLinkedNode previousNode = null;
		DoublyLinkedNode nextNode = null;
		if (currentNode == null) {
			this.head = newNode;
		} else {
			previousNode = currentNode.getPreviousNode();
			nextNode = currentNode.getNextNode();
			do {
				if (currentNode.getData() > newNode.getData()) {
					newNode.setNextNode(currentNode);
					currentNode.setPreviousNode(newNode);
					if (previousNode == null) {
						this.head = newNode;
						break;
					}
					newNode.setPreviousNode(previousNode);
					previousNode.setNextNode(newNode);
					break;
				}
				if(nextNode == null) {
					newNode.setPreviousNode(currentNode);
					currentNode.setNextNode(newNode);
					break;
				}
				currentNode = nextNode;
				nextNode = currentNode.getNextNode();
				previousNode = currentNode.getPreviousNode();
			} while(currentNode != null);
		}
	}
}
