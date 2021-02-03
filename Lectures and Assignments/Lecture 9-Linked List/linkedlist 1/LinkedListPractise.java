package linkedlist;

import java.util.Scanner;

public class LinkedListPractise {
	/*
	 * 
	 * Time Complexity: O(n2)
	 */

	Node prepareLinkedList() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter data");
		int data = s.nextInt();
		Node head = null;

		while (data != -1) {
			Node nyaNode = new Node(data);
			if (head == null) {
				head = nyaNode;
			} else {
				Node temp = head;
				while (temp.next != null) {
					temp = temp.next;
				}
				temp.next = nyaNode;
			}
			System.out.println("Enter data: ");
			data = s.nextInt();
		}
		return head;
	}

	/*
	 * O(n)
	 */
	static Node prepareLinkedListBetter() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter data");
		int data = s.nextInt();
		Node head = null;
		Node tail = null;

		while (data != -1) {
			Node nyaNode = new Node(data);
			if (head == null) {
				tail = nyaNode;
				head = nyaNode;
			} else {
				tail.next = nyaNode;
				tail = tail.next;
			}
			System.out.println("Enter data: ");
			data = s.nextInt();
		}
		return head;
	}

	static <T> void printLinkedList(Node<T> head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	
	
	
<T> Node<T>	insertAtIthPos(Node<T> head, T data, int position){
		Node<T> nyaNode = new Node<T>(data);
		if(position==0){
			nyaNode.next = head;
			return nyaNode;
		}
		
		Node<T> temp = head;
		while(position>1){
			position--;
			temp=temp.next;
		}
		nyaNode.next = temp.next;
		temp.next = nyaNode;
		
		return head;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Node<Integer> head = new Node<Integer>(10);
		head.next = new Node<>(2);
		head.next.next = new Node<>(3);
		Node head = prepareLinkedListBetter();
		printLinkedList(head);
	}

}
