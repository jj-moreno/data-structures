package com.linkedin_learning.intro_to_data_structures;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		
//		linkedList.insertAtHead(8);
//		linkedList.insertAtHead(7);
//		linkedList.insertAtHead(5);
//		linkedList.insertAtHead(3);
//		linkedList.insertAtHead(2);
		System.out.println(linkedList);
		System.out.println("Length: " + linkedList.length());
//		linkedList.deleteAtHead();
		System.out.println(linkedList);
		System.out.println("Length: " + linkedList.length());
		Node node1 = linkedList.find(3);
		System.out.println("Found: " +node1);
		
		linkedList.insertCallForSortedLinkedList(6);
		System.out.println(linkedList);
		System.out.println("Length: " + linkedList.length());
		
		linkedList.insertCallForSortedLinkedList(7);
		System.out.println(linkedList);
		System.out.println("Length: " + linkedList.length());
	}

}
