package priorityQueue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new MaxPriorityQueue<Integer>();
		
		queue.add(10, 10);
		queue.add(6, 6);
		queue.add(8887, 8887);
		queue.add(3, 3);
		queue.add(22, 22);
		while(queue.size()+1!=0){
		System.out.println(queue.remove());
		}
		
	}
}
