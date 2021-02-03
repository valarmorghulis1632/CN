package stackandqueues;

class MyStackOverFlowException extends RuntimeException {

}

class MyStackUnderFlowException extends RuntimeException {

}

public class OurStack {
	private int[] dataArray;

	private int startIndex;

	public OurStack() {
		startIndex = -1;
		dataArray = new int[10];
	}

	public OurStack(int size) {
		startIndex = -1;
		dataArray = new int[size];
	}

	void push(int data) throws MyStackOverFlowException {
System.out.println("PUSH");
		if (startIndex == dataArray.length - 1) {
			// throw new MyStackOverFlowException();
			grow();
		}

		
		dataArray[++startIndex] = data;
	}

	private void grow() {
		int[] temp = dataArray;
		dataArray = new int[dataArray.length * 2];
		for(int i=0;i<temp.length;i++){
			dataArray[i] = temp[i];
		}
		System.out.println("Grow  "+temp.length+"  "+dataArray.length);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	int pull() throws MyStackUnderFlowException {
		System.out.println("PULL");
		if (startIndex == -1) {
			throw new MyStackUnderFlowException();
		}
		int temp = dataArray[startIndex--];
		return temp;
	}

	boolean isFull() {
		return startIndex == dataArray.length - 1 ? true : false;
	}

	boolean isEmpty() {
		return startIndex == -1 ? true : false;
	}

	int peek() throws MyStackUnderFlowException {
		if (startIndex == -1) {
			throw new MyStackUnderFlowException();
		}
		return dataArray[startIndex];
	}

	int size() {
		return startIndex + 1;
	}
}
