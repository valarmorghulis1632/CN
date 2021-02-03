package stackandqueues.queueusinglinkedlist;

public class QueueUsingLinkedList<T> {
	Node<T> front;
	Node<T> rear;
	int size;

	public QueueUsingLinkedList() {
		front = null;
		rear = null;
		size = 0;
	}

	public void enqueue(T data) {
		Node<T> nyaNode = new Node<>(data);
		if (front == null) {
			front = nyaNode;
			rear = nyaNode;
		} else {
			rear.next = nyaNode;
			rear = rear.next;
		}
		size++;
	}

	public T dequeue() throws QueueUnderFlowException {
		if (front == null) {
			throw new QueueUnderFlowException();
		}
		Node<T> temp = front;
		front = front.next;
		size--;
		return temp.data;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0 ? true : false;
	}
	
	public void printQueue(){
		Node<T> temp = front;
		while(temp!=null){
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
	}
}
