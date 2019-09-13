package com.linkedin_learning.intro_to_data_structures;

public class LinkedList {

	private Node head;

	public void insertAtHead(int data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}

	public int length() {
		int currentLength = 0;
		Node currentNodeHead = this.head;
		while (currentNodeHead != null) {
			currentLength++;
			currentNodeHead = currentNodeHead.getNextNode();
		}
		return currentLength;
	}

	public void deleteAtHead() {
		this.head = this.head.getNextNode();
	}

	public Node find(int data) {
		Node currentNode = this.head;
		while (currentNode != null) {
			if (currentNode.getData() == data) {
				return currentNode;
			}
			currentNode = currentNode.getNextNode();
		}
		return null;
	}

	public String toString() {

		String result = "{";
		Node currentNodeHead = this.head;

		while (currentNodeHead != null) {
			result += currentNodeHead.toString() + ",";
			currentNodeHead = currentNodeHead.getNextNode();
		}
		result += "}";
		return result;

	}

	public void insert(int data) {
		Node newNode = new Node(data);
		Node currentNode = this.head;
		Node nextNode = currentNode.getNextNode();
		while (nextNode != null) {

		}
		currentNode.setNextNode(newNode);
	}

	public void insertCallForSortedLinkedList(int data) {
		Node newNode = new Node(data);
		Node currentNode = null;
		Node nextNode = null;
		if (this.head == null) {
			insertAtHead(data);
		} else {
			currentNode = this.head;
			nextNode = currentNode.getNextNode();

			while (nextNode != null) {
				if (nextNode.getData() > data) {
					newNode.setNextNode(nextNode);
					currentNode.setNextNode(newNode);
					break;
				}
				currentNode = nextNode;
				nextNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(newNode);
		}
	}
}
