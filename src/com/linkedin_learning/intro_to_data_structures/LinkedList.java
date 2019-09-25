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
				System.out.println("Data found");
				return currentNode;
			}
			currentNode = currentNode.getNextNode();
		}
		System.out.println("Data not found");
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

	public void insertLikeNormal(int data) {

		Node newNode = new Node(data);
		Node currentNode = this.head;
		Node nextNode = null;
		if ( currentNode == null) {
			this.head = newNode;
		} else {
			nextNode = currentNode.getNextNode();
			while (nextNode != null) {
				currentNode = nextNode;
				nextNode = nextNode.getNextNode();
			}
			currentNode.setNextNode(newNode);
		}
	}

	public void insertForSortedList(int data) {
		Node newNode = new Node(data);
		Node currentNode = this.head;
		Node nextNode = null;
		if (currentNode == null) {
			this.head = newNode;
		} else if (currentNode.getData() > newNode.getData()) {
			newNode.setNextNode(currentNode);
			this.head = newNode;
		} else {
			nextNode = currentNode.getNextNode();

			while (nextNode != null) {
				if (nextNode.getData() > data) {
					newNode.setNextNode(nextNode);
					break;
				}
				currentNode = nextNode;
				nextNode = nextNode.getNextNode();
			}
			currentNode.setNextNode(newNode);
		}
	}
}
