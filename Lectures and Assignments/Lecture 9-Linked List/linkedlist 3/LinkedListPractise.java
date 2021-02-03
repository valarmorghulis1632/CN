package linkedlist;

import java.util.Scanner;

import javax.sound.sampled.ReverbType;

public class LinkedListPractise {

	
	Node<Integer> reverseLinkedListUsingRec(Node<Integer> head){
		if(head==null||head.next==null){
			return head;
		}
		
		Node<Integer> finalAns= reverseLinkedListUsingRec(head.next);
		head.next.next =head;
		head.next = null;
		return finalAns;
	}
	
	
	
	
	
	
	
	
	
	static Node<Integer> prepareLinkedList() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter data");
		int data = s.nextInt();
		Node<Integer> head = null;
		Node<Integer> tail = null;
		while (data != -1) {
			Node<Integer> nyaNode = new Node<>(data);
			if (head == null) {
				head = nyaNode;
				tail = nyaNode;
			} else {
				tail.next = nyaNode;
				tail = tail.next;
			}
			data = s.nextInt();
		}

		return head;
	}

	static <E> void printLinkedList(Node<E> head) {

		while (head != null) {
			System.out.print(head.data + "--->");
			head = head.next;
		}

	}
	
	
	
	
	
	

	<E> void printUsingRecursion(Node<E> head) {
		if (head == null) {
			return;
		}
		System.out.println(head.data);
		Node<E> temp = head.next;
		printUsingRecursion(temp);
	}

	static <T> Node<T> insertAtithPos(Node<T> head, T data, int position) {

		Node<T> nyaNode = new Node<>(data);
		if (position == 0) {
			nyaNode.next = head;
			return nyaNode;
		}
		Node<T> temp = head;
		while (position > 1) {
			position--;
			temp = temp.next;
		}
		nyaNode.next = temp.next;
		temp.next = nyaNode;
		return head;
	}

	
	Node<Integer> merge(Node<Integer> head1, Node<Integer> head2){
		
		
		Node<Integer> resultHead=null;
		Node<Integer> resultTail=null;
		
		if(head1.data.compareTo(head2.data)>0){
			resultHead = head2;
			resultTail = head2;
			head2=head2.next;
		}else{
			resultHead = head1;
			resultTail= head1;
			head1=head1.next;
		}
		
		
		while(head1!=null && head2!=null){
			if(head1.data>head2.data){
				resultTail.next = head2;
				head2=head2.next;
			}else{	
				resultTail.next= head1;
				head1=head1.next;
			}
			
			resultTail=resultTail.next;
		}
		
		resultTail.next = head1==null?head2:head1;
		
		
		
		return resultHead;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 1 2 3 4 5 6 -1

	public static void main(String[] args) {

		Node<Integer> head = prepareLinkedList();

		printLinkedList(head);
		head = insertAtithPos(head, 7, 0);
		printLinkedList(head);

		// Node node1 = new Node(10);
		// node1.next = new Node(20);
		// node1.next.next = new Node(30);
		// node1.next.next.next = new Node(40);

	}
}
