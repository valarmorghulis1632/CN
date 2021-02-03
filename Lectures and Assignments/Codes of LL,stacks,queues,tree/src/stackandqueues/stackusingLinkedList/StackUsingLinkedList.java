package stackandqueues.stackusingLinkedList;

public class StackUsingLinkedList {

	private Node top ;
	int size;
	public StackUsingLinkedList() {
		top =null;
	}
	
	public void push(int data){
		Node newNode = new Node(data);
		if(top==null){
			top =newNode;
			return;
		}
		newNode.next = top;
		top = newNode;
		size++;
	}
	
	public int pop(){
		Node temp = top;
		top = top.next;
		size--;
		return temp.data;
	}
	
	
	
	
	
	peek(){
		
	}
	isEmpty(){
		
	}
}
