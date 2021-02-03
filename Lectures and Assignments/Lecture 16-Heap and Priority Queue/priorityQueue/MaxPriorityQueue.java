package priorityQueue;

public class MaxPriorityQueue<T> extends PriorityQueue<T> {

	@Override
	void shiftUp(int index) {
		int parentIndex = getParentIndex(index);

		if (parentIndex != -1
				&& heap.get(parentIndex).priority < heap.get(index).priority) {
			swap(index, parentIndex);
			shiftUp(parentIndex);
		}
	}

	@Override
	void shiftDown(int index) {

		int leftIndex = getLeftIndex(index);
		int rightIndex = getRightIndex(index);
		int highestPriority = -1;
		if (leftIndex != -1 && rightIndex != -1) {
			if (heap.get(leftIndex).priority > heap.get(rightIndex).priority) {
				highestPriority = leftIndex;
			} else {
				highestPriority = rightIndex;
			}
		}
		else if(leftIndex!=-1){
			highestPriority = leftIndex;
		}
		
		if(highestPriority!=-1){
			if(heap.get(highestPriority).priority>heap.get(index).priority){
				swap(index,highestPriority);
				shiftDown(highestPriority);
			}
		}

	}



}
