package stackandqueues.queueusingArray;

public class QueueUsingArray {

	int[] dataArray;
	int size;
	int front;
	int rear;

	public QueueUsingArray() {
		size = 0;
		rear = -1;
		front = -1;
		dataArray= new int[10];
	}
	
	public void enqueue(int data) throws QueueFullException{
		if(size==dataArray.length){
			throw new QueueFullException();
		}
		if(size==0){
			front = front+1;
		}
		rear = (rear+1)%dataArray.length;
				
		dataArray[rear] = data;
		size++;
	}
	
	public int dequeue() throws QueueEmptyException{
		if(size==0){
			throw new QueueEmptyException();
			//grow();
			
		}
		
		int temp = dataArray[front];
		front = (front+1)%dataArray.length;
		size--;
		if(size==0){
			front =-1;
			rear=-1;
		}
		return temp;
	}
	
	
	
	
	
	
	
}
