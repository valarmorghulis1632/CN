package stackandqueues;

public class StackUsage {
	public static void main(String[] args) {
		OurStack myStack = new OurStack();
		try {
			myStack.push(5);
			myStack.push(6);
			myStack.push(7);
			myStack.push(8);
			myStack.push(9);
	
			while(!myStack.isEmpty()){
				System.out.println(myStack.pull());
			}
			
			
			
			
		} catch (MyStackOverFlowException e) {
			
		}
	}
}
