package priorityQueue;

public class PriorityNode<T> {
	T data;
	int priority;
	public PriorityNode(T data, int priority) {
		this.data = data;
		this.priority = priority;
	}
}
