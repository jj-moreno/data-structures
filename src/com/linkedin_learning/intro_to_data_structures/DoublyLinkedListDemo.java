package com.linkedin_learning.intro_to_data_structures;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		DoublyLinkedList integers = new DoublyLinkedList();
		
		integers.insertForSortedList(9);
		integers.insertAtHead(5);
		System.out.println("Array 1: " + integers);
		System.out.println("Length: " + integers.length());
		
		integers.insertForSortedList(7);
		System.out.println("Array 2: " + integers);
		System.out.println("Length: " + integers.length());
		
		integers.insertForSortedList(11);
		System.out.println("Array 3: " + integers);
		System.out.println("Length: " + integers.length());
		
		integers.insertAtHead(10);
		integers.insertAtHead(2);
		integers.insertAtHead(12);
		integers.insertAtHead(19);
		integers.insertAtHead(20);
		System.out.println("Array 4: " + integers);
		System.out.println("Length: " + integers.length());
		
		integers.insertLikeNormal(4);
		System.out.println("Array 5: " + integers);
		System.out.println("Length: " + integers.length());
	}

}
