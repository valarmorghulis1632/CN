package linkedlist;

import java.util.Scanner;

public class LinkedListPractise {
	/*
	 * 
	 * Time Complexity: O(n2)
	 */

Node<Integer> bubbleSort(Node<Integer> head){
		
		int n = length(head);
		for(int i =0;i<n-1;i++){
			Node<Integer> prev = null;
			Node<Integer> curr = head;
			for(int j =0;j<n-i-1;j++){

				if(curr.data.compareTo(curr.next.data)<0){
					prev = curr;
					curr = curr.next;
				}else{
					if(prev==null){
						Node<Integer> fwd = head.next;
						curr.next = fwd.next;
						prev = fwd;
						fwd.next = curr;
						head = prev;			
					}else{
						Node<Integer> fwd = curr.next;
						curr.next = fwd.next;
						prev = fwd;
						fwd.next = curr;
					}
				}
			}
		}
		
		
}
	static Node<Integer> prepareLinkedList() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter data");
		int data = s.nextInt();
		Node<Integer> head = null;
		while (data != -1) {
			Node<Integer> nyaNode = new Node<>(data);
			if (head == null) {
				head = nyaNode;
			} else {
				Node<Integer> temp = head;
				while (temp.next != null) {
					temp = temp.next;
				}		
				temp.next = nyaNode;
			}
			System.out.println("Enter data: ");
			data = s.nextInt();
		}
		//s.close();
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
			System.out.print(head.data+"-->");
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
	
	
	




 
  <T> Node<T>  reveseListUsingRecursion(Node<T> head){
	  if(head==null||head.next==null){
		 return head; 
	  }
	  
	 Node<T> finalAns =  reveseListUsingRecursion(head.next);
	 head.next.next = head;
	 head.next =null;
	 
	 return finalAns;
	 
 }
	
  
  
  
  
  
	
	// 1 2 3 4 5 6 -1 1 2 3 4 5 6 -1

	public static void main(String[] args) {
		
		Node<Integer> head = new Node<>(40);
		head.next = new Node<>(30);
		head.next.next = new Node<>(40);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Node<Integer> head1 = prepareLinkedList();
		printLinkedList(head1);
		
		Node<Integer> head2 = prepareLinkedList();
		printLinkedList(head2);
		
		if(head1.data.compareTo(head2.data)<0){
			
		}
		if(head1.data>head2.data){
			
		}

	}

}
