package priorityQueue;

import java.util.ArrayList;

public abstract class PriorityQueue<T> {
	ArrayList<PriorityNode<T>> heap;
	final static int MAX_SIZE = 10;

	PriorityQueue() {
		this.heap = new ArrayList<>();
	}
	T remove() {
		T data = heap.get(0).data;
		heap.set(0, heap.get(size()));
		heap.remove(size());
		shiftDown(0);
		return data;
	}
	
	 void swap(int index, int highestPriority) {
		PriorityNode<T> node = heap.get(index);
		heap.set(index, heap.get(highestPriority));
		heap.set(highestPriority, node);
	}
	
	int getLeftIndex(int index){
		int leftIndex = 2*index+1;
		if(leftIndex>size()){
			return -1;
		}
		return leftIndex;
	}
	int getRightIndex(int index){
		int rightIndex = 2*index+2;
		if(rightIndex>size()){
			return -1;
		}
		return rightIndex;
	}
	
	
	
	int size() {
		return heap.size() - 1;
	}
	public void add(T data, int priority) {
		PriorityNode<T> newNode = new PriorityNode<>(data, priority);
		heap.add(newNode);
		shiftUp(size());
	}
	abstract void shiftUp(int index);
	abstract void shiftDown(int index);
	
	
	int getParentIndex(int index){
		return (index-1)/2;
	}
}
