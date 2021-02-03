package genericTree;

import java.util.LinkedList;

public class StackUsingJavaLinkedList<T> {

	LinkedList<T> dataList;
	
	void push(T data){
		dataList.addFirst(data);
	}
	
	T pop(){
		return dataList.removeFirst();
	}
}
