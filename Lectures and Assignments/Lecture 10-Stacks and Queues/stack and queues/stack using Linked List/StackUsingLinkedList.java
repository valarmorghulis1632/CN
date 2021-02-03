package stackandqueues.stackusingLinkedList;

public class StackUsingLinkedList {

	private Node top ;
	int size;
	public StackUsingLinkedList() {
		top =null;
	}
	
	push(int data){
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
		size++;
	}
	
	pop(){
		
		size--;
	}
	peek(){
		
	}
	isEmpty(){
		
	}
}
