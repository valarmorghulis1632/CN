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

		if (startIndex == dataArray.length - 1) {
			throw new MyStackOverFlowException();
		}

		dataArray[++startIndex] = data;
	}

	int pull() throws MyStackUnderFlowException {
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
